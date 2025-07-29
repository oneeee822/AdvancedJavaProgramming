package day2;

public class Ex12 {

	public static void main(String[] args) {
		int a, b, c;
		
		a = 10; b = 12; c = -12;
		double x;
		
		if (a > b) {
			// a가 b보다 작은 경우 x가 초기화되지 않음
			// x = 13.5;
			System.out.println("A is greater than B");
		} else {
			System.out.println("B is greater than A");
		}
	}
}
