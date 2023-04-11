package com.simplilearn.servelet;
import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServelet implements Servlet{

	@Override
	public void destroy() {
		System.out.println("************* MyServlet.destroy() *************");
	}
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("************* MyServlet.getServletConfig() *************");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("************* MyServlet.getServletInfo() *************");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("************* MyServlet.init() *************");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("************* MyServlet.service() *************");
		
	}

}
