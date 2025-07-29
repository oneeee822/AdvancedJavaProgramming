package day3;

public class Ex16 {

	public static void main(String[] args) {
		
		int N, r;
		
		N = 123456789;
		
		while(N>0) {
			r = N%10;
			N /= 10;
			System.out.print(r);
		}

	}

}
