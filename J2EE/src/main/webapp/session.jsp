<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>default sessions</title>
</head>
<body bgcolor=yellow text=blue>
 <h1>
 <%@page import="java.util.*" %>
 <%@page session="true" %>
 <%--if we assign false to session we can't access the session tracking --%>
 
 Session Id:<%out.println(session.getId()); %><br>
 creation Time:<%out.println(new Date(session.getCreationTime())) ;%><br>
 
 LastAccessedTime:<%out.println(new Date(session.getLastAccessedTime())); %>
 <%out.println("include directives"); %><br>
 
 <%@include file="first.jsp"%><br>
 <%@include file="multiplication.jsp" %>
 
 <%--tag lib directives --%>
 
 
 </h1>
</body>
</html>