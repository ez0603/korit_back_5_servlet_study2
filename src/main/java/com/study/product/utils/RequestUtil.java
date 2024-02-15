package com.study.product.utils;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;

public class RequestUtil {
	
	public static String getJsonData(HttpServletRequest request) throws IOException {
		String requestJsonDate = null;
		StringBuilder builder = new StringBuilder();
		
		BufferedReader reader = request.getReader();
		
		String readLineData = null;
		
		while((readLineData = reader.readLine()) != null) {
			builder.append(readLineData);
		}
		
		requestJsonDate = builder.toString();
		
		return requestJsonDate;
	}
	
	// 메소드로 한번에 빼줌(재사용 용의)
	public static <T> T convertJsonData(HttpServletRequest request, Class<T> classofT) throws IOException { // <T> = 타입 지정 리턴타입 = T, Class<T> = InsertProductReqDto 클래스로 바뀜
		String requestJsonDate = null;
		StringBuilder builder = new StringBuilder();
		
		BufferedReader reader = request.getReader();
		
		String readLineData = null;
		
		while((readLineData = reader.readLine()) != null) {
			builder.append(readLineData);
		}
		
		requestJsonDate = builder.toString();
		
		Gson gson = new Gson(); // Class<T> classofT = gson을 쓰기 위해서 매개변수로 넣어줌
		
		return gson.fromJson(requestJsonDate, classofT);
	}
		
}
