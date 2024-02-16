<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%
	//스크립트릿
	List<String> names = List.of("김준일", "김준이", "김준삼");	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello</h1>
	<ul>
		<% // 자바코드는 스크립트릿에서만 사용가능
			for(String name : names) {
		%>
				<li>${name}</li>
		<%
			}
		%>
	</ul>
</body>
</html>