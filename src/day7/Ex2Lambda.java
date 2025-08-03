package day7;

public class Ex2Lambda {

	public static void main(String[] args) {
		// Create a Lambda function to add 2 integer numbers, and return the value.
	
		math l = (int a, int b) -> a + b ;
	
		int result = l.add(4,6);
		System.out.println(result);
		
	}
}

interface math{
	public int add(int a, int b);
}