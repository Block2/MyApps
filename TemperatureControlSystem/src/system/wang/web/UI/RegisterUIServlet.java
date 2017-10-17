package system.wang.web.UI;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import system.wang.utils.TokenProcessorUtil;

public class RegisterUIServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//产生随机数（表单号）防止表单重复提交
		String token = TokenProcessorUtil.getInstance().generateToken();
		request.getSession().setAttribute("token", token);
		request.getRequestDispatcher("/WEB-INF/jsp/UserRegister.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
}

