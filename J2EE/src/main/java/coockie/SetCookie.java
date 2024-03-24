package com.nt.coockie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SetCookie extends HttpServlet
{
  public void doGet(HttpServletRequest request,HttpServletResponse response)
  {
	  try {
		String s1=request.getParameter("product1");
		  String s2=request.getParameter("product2");
		  String s3=request.getParameter("product3");
		  String s4=request.getParameter("product4");
		  if(s1!=null)
		  {
			 Cookie c1=new Cookie("product1",s1);
			 response.addCookie(c1);
		  }
		   if(s2!=null)
		  {
			  Cookie c2=new Cookie("product2",s2);
			  response.addCookie(c2);
		  }
		   if(s3!=null)
		  {
			  Cookie c3=new Cookie("product3",s3);
			  response.addCookie(c3);
		  }
		   if(s4!=null)
		  {
			  Cookie c4=new Cookie("product4",s4);
			  response.addCookie(c4);
		  }
		  PrintWriter pw=response.getWriter();
		  pw.println("<html><body bgcolor=yellow  text=blue><center><h1> ");
		  pw.println("your products are added to cookies");
		  pw.println("<a href=get>next</a>");
		  pw.println("</h1><center></body></html>");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
}
