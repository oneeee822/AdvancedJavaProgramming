package day2;

public class Ex13 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 10;
		b = 20;
		c = 23;
		
		if(a <= b) {
			if (a <= c) {
				System.out.println(a + "is the minimum number");
			}
		}
		if(b <= a) {
			if (b <= c) {
				System.out.println(b + "is the minimum number");
			}
		}
		if(c <= a) {
			if (c <= b) {
				System.out.println(c + "is the minimum number");
			}
		}

	}

}
