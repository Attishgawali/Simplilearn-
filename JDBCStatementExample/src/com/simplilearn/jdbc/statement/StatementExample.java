package com.simplilearn.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class StatementExample {

	public static void main(String[] args) {
		
		try {
			// 1.load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			
			// 2.Get the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb012","root","root12345");
			
			
			// 3.create the statement
			Statement stmt = con.createStatement();
			
			
			// 4.prepare the query and execute
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE;");
			
			while(rs.next()){
				
				System.out.println(
						"ID - "+rs.getInt(1)+" "
						+"AGE - "+rs.getInt(2)+" "
						+"First name -"+rs.getString(3)+" "
						+"Last name -"+rs.getString(4));
			}
			
			
			// 5.close the resource
			con.close();
			stmt.close();
			rs.close();
			
		} catch(Exception e) {
			e.printStackTrace();
			System.err.println("Error while Fetching the data from table EMPLOYEE");
			
		}

	}

}
