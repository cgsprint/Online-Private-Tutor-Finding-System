package com.cg.optfs.entity;

import javax.persistence.Column;

public class EbookTO {

	private int BookId;
	private String title;
	private String Authorname;
	private String Url;

	public EbookTO() {
		
	}
	
	public EbookTO( String title, String authorname, String url) {
		super();
//		BookId = bookId;
		this.title = title;
		this.Authorname = authorname;
		this.Url = url;
		
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
		this.Authorname = authorname;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}


	@Override
	public String toString() {
		return "EbookTO [BookId=" + BookId + ", title=" + title + ", Authorname=" + Authorname + ", Url=" + Url + "]";
	}
	
	

}
