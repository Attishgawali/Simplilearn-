package com.simplilearn.lms.client;

import com.simplilearn.lms.service.BookService;
import com.simplilearn.lms.book.Book;

public class LMSClient {

	public static void main(String[] args) {
		
		BookService bookservice = new BookService();
		
		/* 1. verify user */
//		String status =bookservice.verifyUser("root", "root@12345");
//		System.out.println(status);
		
		
		/* Add the book in LMS */		
//		Book book2 = new Book(901,"Java","Bruce Eckel","Prentice Hall Professional", 1488,143521808);
//		Book book = new Book(902, "Java Made Simple", "P K Mcbride", "Routledge", 7978, 113816724L);
//		int records = bookservice.addBooks(book);
//		System.out.println(records + "Records got inserted in DB");
		
		
		/*3. Update the books in LMS*/
		/*To update the price for the book id 902 Old price : 7978 New price : 1250*/
//		Book updatebook = new Book(902, 1250);
//		int records=bookservice.updateBooks(updatebook);
//		System.out.println(records+" No of Records updated in to DB successfully");

		
		/*4. Delete the book record */
//		Book deletebook = new Book();
//		deletebook.setBookId(902);
//		int records=bookservice.deleteBook(deletebook);
//		System.out.println(records+" No of Records deleted in to DB successfully");
		
		
	}
}
