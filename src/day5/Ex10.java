package day5;

public class Ex10 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 20; i++)
			System.out.print(fib(i)+ " ");

	}
	
	public static int fib(int n) {
		
		if(n==0) return 0;
		
		if(n==1) return 1;
		
		return fib(n-1) + fib(n-2);
	}

}
