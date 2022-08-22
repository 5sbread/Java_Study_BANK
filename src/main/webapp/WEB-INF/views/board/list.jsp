<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>LIST PAGE =O.O=</h1>

	<table>
		<thead>
			<tr>
				<th>Index</th>
				<th>Title</th>
				<th>Name</th>
				<th>Date</th>
				<th>View</th>
			</tr>
		</thead>		
		<tbody>
			<c:forEach begin="10" end="0" var="i" step="1">
				<h3>${pageScope.i}</h3>
			</c:forEach>
			
			<c:forEach items="${requstScope.list}" var="dto">
				<tr>
					<td>${pageScope.dto.boardIndex}</td>
					<td>${pageScope.dto.boardTitle}</td>
					<td>${pageScope.dto.boardName}</td>
					<td>${pageScope.dto.boardDate}</td>
					<td>${pageScope.dto.boardView}</td>
				</tr>		
			</c:forEach>	

		</tbody>
	</table>

</body>
</html>