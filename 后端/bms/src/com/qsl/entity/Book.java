package com.qsl.entity;

public class Book {
	private int bookID;
	private String bookName;
	private String bookAuthor;
	private String bookCategory;
	private String bookPublish;
	private int bookStock;
	public Book() {
		super();
	}
	public Book(String bookName, String bookAuthor, String bookCategory, String bookPublish, int bookStock) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookCategory = bookCategory;
		this.bookPublish = bookPublish;
		this.bookStock = bookStock;
	}
	public Book(int bookID, String bookName, String bookAuthor, String bookCategory, String bookPublish,
			int bookStock) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookCategory = bookCategory;
		this.bookPublish = bookPublish;
		this.bookStock = bookStock;
	}
	public Book(int bookID) {
		super();
		this.bookID = bookID;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
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
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public String getBookPublish() {
		return bookPublish;
	}
	public void setBookPublish(String bookPublish) {
		this.bookPublish = bookPublish;
	}
	public int getBookStock() {
		return bookStock;
	}
	public void setBookStock(int bookStock) {
		this.bookStock = bookStock;
	}
	
}
