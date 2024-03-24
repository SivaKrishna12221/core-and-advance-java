<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Arithmetic jsp</title>
</head>
<body bgcolor=green  text=pink>
<h1>
<%@page contentType= "application/vnd.noteapad"%>
<%@page isElIgnored="true" %> 


<%@page errorPage="error.jsp"%>
<% 
String s1=request.getParameter("first");
String s2=request.getParameter("second");
int x=Integer.parseInt(s1);
int y=Integer.parseInt(s2);

int z=x/y;
out.println("output:"+z);

%>
</h1>
</body>
</html>