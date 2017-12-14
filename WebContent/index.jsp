<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="springmvc/testServletIPI">Test ServletIPI</a>
	<br>
	<hr>
	<br>
	<form action="springmvc/testPojo" method="post">
		username:<input type="text" name="username">
		<br>
		password:<input type="password" name="password">
		<br>
		email:<input type="text" name="email">
		<br>
		age:<input type="text" name="age">
		<br>
		city:<input type="text" name="address.city">
		<br>
		province:<input type="text" name="address.province">
		
		<input type="submit" value="提交">
	</form>

	<br>
	<hr>
	<br>
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="PUT">
		<input type="submit" value="TestRest Put">
	</form>
	<br>
	<br>
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="DELETE">
		<input type="submit" value="TestRest Delete">
	</form>
	<br>
	<br>
	<form action="springmvc/testRest" method="post">
		<input type="submit" value="TestRest Post">
	</form>
	<br>
	<br>
	<a href="springmvc/testRest/1">TestRest Get</a>
	<br>
	<hr>
	<br>
	<a href="springmvc/testPathVariable/1">Test PathVariable</a>
	<br>
	<br>
	<a href="helloworld">Hello World</a>
	<br>
	<br>

	<a href="springmvc/testRequestMapping">Test RequestMapping</a>
	<br>
	<br>

	<form action="springmvc/testMethod" method="post">
		<input type="submit" value="submit">

	</form>
</body>
</html>