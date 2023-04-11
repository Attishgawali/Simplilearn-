package com.simplilearn.callable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.simplilearn.jdbc.util.JDBCUtil;

public class CallableStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			Connection con = JDBCUtil.getMysqlConnection();
			
			PreparedStatement pstmt = con.prepareCall("{call GetAllEmployee}");
			
			pstmt.execute();
			
			ResultSet rs = pstmt.getResultSet();
			
			while(rs.next()) {
				System.out.println("ID -"+rs.getInt(1)+ " "
						+"AGE -"+rs.getInt(2)+ " "
						+"FIRST NAME -"+rs.getString(3)+ " "
						+"LAST NAME -"+rs.getString(4)+ " ");
			}
			
			
			JDBCUtil.cleanup(con,pstmt,rs);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
