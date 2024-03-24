<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>error page</title>
</head>
<body bgcolor=yellow text=blue>
<h1>
<%@page isErrorPage="true"%>
<%out.println("Please pass second number except zero"); %>

</h1>

</body>
</html>