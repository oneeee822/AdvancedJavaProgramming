package day3;

public class Ex5 {

	public static void main(String[] args) {
		
		int N, M, i = 0;
		N = 5; M = 22;
		
		long r = 1;
		
		if(M==0) {
			System.out.println(r);
			return ;
		}
		
		while(i<M) {
			r *= N;
			i++;
		}

		System.out.println(r);

	}

}
