package com.nt.pack1;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class RegisterServlet
 */
//@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    Connection con;
	public void init(ServletConfig config) throws ServletException 
	{
	 	try {
			
			
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL",
			  "system","siva");
			 
			/*
			 * ServletContext sc=config.getServletContext();
			 * 
			 * String s11=config.getInitParameter("driver"); String
			 * s22=config.getInitParameter("url"); String
			 * s33=config.getInitParameter("username"); String
			 * s44=config.getInitParameter("password"); Class.forName(s11);
			 * con=DriverManager.getConnection(s22,s33,s44);
			 */
				 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	
	}
    
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 try {
		String s1=request.getParameter("fname");
		 String s2=request.getParameter("lname");
		 String s3=request.getParameter("uname");
		 String s4=request.getParameter("pword");
		 PreparedStatement pstmt=con.prepareStatement("insert into NareshIt values(?,?,?,?)");
		 pstmt.setString(1,s1);
		 pstmt.setString(2,s2);
		 pstmt.setString(3,s3);
		 pstmt.setString(4,s4);
		 pstmt.executeUpdate();
		 PrintWriter pw=response.getWriter();
		 pw.println("<html><body bgcolor=green text=yellow>");
		 pw.println("<h1> you have registerd successfully </h1>");
		 pw.println("<a href=login.html>Login</a>");
		 pw.println("</body></html>");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	}

}
