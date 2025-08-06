package day10;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookTest {

	public static void main(String[] args) {
		
		List<Book> myData = new ArrayList();
		List<Book> readData = new ArrayList();
		
		Book book1 = new Book("Lord of the ring", "Tolking", 33.9);
		Book book2 = new Book("Rich Dad, Poor Dad", "Robert", 13.4);
		Book book3 = new Book("Harry Poter", "J.K Rolling", 5.9);
		myData.add(book1); myData.add(book2); myData.add(book3);
		
		for(Book t : myData) {
			System.out.println(t.toString());
		}
		
		//Save the List to a binary file
		String url = "/Users/jeong-wonhee/tub-eclipse-workspace/TUB.Project/book.dat";
		
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("book.dat"))){
			
			for(Book t: myData) {
				oos.writeObject(t);
			}
			System.out.println("Object written to file.");
			
		} catch(IOException e){
			e.printStackTrace();
		}
		
		//Read the List from a binary file
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(url))){
			
			while(true) {
				try {
					Book book = (Book) ois.readObject();
					readData.add(book);
					System.out.println(book.toString());
				} catch(EOFException e) {
					break;
				}
			}
			
			
		} catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
		}
	
	}

}
