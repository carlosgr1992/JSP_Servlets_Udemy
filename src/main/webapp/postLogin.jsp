<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PostLogin</title>
</head>
<body>

	<h1>POST LOGIN.JSP</h1>

	<%
	out.println("Tu usuario es " + request.getParameter("usuario"));
	out.println("Tu contraseña es " + request.getParameter("contrasena"));
	%>

</body>
</html>