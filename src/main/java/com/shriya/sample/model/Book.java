package com.shriya.sample.model;

public class Book {
	private String bookName;
	private String id;
	private String author;
	
	public Book() {
		
	}
	
	

	public Book(String bookName, String id, String author) {
		super();
		this.bookName = bookName;
		this.id = id;
		this.author = author;
	}



	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
}
