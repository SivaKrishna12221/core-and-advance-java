<html>
<body bgcolor=green text=orange>
<h1>
<% String s1=request.getParameter("first");
   String s2=request.getParameter("second");
   int x=Integer.parseInt(s1);
   int y=Integer.parseInt(s2);
   int z=x/y;
   out.println("output:"+z);%>
</h1>
</body>
</html>