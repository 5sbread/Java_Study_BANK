<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
	<h1>Board Update Page</h1>

	<form action="./board/update.bh" method="get">
		<input type="hidden" name="boardIndex" readonly="readonly" value="${dto.boardIndex}">
		<input type="hidden" name="boardName" readonly="readonly" value="${dto.boardName}">
		<input type="hidden" name="boardDate" readonly="readonly" value="${dto.boardDate}">
		<input type="hidden" name="boardView" readonly="readonly" value="${dto.boardView}">

		<div>
			Title : <input type="text" name="boardTitle" value="${dto.boardTitle}">
		</div>
		
		<div>
			Main : <input type="text" name="boardMain" value="${dto.boardMain}">
		</div>	
		
		<imput type="submit" value="수정">
		<button type="submit">수정</button>	
	</form>	
		
		
</body>
</html>