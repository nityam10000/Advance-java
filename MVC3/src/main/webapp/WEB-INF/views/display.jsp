<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>DELETE</th>
			<th>UPDATE</th>
		</tr>
		<c:forEach var="u" items="${list}">
			<tr>
				<td>${u.userId}</td>
				<td>${u.userName}</td>
				<td>${u.email}</td>
				<td><a href="delete?userId=${u.userId}">DELETE</a></td>
				<td><a href="update">UPDATE</a></td>
			</tr>
		</c:forEach>
	
	</table>
	<%-- <h1>Name: ${username}</h1>
	<h1>Email: ${email}</h1> --%>
</body>
</html>