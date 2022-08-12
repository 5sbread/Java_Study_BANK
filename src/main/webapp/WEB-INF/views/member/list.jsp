<%@page import="com.bh.start.bankBook.BankBookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@tiglib uri ="" %>    
    
    
<%
	ArrayList<BankBookDTO> ar = (ArrayList<BankBookDTO>)request.getAttribute("list");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member List Page</h1>
	
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>				
				<th>Phone</th>
			</tr>			
		</thead>
	
		<tbody>
			<c:forEach begin="10" end="0" var="i" step="-1">
				<h3>${pageSchope.1}</h3>
				</c:forEach>
				
				<c:forEach items = "${requestScope.list}" var="dto">
					<tr>
						<td>${pageSope.dto.username}</td>
						<td>${pageScope.dto.name}</td>
						<td>${pageScope.dto.Email}</td>
						<td>${pageScope.dto.Phone}</td>
					</tr>
				</c:forEach>
			
<%--	<% for(BankMembersDTO bankMembersDTO:ar){ %>
	 			<tr>
				<td><%= bankMembersDTO.getUsername() %> </td>
				<td><%= bankMembersDTO.getName() %> </td>
				<td><%= bankMembersDTO.getEmail() %> </td>
				<td><%= bankMembersDTO.getPhone() %> </td>
			</tr>
			<%} %> --%>
			
		</tbody>
	</table>

</body>
</html>