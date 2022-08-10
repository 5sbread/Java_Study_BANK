<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Main Page
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="./member/login">Login</a>
<a href="./member/join">Join</a>
<a href="./bankbook/detail?booknum=1">Detail</a>
<a href="./bankbook/add">상품 등록</a>

</body>
</html>
