package com.study.product.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SignUp")
public class SignUpPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SignUpPage() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		application.setAttribute("key", "value(object)");
		//페이지의 모든 설정, 전역저장소
		//jsp에서는 application으로 뜨나 객체는 ServletContext이다
		
		request.setAttribute("key", "value(object)");
		// request의 setAttribute와 request의 ServletContext의 setAttribute은 다르다.
		// 키로 jsp에 값 전단         
		
		HttpSession httpSession =  request.getSession();
		httpSession.setAttribute("key", "value(object)");
		//요청을 받았을 때 세션아이디를 생성 response 쿠키에 세션아이디를 저장 세션아이디가 있다면 저장소에 접근가능
		httpSession.setMaxInactiveInterval(1000 * 60 *60);//1000당 1초
		// 우선순위 존재
		// request : 
		
		request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
		//jsp로 변환해준다. 자바코드는 모두 서블릿에다가 저장
	}


}