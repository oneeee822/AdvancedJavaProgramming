package day10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) {

		String url = "/Users/jeong-wonhee/tub-eclipse-workspace/TUB.Project/src/data/data.txt";
		String url2 = "/Users/jeong-wonhee/tub-eclipse-workspace/TUB.Project/src/data/data1.txt";
		
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
		} catch (Exception e) {
			System.out.println("File has an error data");
		}
		
		
		
		System.out.println(myList);
		
		
		try{
			FileWriter f = new FileWriter(url2, false); //True append, False create new file
			BufferedWriter b = new BufferedWriter(f);
			PrintWriter p = new PrintWriter(b);
		
			for (Integer t: myList) {
				p.write(t.toString());
				p.write("\n");
			}
			p. close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
			
		} catch (IOException e) {
			
			System.out.println(e);
		}
		
		
	}

}
