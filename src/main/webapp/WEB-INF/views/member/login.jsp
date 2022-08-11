<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

    <h1>Login Page</h1>
<hr>
	<form action="./login" method = "POST">

	<div class = "container">
	ID <input type="text" name ="id" placeholder="아이디"><br>
	PW <input type="password" name ="pw" placeholder="비밀번호"> <input type="submit" value="로그인">
	
	</div>
	<hr>
	<input type="button" value="아이디 찾기"> <input type="button" value="비밀번호 찾기"> <a href="/member/join">회원가입</a>
	<br> <br>
	
	<!--<img src="/workspace_legacy/Front/html/images/cute.png">-->
</form>
</body>
</html>