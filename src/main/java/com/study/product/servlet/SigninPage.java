package com.study.product.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.product.dto.UserDto;


@WebServlet("/signin.do")
public class SigninPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SigninPage() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDto dbUser = UserDto.builder()
				.username("test")
				.password("1234")
				.name("김준일")
				.email("skjil1218@kakao.com")
				.build();
		
		request.getServletContext().setAttribute("dbUser", dbUser);
		
		request.getRequestDispatcher("/WEB-INF/views/signin.html").forward(request, response);
	}

}
