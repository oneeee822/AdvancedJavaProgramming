package day11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ex1 {

	public static void main(String[] args) {
		
		//Create a collection of fruits
		
		Collection<String> myCollection = new ArrayList<String>();
		String str = null;
		
		myCollection.add("Apple");
		myCollection.add("Orange");
		myCollection.add("Banana");
		myCollection.add("Mango");
		myCollection.add("Blueberry");
		
		//for(int i = 0; i < myCollection.size(); i++) {
		//	str = myCollection.toString();
		//	System.out.println(str);
		// }
		// System.out.println(myCollection);
		
		//First Solution
		for(String t : myCollection) {
			System.out.println(t);
		}
		
		//Second Solution
		printData(myCollection);
		
		
		//Third Solution best method clean code
		myCollection.forEach(t -> System.out.println(t));
		
		//Fourth Solution
		Iterator<String> iterator = myCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void printData(Collection<String> myCollection) {
		for(String t : myCollection) {
			System.out.println(t);
		}
	}

}
