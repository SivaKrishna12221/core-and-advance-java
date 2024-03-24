<html>
<body bgcolor=yellow text =blue>
<h1>
<%String s1=request.getParameter("first");
  String s2=request.getParameter("second");
  int x=Integer.parseInt(s1);
  int y=Integer.parseInt(s2);
  int w=x-y;
  out.println("output:"+w);
%>
</h1>
</body>
</html>