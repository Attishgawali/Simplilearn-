package com.simplilearn.concurrecy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.simplilearn.jdbc.util.JDBCUtil;

public class concurrecyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try{
				
				Connection con = JDBCUtil.getMysqlConnection();
				
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				
				ResultSet rs = stmt.executeQuery("SELECT * from EMPLOYEE;");
				
				System.out.println("******** Before Update ********");
				
				while(rs.next()) {
					System.out.println("ID -"+rs.getInt(1)+ " "
							+"AGE -"+rs.getInt(2)+ " "
							+"FIRST NAME -"+rs.getString(3)+ " "
							+"LAST NAME -"+rs.getString(4)+ " ");
				}
				
				rs.beforeFirst();
				
				System.out.println("******** After Update ********");

				
				while(rs.next()) {
						int updateAge = rs.getInt(2) +10;
						rs.updateInt("AGE", updateAge);
						rs.updateRow();
				}
				
				rs.beforeFirst();
				
				
				while(rs.next()) {
					System.out.println("ID -"+rs.getInt(1)+ " "
							+"AGE -"+rs.getInt(2)+ " "
							+"FIRST NAME -"+rs.getString(3)+ " "
							+"LAST NAME -"+rs.getString(4)+ " ");
				}
				
				
				JDBCUtil.cleanup(con,stmt,rs);
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
	}

}
