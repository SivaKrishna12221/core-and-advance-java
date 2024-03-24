package com.nt.coockie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetCookie extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter pw = response.getWriter();
			pw.println("<html><body bgcolor=orange text=blue><center><h1>");
			pw.println("your selected products are :<br>");
			Cookie c[] = request.getCookies();
			for (Cookie c2 : c) {
				pw.println(c2.getValue() + "<br>");
			}
			pw.println("</h1></center></body></html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
