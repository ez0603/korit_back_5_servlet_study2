package com.study.product.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class ResponseEntitiy {
	public static <T> void ofJson(HttpServletResponse response, int status, T body) throws IOException { // body에 map이 들어왔기 때문에 <T> = map
		Gson gson = new Gson();
		response.setStatus(status);
		response.setContentType("application/json");
		response.getWriter().println(gson.toJson(body));
	}
	
}
