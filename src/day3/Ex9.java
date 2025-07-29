package day3;

public class Ex9 {

	public static void main(String[] args) {
		//Product of 1 * 2 * 3 * 4 ..... N
		
		int N, r=1;
		
		N = 5;
		
		for(int i = 1; i <= N; i++) {
			r *= i;
		}

		System.out.println(r);
	}

}
