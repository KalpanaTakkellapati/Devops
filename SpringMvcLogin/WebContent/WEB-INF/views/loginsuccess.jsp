<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome <core:out value="${loginForm.userName}" /></h3>

<table>

<tr>

<td><a href="loginform.html">Back</a></td>

</tr>

</table>
</body>
</html>