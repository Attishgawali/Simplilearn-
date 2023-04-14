package com.simplilearn.lms.book;

public class Book {
	
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private String bookPublication;
	private int bookPrice;
	private long bookIsbn;
	
	
	public Book() {
		super();
	}


	public Book(int bookId, String bookName, String bookAuthor, String bookPublication, int bookPrice, long bookIsbn) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublication = bookPublication;
		this.bookPrice = bookPrice;
		this.bookIsbn = bookIsbn;
	}

	public Book(int bookId, int bookPrice) {
		super();
		this.bookId = bookId;
		this.bookPrice = bookPrice;
	}

	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public String getBookPublication() {
		return bookPublication;
	}


	public void setBookPublication(String bookPublication) {
		this.bookPublication = bookPublication;
	}


	public int getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}


	public long getBookIsbn() {
		return bookIsbn;
	}


	public void setBookIsbn(long bookIsbn) {
		this.bookIsbn = bookIsbn;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPublication="
				+ bookPublication + ", bookPrice=" + bookPrice + ", bookIsbn=" + bookIsbn + "]";
	}
	
	
	
	
}
