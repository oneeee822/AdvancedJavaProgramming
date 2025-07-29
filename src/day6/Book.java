package day6;

public class Book {

	//Attributes
	private String title;
	private String author;
	private String isbn;
	private double price;
	private String description;
	private double profit;
	
	//Constructor
	protected Book(){
		System.out.println("The constructor is envoked");
		this.profit = 0.15;	//profit 15%
	}
	
	
	public Book(String title, String author, String isbn, double price, String description) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.description = description;
	}


	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}


	//Getters and setters
	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	//Method
	public void printInfo() {
		System.out.println("The book title: " + this.title);
		System.out.println("Book Author: "+ this.author);
		System.out.println("Book Price: "+ this.price);
		System.out.println("-------------------------------");
	}
	
	public double salePrice() {
		return this.price * this.profit + this.price;
	}
}
