package day3;

public class Ex6 {

	public static void main(String[] args) {
		
		int N;
		long r=1;
		
		N = 73;
		
		//N을 2로 나누는 게 계산을 더 적게 함
		while(r<=(N/2)) {
			r *= 2;
		}

		System.out.println(r);
	}

}
