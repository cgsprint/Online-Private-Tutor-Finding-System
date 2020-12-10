package com.cg.optfs.entity;

import javax.persistence.Column;

public class EbookTO {

	private int BookId;
	private String title;
	private String Authorname;
	private String Book;

	
	
	public EbookTO(int bookId, String title, String authorname, String book) {
		super();
		BookId = bookId;
		this.title = title;
		Authorname = authorname;
		Book = book;
	}
	
	public String getBook() {
		return Book;
	}
	public void setBook(String book) {
		Book = book;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorname() {
		return Authorname;
	}
	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}
	@Override
	public String toString() {
		return "Ebook [BookId=" + BookId + ", title=" + title + ", Authorname=" + Authorname + ",Book="+ Book +"]";
	}
	

}
