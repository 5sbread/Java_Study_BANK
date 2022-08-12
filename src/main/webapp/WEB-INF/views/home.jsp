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
	<a href="./member/login.bh">Login</a>
	<a href="./member/join.bh">Join</a>
</c:if>

<c:if test="${not empty member}">
	<h3>님 환영합니다!</h3>
	<a href="./member/logout.bh">Logout</a>
	<a href="#">My Page</a>
</c:if>

	<a href="./bankbooklist.bh">상품리스트</a>
	
	<a href="./update.iu?BookNum=${dto.BookNum}">수정</a>
	<a href="./delete.iu?BookNum=${dto.BookNum}">삭제</a>
	
<c:if test="${not empty sessionScope. }"></c:if>	
	<a href="?bookNum=${dto.bookNum }">가입하기</a>


<!-- 
<a href="./bankbook/detail?booknum=1">Detail</a>
<a href="./bankbook/add">상품 등록</a> -->

</body>
</html>
