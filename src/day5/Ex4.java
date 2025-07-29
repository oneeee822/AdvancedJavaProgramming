package day5;

public class Ex4 {

	public static void main(String[] args) {
		// Create a static method that convert any int variable, 
		// to absolute value and printed
		
		int num = myAbs(-12345);
		
		System.out.println(num);
		

	}
	
	public static int myAbs(int a) {
		return a<0 ? -a : a;
	}

}
