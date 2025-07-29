package day5;

public class Ex5 {

	public static void main(String[] args) {
		
		//Static Method that print an array of integers
		int[] arr = {5, 7, 9, 10, -12, 17, 22, 6};
		
		printArr(arr);
		

	}

	public static void printArr(int[] arr) {
		
		for(int a : arr) 
			System.out.print(a + " ");
		
	}
}
