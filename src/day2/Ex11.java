package day2;

public class Ex11 {

	public static void main(String[] args) {
		
		// a, b, c 12.8, 13.7, -12.9
		// print the maximum number without using if
		
		double a, b, c, x;
		
		a = 12.8;
		b = 13.7;
		c = -12.9;
		
		String str = ((a>=b) & (a>=c)) ? "A is the maximum" : ((b>=a) & (b>=c))? "B is the maximum" : "C is maximum";
		System.out.println(str);
		
		/***
		boolean t1 = ((a>=b) & (a>=c));
		boolean t2 = ((b>=a) & (b>=c));
		boolean t3 = ((c>=b) & (c>=a));
		
		String str = t1 == true ? "A is the maximum" : t2 == true ? "B is the maximum" : "C is maximum";
		System.out.println(str);
		***/
		
		/***
		double comp = a <= b ? b : a;
		double max = comp <= c ? c : comp;
		
		System.out.println(max);
		***/

	}

}
