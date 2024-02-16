<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%//taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<%
	//서버사이드 랜더링
	//검색 엔진 최적화(SEO): 검색 엔진은 HTML을 읽고 인덱싱하는데 능하므로, SSR을 사용하면 검색 엔진 최적화에 유리합니다.

	//클라이언트사이드 랜더링
	
	// 스크립트릿
	//자바 문법을 사용하게 해준다.
	//JSTL: 자주 사용되는 일련의 태그들의 모음
	//model2 스크립트릿을 위에 모아둔다.
	//mvc: model view controller
	//model : 데이터
	//view : html(화면)
	//controller: model, view 를 제어, 요청, 응답 처리 -> servlet
	
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
		<c:forEach var="i" begin="0" end="10">
			<li>${i}</li>
		</c:forEach>
	</ul>
	<div>
	<%//model1 필요할 때마다 스크립트릿을 삽입
		String inputValue = "test";
	%>
		<input value="<%=inputValue%>">
	</div>
</body>
</html>






