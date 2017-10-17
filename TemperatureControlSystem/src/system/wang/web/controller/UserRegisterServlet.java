package system.wang.web.controller;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import system.wang.common.InfoMessage;
import system.wang.domain.User;
import system.wang.exception.UserExistException;
import system.wang.service.UserService;
import system.wang.service.impl.UserServiceImpl;
import system.wang.utils.WebUtils;
import system.wang.web.formbean.RegisterForm;


public class UserRegisterServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		if(!isTokenValid(req)){
			OutputStream out = resp.getOutputStream();
			out.write(InfoMessage.WARNING_STR.getBytes());
			return;
		}
		req.getSession().removeAttribute("token");
		
		//TODO 对表单字段进行合法性校验
		RegisterForm form = WebUtils.request2Bean(req, RegisterForm.class);
		//TODO 校验失败，回显失败信息
		if(!form.isValid()){
			req.setAttribute("form", form);
			req.getRequestDispatcher("/WEB-INF/jsp/UserRegister.jsp").forward(req, resp);
			return;
		}
		
		//TODO 校验成功，则调用service层处理注册请求
		User user = new User();
		WebUtils.copyBean(form, user);
		UserService service = new UserServiceImpl();
		boolean flag = true;
		try {
			flag = service.register(user);
			
		} catch (UserExistException e) {
			req.setAttribute("message", InfoMessage.USER_EXIST);
			req.getRequestDispatcher("/WEB-INF/jsp/UserRegister.jsp").forward(req, resp);
			return;
		}catch(Exception e){
			req.setAttribute("message", InfoMessage.INNET_ERROR);
			req.getRequestDispatcher("/message.jsp").forward(req, resp);
			return;
		}
		if(!flag){
			req.setAttribute("message", InfoMessage.REGISTER_FAIL);
			req.getRequestDispatcher("/message.jsp").forward(req, resp);
			return;
		}
		req.setAttribute("message", InfoMessage.REGISTER_SUCCESS);
		req.getRequestDispatcher("/message.jsp").forward(req, resp);
		return;
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req,resp);
	}
	

	private boolean isTokenValid(HttpServletRequest req){
		boolean isValid = true;
		String client_token = req.getParameter("token");
		String service_token = (String) req.getSession().getAttribute("token");
		if(null == client_token || client_token.isEmpty() || null == service_token ||service_token.isEmpty()||!client_token .equals(service_token)){
			isValid = true;
		}
		return isValid;
	}
}
