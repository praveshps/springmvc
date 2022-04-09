<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<h1>This is help page</h1>
	<h1>Called by help controller</h1>
	<h1>url /home</h1>

	<%
	//String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("roll");
	%>

	<h1>
		My name is
		${name}
		<%--<%=//name--%></h1>
	<h1>
		Id is
		<%=id%></h1>
</body>
</html>