package com.simplilearn.lms.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.simplilearn.jdbc.util.JDBCUtil;
import com.simplilearn.lms.book.Book;

public class BookService {
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public String verifyUser(String username, String password) {
		System.out.println("****** Start verifyUser ******");
		
		String verifyuser = "";
		
		try {
			
			con = JDBCUtil.getMysqlConnection();
			ps = con.prepareStatement("SELECT *FROM USERS WHERE USER_NAME = ? AND USER_PASSWORD = ?");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				verifyuser = "user login Succesfully";
				
			}else {
				
				verifyuser = "user login failed";
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error ocuured while validating the user");
		}
		
		System.out.println("****** End verifyUser ******");

		return verifyuser;
	}

	public int addBooks(Book book) {
		int record = 0;
		try {
			con = JDBCUtil.getMysqlConnection();

			ps = con.prepareStatement("INSERT INTO BOOKS VALUES (?,?,?,?,?,?);");
			
			ps.setInt(1, book.getBookId());
			ps.setString(2, book.getBookName());
			ps.setString(3, book.getBookAuthor());
			ps.setString(4, book.getBookPublication());
			ps.setInt(5, book.getBookPrice());
			ps.setLong(6, book.getBookIsbn());
			record = ps.executeUpdate();
			

		}catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error ocuured while inserting the data");
		}
		
		return record;
		
	}
	
	
	public int updateBooks(Book updatebook) {
		System.out.println("***** START: updateBooks *****");
		int records = 0;
		
		try {
			
			con=JDBCUtil.getMysqlConnection();
			ps=con.prepareStatement("UPDATE BOOKS SET BOOK_PRICE = ? WHERE BOOK_ID = ?;");
			ps.setInt(1, updatebook.getBookPrice());
			ps.setInt(2, updatebook.getBookId());
			records=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error occured while updating the data in to BOOKS table");
		}
		System.out.println("***** END: updateBooks *****");
		return records;
		
		
	}
	
	public int deleteBook(Book deletebook) {
		System.out.println("***** START: deleteBook *****");
		int records = 0;
		
		try {
			con=JDBCUtil.getMysqlConnection();
			ps=con.prepareStatement("DELETE FROM BOOKS WHERE BOOK_ID = ?;");
			ps.setInt(1, deletebook.getBookId());
			records=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error occured while deleting the data in to BOOKS table");
		}
		System.out.println("***** END: deleteBook *****");
		return records;
		
		
	}
	
}
