package day2;

public class Ex18 {

	public static void main(String[] args) {
	
		/***
		int t, P;
		double r, pay, monthlyPay;

		t = Integer.parseInt(args[0]);
		P = Integer.parseInt(args[1]);
		r = Integer.parseInt(args[2]);
		
		pay = P * Math.exp(t*(r*0.01));
		
		monthlyPay = pay/(t*12);
		
		System.out.println(monthlyPay);
		***/
		
		double l = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[1]);
		double y = Double.parseDouble(args[2]);
		
		double f = 0.01 * r * y;
		double total = (l*0.01*r)*y +l;
		
		System.out.println("The amount you will pay after " + y + " year");
		System.out.println("With interest rate " + r +" % is: " + total);
	}

}
