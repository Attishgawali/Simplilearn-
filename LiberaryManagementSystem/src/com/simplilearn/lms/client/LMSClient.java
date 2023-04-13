package com.simplilearn.lms.client;

import com.simplilearn.lms.service.BookService;
import com.simplilearn.lms.book.Book;

public class LMSClient {

	public static void main(String[] args) {
		
		/* 1. verify user */
		
		BookService bookservice = new BookService();
		String status =bookservice.verifyUser("root", "root@12345");
		System.out.println(status);
		
		/* Add the book in LMS */
		
		Book book2 = new Book(901,"Java","Bruce Eckel","Prentice Hall Professional", 1488,143521808);
		int records = bookservice.addBooks(book2);
		System.out.println(records + "Records got inserted in DB");


	}
}
