package day4;

public class Ex6 {

	public static void main(String[] args) {
		// 3.6, 6.9, -10.9, 77, 8.7, -23.8, 0, 5.5, -2.6, 10
		// Reverse of the array using the same array create
		// using one for loop
		// Print the results
		
		double[] arr = {3.6, 6.9, -10.9, 77, 8.7, -23.8, 0, 5.5, -2.6, 10};
		double temp = 0 ;
		int j;
		
		// i범위 조심, arr.length로 하면 원상복귀됨
		for(int i = 0; i < arr.length/2; i++) {
		
			j = arr.length - i - 1;
			
			temp = arr[i];
			arr[i]=arr[j];
			arr[j] = temp;
		}
		
		for(double t : arr) {
			System.out.print(t+" ");
		}
		
	}

}