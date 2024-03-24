	package com.nt.coockie;

import java.io.IOException;
import java.io.PrintWriter

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get
 */

public class Get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Get() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 PrintWriter pw=response.getWriter();
	 String s1=request.getParameter("p1");
	 String s2=request.getParameter("p2");
	 String s3=request.getParameter("p3");
	 String s4=request.getParameter("p4");
	 pw.println("<html><body bgcolor=green text=blue");
	 pw.println("<center><h1>your selected products are:");
	 if(!(s1.equals("null")))
	 {
		 pw.println(s1+"<br>");
	 }
	 if(!(s2.equals("null")))
	 {
		 pw.println(s2+"<br>");
	 }
	 if(!(s3.equals("null")))
	 {
		 pw.println(s3+"<br>");
	 }
	 if(!(s4.equals("null")))
	 {
		 pw.println(s4+"<br>");
	 }
	 pw.println("</h1></center></body></html>");
	}
   
}
