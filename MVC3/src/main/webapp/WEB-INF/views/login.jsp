<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>

	<form:form action="register" modelAttribute="user">
		NAME: <form:input path="userName"/>
		EMAIL: <form:input path="email"/>
		
		<input type="submit"/>
	
	</form:form>
	<%-- <form action="register">
		Name: <input type="text" name="userName"> <br>
		Email: <input type="email" name="email"> <br>
		<input type="submit">
	</form> --%>
	
</body>
</html>