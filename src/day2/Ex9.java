package day2;

public class Ex9 {

	public static void main(String[] args) {
		
		boolean r;
		int a, b;
		double c, d;
		
		a = 10;
		b = 12;
		c = 34.8;
		d = 25.8;
		
		r = (a==b);
		System.out.println(r);
		
		r = (a!=b) & (c<=d);
		System.out.println(r);
	}

}
