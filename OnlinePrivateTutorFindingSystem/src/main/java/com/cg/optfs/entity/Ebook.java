package com.cg.optfs.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name="Ebook")
public class Ebook {


	
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="BookId",length=5)
		private int BookId;
		@Column(name="title",length=10)
		private String title;
		@Column(name="Authorname",length=20)
		private String Authorname;
		@Column(name="Book")
		private String Book;

		
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


