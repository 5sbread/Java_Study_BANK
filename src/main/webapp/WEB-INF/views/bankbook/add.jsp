<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Page</h1>

	<form action="./add.bh" method="post">
		<div>
			Name : <inqut type="text" name="BookName">
		</div>
		<div>
			Rate : <input type="text" name="BookRate">
		</div>
		<div>

		<!-- 제줄하는 버튼 만드는 법 2가지 -->		
			<input type="submit" name="CREATE">
		<!--<button type="submit">Add</button>  -->
		</div>
	</form>



</body>
</html> 
