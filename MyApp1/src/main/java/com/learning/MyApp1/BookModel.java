package com.learning.MyApp1;

public class BookModel {
	
	int id;
	String name;
	String author;
	
	
	public BookModel(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "BookModel [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	

}
