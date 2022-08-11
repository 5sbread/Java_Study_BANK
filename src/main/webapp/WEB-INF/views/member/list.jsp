<%@page import="com.bh.start.bankBook.BankBookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<thead>
		<tr>
			<th>ID</th>
			<th>PW</th>
			<th></th>

			<%BankBookDAO bankBookDAO = new BankBookDAO; %>
			<td><a href="./detail?bookNum"<%= bankBookDAO.getDetail(bankBookDTO);></a></td>

		</tr>




</body>
</html> 