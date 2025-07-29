package day2;

public class Ex2 {

	public static void main(String[] args) {
		
		// 다 long으로 해줘야 
		long a, b, c;
		
		a = 12329085;
		b = 43820835;
		
		c = a*b;
		
		System.out.println(c);
		
		//0.몇이라서 짤렸을 ㄹ거임, 얜 long이어도 동일한 문제가 발생함 
		c = a/b;
		
		System.out.println(c); 
		
		// 자바는 정확하지 않음, 파이썬은 정확함 그래서 데이터분석 등에 사용되는 거
		c = a* a * b * b;
		
		System.out.println(c);
		

	}

}
