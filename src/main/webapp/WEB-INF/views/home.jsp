<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Main Page
</h1>

<P>  The time on the server is ${serverTime}. </P>

<c:if test="${empty member}">
	<a href="./member/login">Login</a>
	<a href="./member/join">Join</a>
</c:if>

<c:if test="${member}">
	<a href="#">Logout</a>
	<a href="#">My Page</a>
</c:if>
<br>

<a href="./bankbook/detail?booknum=1">Detail</a>
<a href="./bankbook/add">상품 등록</a>
<a href="./bankbook/update">수정</a>
<a href="./bankbooklist">상품리스트</a>

</body>
</html>
