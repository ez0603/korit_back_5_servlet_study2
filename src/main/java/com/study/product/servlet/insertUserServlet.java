package com.study.product.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.product.dto.InsertProductReqDto;
import com.study.product.utils.RequestUtil;

@WebServlet("/user")
public class insertUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public insertUserServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InsertProductReqDto dto = RequestUtil.convertJsonData(request, InsertProductReqDto.class); // 메소드로 만들어놨기 때문에 호출만 해주면 됨
	}

}
