package day5;

public class Ex2 {
	
	public static void main(String[] args) {
		
		int n = 9;
		
		printNumbers(n);
		
		n = 20;
		
		printNumbers(n);

	}
	
	//Static method for printing (n is arguments)
	public static void printNumbers(int n) {
		
		for (int i = 0; i < n; i++) {
			System.out.println("i = " + i);
		}
	}

}
