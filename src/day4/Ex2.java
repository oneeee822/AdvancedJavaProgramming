package day4;

public class Ex2 {

	public static void main(String[] args) {
		
		// 3.6, 6.9, -10.9, 77, 8.7, -23.8, 0, 5.5, -2.6, 10
		// Create the array,
		// Sum of the all the elements
		// Print the results
		
		double[] arr = {3.6, 6.9, -10.9, 77, 8.7, -23.8, 0, 5.5, -2.6, 10};
		double result = 0;
		
		for(double a : arr) {
			result += a;
		}
		
		System.out.println(result);

	}

}
