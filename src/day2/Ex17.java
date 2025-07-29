package day2;

public class Ex17 {

	public static void main(String[] args) {
		
		int a, b;
		int result;
		
		//read the numbers
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
		
		//비교해보기 뭐가 다른지
		result = (int)((Math.random()+a)+(b-a+1)*Math.random());
		//result = (int)(Math.random()*b - a + 1)+a;
		
		System.out.println(result);
	}

}
