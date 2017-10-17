package system.wang.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import system.wang.common.InfoMessage;
import system.wang.domain.User;
import system.wang.service.UserService;
import system.wang.service.impl.UserServiceImpl;
import system.wang.utils.WebUtils;
import system.wang.web.formbean.LoginForm;

public class UserLoginServlet extends HttpServlet {

	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//TODO 对表单字段进行合法性校验
		LoginForm form = WebUtils.request2Bean(request, LoginForm.class);
		//TODO 校验失败，回显失败信息
		if(!form.isValid()){
			request.setAttribute("form", form);
			request.getRequestDispatcher("/WEB-INF/jsp/UserLogin.jsp").forward(request, response);
			return;
		}
		UserService service = new UserServiceImpl();
		User user = service.login(form.getUsername(), form.getPassword());
		if(null == user){
			request.setAttribute("message", InfoMessage.USER_PASSWORD_ERROR);
			request.getRequestDispatcher("/WEB-INF/jsp/UserLogin.jsp").forward(request, response);
			return;
		}
		request.setAttribute("message", InfoMessage.USER_LOGIN_SUCCESS);
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}

}
