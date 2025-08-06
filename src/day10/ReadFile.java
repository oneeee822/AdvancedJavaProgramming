package day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {

		String url = "/Users/jeong-wonhee/tub-eclipse-workspace/TUB.Project/src/data/data.txt";
		//Create file object to open the file
		
		List<Integer> myList = new ArrayList<>();
		
		try {
			File file = new File(url);
			
			//Scanner
			Scanner b = new Scanner(file);
			
			while(b.hasNext()) {
				myList.add(b.nextInt());
			}
			
			b.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) { //InputMismatchException e
			System.out.println("File has an error data");
		}
		
		
		
		System.out.println(myList);
		
		

	}

}
