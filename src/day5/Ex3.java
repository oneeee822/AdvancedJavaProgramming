package day5;

public class Ex3 {

	public static void main(String[] args) {
		// Create a static method that convert any int variable, 
		// to absolute value and printed
		
		IntegerAbs(-234);
		
		

	}
	
	public static void IntegerAbs(int a) {
		System.out.println( a<0 ? -a : a);
	}

}
