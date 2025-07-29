package day4;

public class Ex5 {

	public static void main(String[] args) {
		// 3.6, 6.9, -10.9, 77, 8.7, -23.8, 0, 5.5, -2.6, 10
		// Create the array,
		// insert 55.8 at location 0 
		// Print the results
		
		double[] arr = {3.6, 6.9, -10.9, 77, 8.7, -23.8, 0, 5.5, -2.6, 10};
		double[] newArr = new double[arr.length+1];
		
		newArr[0] = 55.8;
		
		for(int i = 0; i < arr.length; i++) {
			newArr[i+1] = arr[i];
		}
		
		for(double t : newArr) {
			System.out.print(t+" ");
		}

	}

}
