<%@page import="com.bh.start.bankBook.BankBookDTO"%>
<%@page import java.util.ArrayList; %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//스크립틀릿 <% Java code 작성 %>
%>
<%	
	//표현식 <%= 자바변수 또는 값 %>
	//왜 이걸 안쓰게 되는지?
	//리턴 꺼내올 때 Object 타입으로 나오기 때문에 다형성으로 ArrayList 타입을 앞에 적어줘야 함
	ArrayList<BankBookDTO> ar = (ArrayList<BankBookDTO>)request.getAttribute("list");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BankBook List</title>
</head>
<body>

	<h1>bankBook list</h1>
	<!-- /bankbook/list -->
	
	<!-- /book/detail jsp:derail.jsp -->
	<!-- link 주소는 상대경로 작성 -->
	<!-- 이 페이지의 URL 주소를 보고 경로 결정 -->
	<!--  <a href="./detail">Detail</a> 이렇게도 가능 -->

	<table border="1">
		<thead>
			<tr>
				<th>Name</th><th>Rate</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td><a href="./detail.iu?bookNum=${dto.bookNum}">${dto.bookName}</a></td>
					<td>${dto.bookRate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<a href="./add.bh">상품 등록</a>

</body>
</html>