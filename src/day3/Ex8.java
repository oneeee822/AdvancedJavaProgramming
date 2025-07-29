package day3;

public class Ex8 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("------------------------------------");
		
		for(int i = 0; i < 10; i++) {
			i = 9 ; // do not change the index value
			System.out.println(i);
		}
		
		System.out.println("------------------------------------");
		
		for(int i = 10; i > -1; i--) {
			System.out.println(i); // reverse loop
		}
		
		System.out.println("------------------------------------");
		// nested loop
		
		// outer loop
		for(int i = 10; i > -1; i--) {
			//inner loop
			for(int j = 10; j > -1; j--) {
				System.out.println(i+" "+j); // reverse loop
			}
		}
	}

}
