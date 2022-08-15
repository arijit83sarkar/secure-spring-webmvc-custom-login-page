<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home - Spring Security Implementation</title>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	margin: 0;
}

.header {
	padding: 60px;
	text-align: center;
	background: #1abc9c;
	color: white;
	font-size: 30px;
}

.content {
	padding: 20px;
}
</style>
</head>
<body>
	<div class="header">
		<h1>Spring Security</h1>
		<p>Welcome to Spring Security implementation with custom Login
			page!</p>
	</div>

	<div class="content">
		<h1>Content</h1>
		<p>Some content bla bla bla, some content bla bla bla.</p>
		<p>
			<form:form action="${pageContext.request.contextPath}/logout"
				method="POST">
				<input type="submit" value="LOGOUT">
			</form:form>
		</p>
	</div>
</body>
</html>