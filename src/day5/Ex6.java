package day5;

public class Ex6 {

	public static void main(String[] args) {
		
		//Static Method that print an array of integers, and double
		int[] arr = {5, 7, 9, 10, -12, 17, 22, 6};
		double[] dArr = {5.9, 8.9, -0.1, -0.11, 12.7};
		String[] SArr = {"Donald", "Wonhee", "Sumin"};
		
		printArr(arr);
		printArr(dArr);
		printArr(SArr);
		

	}

	public static void printArr(int[] arr) {
		
		for(int a : arr) 
			System.out.print(a + " ");
		
	}
	
	public static void printArr(double[] arr) {
		
		for(double a : arr) 
			System.out.print(a + " ");
		
	}
	
public static void printArr(String[] arr) {
		
		for(String a : arr) 
			System.out.print(a + " ");
		
	}
}
