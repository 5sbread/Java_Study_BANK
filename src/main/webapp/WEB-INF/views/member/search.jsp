<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
</head>
<body>

		<h1>Member Search Form Page</h1>
		
		<!-- action : 요청할 url 주소를 적기 -->
		<form action="search" method="post">
			<!-- form 태그 바깥에 선언하면 고유 기능 비활성화 (버튼이 안눌러짐) -->
			<input type="text" name="search">
						  <!-- name = 파라미터 이름 -->
			<input type="button" value="search">
			<input type="reset" value="resut">
			<input type="submit" value="submit">
			<button type="submit">button</button>
			<!-- ㄴ 타입 생략시 기본은 submit -->
		</form>
		
		<form action="./search.bh" method="post">
			<input type="text" name="">
			<button type="submit">Search</button>
		</form>

</body>
</html>