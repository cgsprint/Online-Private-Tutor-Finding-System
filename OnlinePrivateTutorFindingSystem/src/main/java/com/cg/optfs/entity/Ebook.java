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
		@Column(name="BookId")
		private int BookId;
		@Column(name="title")
		private String title;
		@Column(name="Authorname")
		private String Authorname;
		@Column(name="Url")
		private String Url;

		public Ebook() {
			
		}
		
		public Ebook( String title, String authorname, String url) {
			super();
//			BookId = bookId;
			this.title = title;
			this.Authorname = authorname;
			this.Url= url;
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

		public String getUrl() {
			return Url;
		}

		public void setUrl(String url) {
			Url = url;
		}

		@Override
		public String toString() {
			return "Ebook [BookId=" + BookId + ", title=" + title + ", Authorname=" + Authorname + ", Url=" + Url + "]";
		}

		
		
		
		
}


