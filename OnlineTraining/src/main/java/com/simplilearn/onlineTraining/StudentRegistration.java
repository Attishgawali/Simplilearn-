package com.simplilearn.onlineTraining;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class StudentRegistration extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			System.out.println("Start ***** doPost *****");

		
			String firstname = (String)request.getParameter("firstname");
			String lastname = (String)request.getParameter("lastname");
			String emailid = (String)request.getParameter("emailid");
			String password = (String)request.getParameter("password");
			String number1 = request.getParameter("num1");
			int intValue1 = Integer.parseInt(number1);
			String number2 = request.getParameter("num2");
			int intValue2 = Integer.parseInt(number2);
			int sum = intValue1 + intValue2;

			
			System.out.println("firstname : " + firstname);
			System.out.println("lastname : " + lastname);
			System.out.println("emailid : " + emailid);
			System.out.println("password : " + password);
			
			System.out.println("end ***** doPost *****");
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			out.print("<html>");
			out.print("<body>");
			out.print("<p>firstname : " + firstname + "</p>");
			out.print("<p>lastname :" + lastname + "</p>");
			out.print("<p>emailid :" + emailid + "</p>");
			out.print("<p>password :" + password + "</p>");
			out.print("<p>sum of number is :" + sum + "</p>");

			out.print("</html>");
			out.print("</body>");
		}
}
