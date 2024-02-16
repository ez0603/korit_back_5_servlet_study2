<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
<%
//WEB-INF파일은 외부에서 접근 불가 서블릿을 통해 접근
//servlet은 src(자바리소스코드)에 들어가고 jsp는 일반 파일이다.
//자바코드 대신 표현식만 사용

//내장 객체
//request,application,session 
//저장소
//application 객체 저장소
//생명주기 서버가 켜지고 꺼질 때 까지 저장공간이 살아있다.
//request 객체 저장소
//생명주기 요청이 들어오고 응답할 때 까지 저장공간이 살아있다.
//session 객체 저장소
//생명주기 서버가 켜지고 꺼질때 까지 혹은 세션만료시간까지 저장공간이 살아있다.
//tomcat-was-project(java로 구현)
//C에서 loacalhost:8080 
String value = (String) request.getAttribute("key");
	//object 타입이기에 다운캐스팅 필요

//절대경로 root - webapp에서 시작

//
%>
</head>
<body>
<h2><%=value %></h2>
<input type="text"placeholder="username">
<input type="password"placeholder="password">
<input type="text"placeholder="name">
<input type="text"placeholder="email">
<button onclick="handleSignUpSubmit()">회원가입</button>
<img src="/Product/hellotest/image.png">
<script src="/Product/static/js/signUp.js"></script>
</body>
</html>