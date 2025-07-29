package day3;

public class Ex10 {

	public static void main(String[] args) {
		//Square Root
		
		double t, c;
		double e = 1e-15; // 1 * 10^-15
		
		c = 4;
		
		t = c;
		
		for(int i = 0; i<20; i++) {
			t = (t+c/t)/2.0;
		}
		
		System.out.println(t);
		
	}
	
	/***
	public static void main(String[] args) {
		
		double t, c, prev, minimum;
		t = 2.0; c = 2.0; prev = 0; minimum = 0.0000000000000000000001;
		
		for(int i = 0; Math.abs(t-prev)>minimum; i++){
		
			prev = t;
			t = (t+c/t)/2.0;
			
		}

		System.out.println(t);
	}
	 ***/

}
