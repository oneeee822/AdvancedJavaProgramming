package day4;

public class Ex3 {

	public static void main(String[] args) {
		// 3.6, 6.9, -10.9, 77, 8.7, -23.8, 0, 5.5, -2.6, 10
		// Create the array,
		// delete one element at location 4;
		// Print the results
		
		double[] arr = {3.6, 6.9, -10.9, 77, 8.7, -23.8, 0, 5.5, -2.6, 10};
		double[] newArr = new double[arr.length-1];
		
		
		// O(n)
		for(int i = 0; i < arr.length-1; i++) {
			
			/***
			if(i<4) {
				newArr[i] = arr[i] ;
			}
			else {
				newArr[i] = arr[i+1];
			}
			***/
			
			/***
			newArr[i] = (i<4) ? arr[i] : arr[i+1];
			
			System.out.print(newArr[i]+ " ");
			***/
			
			System.out.print((newArr[i] = (i<4) ? arr[i] : arr[i+1]) + " ");
			
			
		}

	}

}
