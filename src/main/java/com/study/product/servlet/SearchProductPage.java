package com.study.product.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.product.service.ProductService;

@WebServlet("/products.do")
public class SearchProductPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductService productService;
       
    public SearchProductPage() {
        super();
        productService = ProductService.getInstance();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Model		=>	데이터 객체(setAttribute, getAttribute)
		// View			=>	HTML, JSP
		// Controller	=>	Servlet
		
		request.setAttribute("productList", productService.searchProducts());
		request.getRequestDispatcher("/WEB-INF/views/search.jsp").forward(request, response);
	}
}