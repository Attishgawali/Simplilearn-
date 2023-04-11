package com.simplilearn.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import com.simplilearn.jdbc.util.JDBCUtil;

public class InsertPreparedStatement {

	public static void main(String[] args) {

		try {
			Connection con = JDBCUtil.getMysqlConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO EMPLOYEE VALUES (?,?,?,?);");
			
			ps.setInt(1, 119);
			ps.setInt(2, 19);
			ps.setString(3, "Mihir");
			ps.setString(4, "Gupta");
			ps.execute();
			
			ps.setInt(1, 112);
			ps.setInt(2, 20);
			ps.setString(3, "Phani");
			ps.setString(4, "Kumar");
			ps.execute();
			
			ps.setInt(1, 113);
			ps.setInt(2, 23);
			ps.setString(3, "Munna");
			ps.setString(4, "Tripathi");
			ps.execute();
			
			JDBCUtil.cleanup(con, ps);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		
	}

}
