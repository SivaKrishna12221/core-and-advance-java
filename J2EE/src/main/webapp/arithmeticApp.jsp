
<html>

<body>
<%String s=request.getParameter("operation"); 
if(s.equals("addition")){%>
< jsp:forward page="add.jsp"/>

<%}else if(s.equals("substraction")){%>

< jsp:forward page="sub.jsp"/>

<%}else if(s.equals("multiplication")){%>

<jsp:forward page="mul.jsp"/>

<%}else {%>

<jsp:forward page="div.jsp"/>
<%} %>



</body>
</html>