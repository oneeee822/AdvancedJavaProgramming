package day11;

import java.util.Collection;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		
		Collection<String> fruits = List.of("Apple, Banana, Orrange");
		
		//This List is a constant, so cant add any fruits 
		//fruits.add("Blueberry"); remove either
		
		fruits.forEach(t -> System.out.println(t));
		
	}

}
