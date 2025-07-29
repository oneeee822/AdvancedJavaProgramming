package day5;

public class Ex7 {

	public static void main(String[] args) {
		// Create a static method that double the values of an array of integer
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] nArr = new int[arr.length];
		
		nArr = Darr(arr);
		
		Ex6.printArr(nArr);
		

	}
	
	public static int[] Darr(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) 
			arr[i] *= 2;
		
		Ex6.printArr(arr);
		
		return arr;
	}

}