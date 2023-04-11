package com.simplilearn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudenServlet extends HttpServlet{
	@override
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("Start ******* doGet() ********");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.print("<html><body>");
		out.print("<h1> this StudentServlet java class <h1>");
		out.print("<h2> this servlet jsp classes </h2>");
		out.print("</body></html>");
		
		System.out.println("End ******* doGet() ********");

	 }
}
