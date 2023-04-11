package com.simplilearn.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class deleteStatementExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// 1.load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			
			// 2.Get the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb012","root","root12345");
			
			
			// 3.create the statement
			Statement stmt = con.createStatement();
			
			
			// 4.prepare the query and execute
			int record = stmt.executeUpdate("DELETE FROM EMPLOYEE WHERE AGE = 55;");
			
			if(record>0) {
				System.out.println("Recoreded deleted Successfully in to Table EMPLOYEE");
			}else {
				System.err.println("Error occured while deleting the data in to table EMPLOYEE");
			}
			
			// 5.close the resource
			con.close();
			stmt.close();
//			rs.close();
			
		} catch(Exception e) {
			e.printStackTrace();
			System.err.println("Error while Fetching the data from table EMPLOYEE");
			
		}
	}

}
