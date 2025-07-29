package day5;

import java.util.List;
import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		
		//Create an instant form the Book class;
		//Create book object
		
		Book obj1 = new Book();
		Book obj2 = new Book();
		Book obj3 = new Book();
		
		obj1.setTitle("Harry Potter");
		obj1.setAuthor("J, K, Roling");
		obj1.setISBN("325465643BJ");
		obj1.setPrice(14.9);
		
		obj2.setTitle("Lord of the Ring");
		obj2.setAuthor("John Tolken");
		obj2.setISBN("134543BJ");
		obj2.setPrice(24.9);
		
		obj3.setTitle("Rich Dad Poor Dad");
		obj3.setAuthor("Robert Kiyosaki");
		obj3.setISBN("895743BJ");
		obj3.setPrice(14.99);
		
		obj1.printInfo(0.25);
		System.out.println("---------------------------");
		obj2.printInfo(0.1);
		System.out.println("---------------------------");
		obj3.printInfo(0.12);
		
	}
	
	
	
	
}
