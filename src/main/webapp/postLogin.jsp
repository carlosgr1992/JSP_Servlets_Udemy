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

	<h2>Sesion</h2>
	<%
	out.println("usuario: " + session.getAttribute("usuario") + " contraseña " + session.getAttribute("contrasena"));
	%>
	<br/>
	<h3>Request</h3>
	<%
	out.println("usuario: " + request.getParameter("usuario") + " contraseña: " + request.getParameter("contrasena"));
	%>
	<br/>
	<h4>Context</h4>
	<%
	out.println("usuario: " + application.getAttribute("usuario") + " contraseña " + application.getAttribute("contrasena"));
	
	%>
	
</body>
</html>