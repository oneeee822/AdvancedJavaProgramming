package day3;

public class Ex7 {

	public static void main(String[] args) {
		
		double t, c, prev, minimum;
		t = 2.0; c = 2.0; prev = 0; minimum = 0.0000000000000000000001;
		
		while(Math.abs(t-prev)>minimum) {
			prev = t;
			t = (t+c/t)/2.0;
		}

		System.out.println(t);
	}

}

/***
public class Ex7 {

public static void main(String[] args) {
	
	double t, c;
	double e = 1e-15; // 1 * 10^-15
	
	c = 4;
	
	t = c;
	
	int i = 0;
	while(i<20) {
		t = (t+c/t)/2.0;
		i++;
	}
	
	System.out.println(t);
}

}
***/