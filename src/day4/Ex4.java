package day4;

public class Ex4 {

	public static void main(String[] args) {
		
		// 3.6, 6.9, -10.9, 77, 8.7, -23.8, 0, 5.5, -2.6, 10
		// Create the array,
		// search for maximum element in the array;
		// Print the results
		
		
		double[] arr = {3.6, 6.9, -10.9, 77, 8.7, -23.8, 0, 5.5, -2.6, 10};
		double max = Double.MIN_VALUE; // Double.NEGATIVE_INFINITY
		// double max = arr[0]; 이게 더 효율적임 글고 for문 i를 1로 시작 
		
		for(double a : arr) {
			max = (max<a) ? a : max; // if문이 더 좋다고?! 근데 이게 클린코드라고?!
		}
		
		System.out.println(max);	

	}

}
