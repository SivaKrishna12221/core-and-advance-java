<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> page1 jsp</title>
</head>
<body bgcolor =yellow text=blue width=400 height=400>
<jsp:include page="header.jsp" />
<h2>
<u><%out.println("JSP:") ;%></u></h2>
<h3><%out.println("jsp stands for java server page or jakartha"); %>
<%out.println("server page .JSP is a specification for developing "); %>
<%out.println("web application with java programming language"); %></h3>

<jsp:include page="footer.jsp"/>
</body>
</html>