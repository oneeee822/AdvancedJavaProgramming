package day5;

public class Ex1 {

	public static void main(String[] args) {
		
		//Calling the method
		printNumbers();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
		
		printNumbers();
	}
	
	//Static method for printing
	public static void printNumbers() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i );
		}
	}

}
