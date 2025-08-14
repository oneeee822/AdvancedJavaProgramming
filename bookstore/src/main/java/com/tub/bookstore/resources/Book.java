package com.tub.bookstore.resources;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	private String id;
	private String title;
	private String author;
	private String description;
	private double price;
	
	public Book(){}
	
	public Book(String id, String title, String author, String description, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.description = description;
		this.price = price;
	}
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
