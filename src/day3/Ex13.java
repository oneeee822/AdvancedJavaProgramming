package day3;

public class Ex13 {

	public static void main(String[] args) {

		int N, n0, n1, n;
		
		N = 23; 
		
		n0 = 0; n1 = 1; 
		
		System.out.print(n0+" "+n1+" ");
		for(int i = 0; i < N + 1; i++) {
			n = n0 + n1;
			System.out.print(n+" ");
			
			n0 = n1;
			n1 = n;
		}
		
	}
	
}
