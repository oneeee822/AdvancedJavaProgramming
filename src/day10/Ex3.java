package day10;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		int a, b, c;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Please enter the first nunmber: ");
			a = scanner.nextInt();
		
			System.out.println("Please enter the second nunmber: ");
			b = scanner.nextInt();
		
			//Division
			c = a / b;
			System.out.println("The results: " + c);
			
		}catch(ArithmeticException e) {
			
				System.out.println(e);
				System.out.println("Please enter a correct values");
				
		}catch(Exception e) { //InputMismatchException왜 안 되지 
			
			System.out.println("Please Integer number only");
			System.out.println(e);
			
		}
		
		System.out.println("The program still working");
		
	}

}
