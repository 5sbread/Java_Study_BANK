<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail</title>
</head>
<body>

	<h1>Board Detail Page</h1>
	
	<table border="1">
		<tr>
			<th>Index</th>
			<th>Title</th>
			<th>Name</th>
			<th>Date</th>
			<th>View</th>
		</tr>
		
		<tr>
			<td>${requestScope.dto.getBoardIndex()}</td>
			<td>${requestScope.dto.getTitle()}</td>
			<td>${requestScope.dto.getName()}</td>
			<td>${requestScope.dto.getDate()}</td>
			<td>${requestScope.dto.getView()}</td>
		</tr>	
	</table>
	
	<a href="./list.bh">리스트 보기</a>

</body>
</html>