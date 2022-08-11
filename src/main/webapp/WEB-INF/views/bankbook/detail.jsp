<%@page import="com.bh.start.bankBook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	BankBookDTO bankBookDTO = (BankBookDTO)request.getAttributeNames();
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Bank detail</h1>

	<% if(bankBookDTO != null) {%>

	<!-- 상대 -->
	<a href="../member/login">Login</a>
	<!-- 절대 -->
	<a href="/member/join">join</a>
		<table border="1">
			<tr>
				<th>Num</th>
				<th>Name</th>
				<th>Rate</th>
				<th>Sale</th>
			</tr>
			<tr>
				<td><%= bankBookDTO.getBookNum() %></td>
				<td><%= bankBookDTO.getBookName() %></td>
				<td><%= bankBookDTO.getBookRate() %></td>
				<td>
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

	<a href="./bankbook/detail"></a>
	<a href=""></a>



</body>
</html> 