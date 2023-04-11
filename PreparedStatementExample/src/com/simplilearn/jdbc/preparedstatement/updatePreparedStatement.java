package com.simplilearn.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import com.simplilearn.jdbc.util.JDBCUtil;

public class updatePreparedStatement {

	public static void main(String[] args) {

		try {
			Connection con = JDBCUtil.getMysqlConnection();
			PreparedStatement ps = con.prepareStatement("UPDATE EMPLOYEE SET AGE = ? WHERE ID=?;");
			
			ps.setInt(1, 26);
			ps.setInt(2, 106);
			ps.execute();

			
			JDBCUtil.cleanup(con, ps);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		
	}

}
