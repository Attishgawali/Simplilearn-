package com.simplilearn.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class mulitinsertStatementExample {

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
	
			int record1= stmt.executeUpdate("insert into EMPLOYEE values (106,23,'captain','america');");
			int record2= stmt.executeUpdate("insert into EMPLOYEE values (107,15,'moon','light');");

			
			if(record1>0 && record2>0) {
				System.out.println("Recoreded Inserted Successfully in to Table EMPLOYEE");
			}else {
				System.err.println("Error occured while Inserting the data in to table EMPLOYEE");
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
