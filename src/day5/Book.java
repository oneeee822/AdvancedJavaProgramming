package day5;

public class Book {

	//Attributes
	private String title;
	private String author;
	private String ISBN;
	private double price;
	private double profit = 0.15;
	
	//Getters and setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	//Methods
	public void printInfo(double profit) {
		
		System.out.println("Book Title: "+ title);
		System.out.println("Book Author: "+ author);
		// 원래 가격을 안 보여주고 싶을 때
		//System.out.println("Book Price: "+ price);
		System.out.println("Book Price: "+ salePrice(this.profit));
		
	}
	
	/*
	 * public static void printInfo(Book obj) {
		
		System.out.println("Book Title: "+ obj.title);
		System.out.println("Book Author: "+ obj.author);
		System.out.println("Book Price: "+ obj.price);
		
		}
	 */

	public double salePrice(double profit) {
		return price * profit + price ;
	}
}
