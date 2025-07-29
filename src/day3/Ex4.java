package day3;

public class Ex4 {

	public static void main(String[] args) {
		//Power of 2
		int N = Integer.parseInt(args[0]);
		
		int i = 0;
		int result = 1;
		
		//이 케이스도 필요하지 않
		if(N==0) {
			System.out.println(result);
			return ;
		}
		
		while(i<N) {
			result *= 2;
			i++;
		}

		System.out.println(result);
	}

}
