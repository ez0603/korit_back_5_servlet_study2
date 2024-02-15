package com.study.product.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.lang.model.element.ModuleElement.ProvidesDirective;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.study.product.dao.ProductDao;
import com.study.product.dto.InsertProductReqDto;
import com.study.product.service.ProductService;
import com.study.product.utils.RequestUtil;
import com.study.product.utils.ResponseEntitiy;
import com.study.product.vo.Product;


@WebServlet("/product")
public class InsertProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductService productService; //
       
   
    public InsertProductServlet() {
        super();
        productService = ProductService.getInstance(); //
      
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InsertProductReqDto reqDto = RequestUtil.convertJsonData(request, InsertProductReqDto.class); // convertJsonData = 대입할 대상을 따라감(InsertProductReqDto)
		
		if(productService.isDuplicatedProductName(reqDto.getProductName())) { // 중복체크 메소드의 if문
			Map<String, Object> responseMap = new HashMap<>();
			responseMap.put("errorMessage", "이미 등록된 상품명입니다.");
			
			ResponseEntitiy.ofJson(response, 400, responseMap);
			return;
		
	}
		ResponseEntitiy.ofJson(response, 201, productService.addProduct(reqDto));
	}
}
//	public <T> T test() {
//		T a = null; // 제네릭으로 쓰고싶을 때 
//		return a; // a가 T타입이기 때문에 리턴을 a로 해준다
//	}
//		
		
	
	// -------------------------------------------------------------------------------------------
	
//	
//		
//		StringBuilder builder = new StringBuilder();
//		
//		String readData = null;
//		
//		BufferedReader reader = request.getReader();
//		
//		while((readData = reader.readLine()) != null) {
//			builder.append(readData);
//		}
//		
//		Gson gson = new Gson();
//		
//		Product product = gson.fromJson(builder.toString(), Product.class);
//		
//		System.out.println(product);
//		
//		ProductDao productDao = ProductDao.getInstance();
//		
//		Product findProduct = productDao.findByNameProduct(product.getProductName());
//		
//		if(findProduct != null) {
//			Map<String, Object> errorMap = new HashMap<>();
//			errorMap.put("errorMessage", "이미 등록된 상품입니다.");
//			
//			response.setStatus(400);
//			response.setContentType("application/json");
//			response.getWriter().println(gson.toJson(errorMap));
//			return;
//		}
//		
//		int successCount = productDao.saveProduct(product);
//		
//		Map<String, Object> responseMap = new HashMap<>();
//		responseMap.put("status", 201);
//		responseMap.put("data", "저장완료");
//		responseMap.put("successCount", successCount);
//		
//		response.setStatus(201);
//		response.setContentType("application/json");
//		
//		response.getWriter().println(gson.toJson(responseMap));
//		
//		
//	}
//
//}
