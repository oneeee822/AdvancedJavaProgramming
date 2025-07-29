package day4;

public class Ex8 {

	public static void main(String[] args) {
		
		// matrix
		//  6    7    8
		// 22  - 7    0
		// -4    0   25
		//  6    9    3
		
		int[][] arr = {{6,7,8},{22,-7,0},{-4,0,25},{6,9,3}};
		
		for(int[] row : arr) {
			for(int column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
		
		/***
		for(int i = 0; i < arr.length; i++) { // row loop
			for(int j = 0; j < arr[0].length; j++) { // column loop
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		***/
		
		/***
		for(int i = 0; i < 4; i++) { // row loop
			for(int j = 0; j < 3; j++) { // column loop
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		***/

	}

}