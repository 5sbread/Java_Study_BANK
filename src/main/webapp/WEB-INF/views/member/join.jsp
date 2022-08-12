<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>: ̗̀ ♡ˎˊ:</title>
</head>
<body>

<h1>Join Page</h1>

<hr>
	<form action="./join.bh" method = "POST">
	<div>
	아이디 <br><input type="text" name="username"> <input type="button" value="중복확인"><br>
	<br>
	비밀번호 <br><input type="password" name="password"> <input type="button" value="비밀번호👀"><br>
	<br>
	비밀번호 다시입력 <br><input type="password"><br>
	</div>
	
	<div>
	    <br>
	    이름 <br><input type="text" name="name"><br>
	    번호 <br><input type="number" name="phone"><br>
	    이메일 <br><input type="email" name="email"><br>
	<br>
	    광고성 정보 수신 동의 <input type="checkbox" name="agree"><br>
	    개인정보 이용 동의 <input type="checkbox" name="agree"><br>
	    마케팅 문자 수신 동의 <input type="checkbox" name="agree"><br>
	</div>
	
	<div>
	    <hr>
	    <input type="button" value="작성취소">
	    <input type="submit" value="회원가입">
	</div>

<
</body>
</html>