package kr.gudi;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet");
		getParam(req);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost");
		req.setCharacterEncoding("UTF-8");
		getParam(req);
		
	}
	///post방식을 쓰려면 주소를 보낼 새로운 화면이 필요하다. get방식은 그냥 쓰면 된다 참고로.
	void getParam(HttpServletRequest req) {
		Enumeration<String> names = req.getParameterNames();
		while (names.hasMoreElements()) {
			String paramName = (String) names.nextElement();
			String value = req.getParameter(paramName);
			System.out.println(paramName + " : " + value);
		}
	}
}
