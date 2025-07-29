package day2;

public class Ex14 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 10;
		b = 20;
		c = 23;
		
		if ((a <= b)&(a <= c)) {
			System.out.println(a + " is the minimum number");
		} else {
			if ((b <= a) & (b <= c)) {
				System.out.println(b + " is the minimum number");
			}else {
				System.out.println(c + " is the minimum number");
			}
		}
		
	
		/***
		if ((a <= b)&(a <= c)) {
			System.out.println(a + "is the minimum number");
		}
		if ((b <= a) & (b <= c)) {
			System.out.println(b + "is the minimum number");
		}
		if ((c <= a)&(c <= b)) {
			System.out.println(c + "is the minimum number");
		}
		***/

	}

}

