package day5;

public class Ex9 {

	public static void main(String[] args) {
		//Create a static methods to calculate M power of N
		
		long result =rPower(2, 5);
		
		System.out.println(result);

	}
	
	public static long power(long n, long m) {
		
		long pow = 1;
		
		for(int i = 0; i < m; i++) {
			pow *= n;
		}
		
		return pow;
		
	}
	
	public static long rPower(long n, long m) {
		if(m==0) return 1;
		return n * power(n, m-1);
		
	}
	
}
