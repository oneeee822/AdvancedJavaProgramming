package day2;

public class Ex21 {

	public static void main(String[] args) {
		//args는 유저에게 받는 인풋, String이므로 변환해줘야
		
		double x, fx;
		
		x = Double.parseDouble(args[0]);
	
		fx = 3 * Math.pow(x, 3) - 5 * Math.sqrt(Math.abs(x)) + 3*Math.pow(x, 2) - Math.pow(Math.E, -3*x);
		// Math.exp(-3*x)도 됨
		
		System.out.println("f(x) = " + fx);
	}

}
