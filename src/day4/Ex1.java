package day4;

public class Ex1 {

	public static void main(String[] args) {
		
		int a1 = 10;
		int a2 = 23;
		int a3 = -16;
		int a4 = 6;
		int a5 = 7;
		
		int[] a = {10, 23,-16, 6, 7};
		
		for(int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		
		//Create empty array
		double[] arr = new double[10]; //all elements will be zero
		System.out.println(arr);
		
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		
		//Create empty array as String array
		
		String[] str = new String[10];
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		str[7] = "";	// 아무것도 없음, 언어마다 다르(?) 오류날수
		str[8] = " ";	//공
		str[9] = "null"; //string null임 진짜 null이 아니

		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		//str에 있는 모든 element를 출력함 
		for(String temp: str) {
			System.out.println(temp);
		}
		
		for(int t: a) System.out.print(t+ ", ");
		
	}

}
