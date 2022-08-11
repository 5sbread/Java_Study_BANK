<%@page import="com.bh.start.bankBook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--
	<%
		//요청이 발생하면 생성, 응답이 나가면 소멸 : Request
		BankBookDTO bankBookDTO = (BankBookDTO)request.getAttributeNames();
	%>    
--%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Bank detail</h1>


<%--	<% if(BankBookDTO != null) {%>
			<!-- 상대 -->
			<a href="../member/login">Login</a>
			<!-- 절대 -->
			<a href="/member/join">join</a>
--%>

		<table border="1">
			<tr>
				<th>Num</th>
				<th>Name</th>
				<th>Rate</th>
				<th>Sale</th>
			</tr>
			<tr>
				<td>${requestScope.dto.getBookName}</td>
				<td>${trquestScope.dto.bookNum}</td>
				<td>${dto.bookRate }</td>
<%--			<td><%= bankBookDTO.getBookNum() %></td>
				<td><%= bankBookDTO.getBookName() %></td>
				<td><%= bankBookDTO.getBookRate() %></td> --%>


<%--
					<% if(bankBookDTO.getBookSale()==1){ %>
						판매 중
					<%	}else{ %>
						안팔아요
					<%} %>
				</td>
			</tr>
		</table>

		<%}else {%>
			<h3>NO DATA</h3>
		<%} %>	
--%>


	<a href="./bankbook/detail"></a>
	<a href=""></a>

	<a href="../member/login">Login</a>
	<a href="/member/join">Join</a>
	<a href="./list">리스트보기</a>
	<a href="./update">수정</a>



</body>
</html> 