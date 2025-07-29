package day4;

public class Ex7 {

	public static void main(String[] args) {
		// Double dimension array

		int[][] arr = new int[3][4]; //3cols and 4 rows
		
		arr[2][2] = 7;
		arr[2][0] = 9;
		
		// 어떤 배열인지 자료형 나옴, System.out.println(arr);
		
		for(int i = 0; i < 4; i++) { // row loop
			for(int j = 0; j < 3; j++) { // column loop
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

}
