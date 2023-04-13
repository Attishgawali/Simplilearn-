package com.simplilearn.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;



public class JDBCUtil {
	
	
	//load driver class
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("Error while loading Driver");
		}
	}
	
	
	
	//Connection to sql
	public static Connection getMysqlConnection() throws Exception{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sb012","root","root12345");
		return con;
	}
	

	
	//close the resources
	public static void cleanup(Connection con, Statement stmt) {
		
		try {
			
			if(con!=null) {
				con.close();
			}
			
			if(stmt!=null) {
				stmt.close();
			}
		} catch (Exception e) {
			
		}
	}
	
	//close the resources
	public static void cleanup(Connection con, Statement stmt,ResultSet rs) {
			
		try {				
			if(con!=null) {
				con.close();
			}
			
			if(stmt!=null) {
				stmt.close();
			}
			
			if(rs!=null) {
				rs.close();
			}
		} catch (Exception e) {
			
		}
	}


		
		//close the resources
		public static void cleanup(Connection con, PreparedStatement ps) {
			
			try {
				
				if(con!=null) {
					con.close();
				}
				
				if(ps!=null) {
					ps.close();
				}
			} catch (Exception e) {
				
			}
		}
		
}
