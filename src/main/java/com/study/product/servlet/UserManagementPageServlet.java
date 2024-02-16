package com.study.product.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/auth/signup.do")
public class UserManagementPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UserManagementPageServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String html = null;
		
		String name = "김준일";
		
		StringBuilder builder = new StringBuilder();
		builder.append("<html>");
			builder.append("<head>");
				builder.append("<title>회원가입페이지노가다</title>");
			builder.append("</head>");
			builder.append("<body>");
				builder.append("<h1></h1>");
			builder.append("</body>");
		builder.append("</html>");
		
		html = builder.toString();
		
		response.setContentType("text/html");
		response.getWriter().println(html);
	}

}
