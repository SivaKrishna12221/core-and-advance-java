<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page b jsp</title>
</head>
<body bgcolor="yellow" text="blue">
<jsp:include page="header.jsp"/>
<h1><u>jstl</u></h1>
<%out.println("JSTL stands for jsp standard tag library It is introduced in"); %>
<%out.println("in jsp 2.0 version to simplify the jsp") ;%>
<jsp:include page="footer.jsp"/>
</body>
</html>