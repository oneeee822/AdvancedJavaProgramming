package day10;

import java.util.Scanner;


public class Ex4 {


	public static void main(String[] args) {

		int a, b, c, d;
		int[] arr = {1, -3, 546, 22, 6};
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Please enter the first nunmber: ");
			a = scanner.nextInt();
		
			System.out.println("Please enter the second nunmber: ");
			b = scanner.nextInt();
			
			System.out.println("Please enter the size of array: ");
			d = scanner.nextInt();
		
			//Division
			c = a / b;
			System.out.println("The results: " + c);
			
			for(int i = 0; i < d; i++) {
				System.out.print(arr[i]+ " ");
			}
			
		}catch(ArithmeticException e) {
			
				System.out.println(e);
				System.out.println("Please enter a correct values");
				
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter the size less than "+arr.length);
		}
		catch(Exception e) {
			
			System.out.println("Please Integer number only");
			System.out.println(e);
			
		
		}
		System.out.println("The program still working");
		
	}
	
}
