<html>
<body bgcolor=yellow text=blue>
<h1>
<%!java.sql.Connection con; 
 public void jspInit()
 {try{
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 con=java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
	 
 }catch(Exception e)
 {
	 e.printStackTrace();
 }
 }
%>
<% String s1=request.getParameter("uname") ;
   String s2=request.getParameter("pword");
    java.sql.PreparedStatement pstmt=con.prepareStatement("select * unifo where uname=? and pword=?");
    pstmt.setString(1,s1);
    pstmt.setString(2,s2);
    java.sql.ResultSet rs=pstmt.executeQuery();
    
   if(rs.next())
	   out.println("welcome "+s1);
	
   else
	   out.println("invalid  username/password");
   
   %>
   <%! public void jspDestroy()
   { try
   {
	   con.close();
	   
   }
   catch(Exception e)
   {
	   e.printStackTrace();
   }
   }
   %>
   
</h1>

</body>
</html>