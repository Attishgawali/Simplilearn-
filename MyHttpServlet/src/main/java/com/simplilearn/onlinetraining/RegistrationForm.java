package com.simplilearn.onlinetraining;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistrationForm extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println(" ******* START -doGet() ******** ");
		
		String firstname = (String)request.getParameter("firstname");
		String lastname = (String)request.getParameter("lastname");
		String email = (String)request.getParameter("emailid");
		String password = (String)request.getParameter("password");
		
		System.out.println("First Name : "+ firstname);
		System.out.println("Last Name : "+ lastname);
		System.out.println("Eamil id : "+ email);
		System.out.println("Password : "+ password);
		
		System.out.println(" ******* END -doGet() ******** ");
	}
}
