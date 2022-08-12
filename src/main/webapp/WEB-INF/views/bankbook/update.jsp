<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<h1>BAKBOOK UPDATE PAGE</h1>
	
	<form action="./update.bh" method="post">
		<input type="hidden" name="BookNum" readonly="readonly" value="${dto.BookNum}">
		<div>
			Name : <input type="text" name="BookName" value="${dto.BookName}">
		</div>
		<div>
			Rate : <input type="text" name ="BookRate" value="${dto.BookRate}">
		</div>
		
		<input type="submit", name="수정">
		<button type="submit">수정</button>
		
	</form>	
</body>
</html>