package com.cetpa.models;

import javax.persistence.*;

@Entity
public class book 
{
	@Id
	@GeneratedValue(generator = "book_seq")
	@SequenceGenerator(name = "book_seq",initialValue = 1)
	private int bookid;
	private String bookname;
	private String bookauthor;
    @ManyToOne
	private category cat;
    
	public category getCat() {
		return cat;
	}
	public void setCat(category cat) {
		this.cat = cat;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	
	

}
