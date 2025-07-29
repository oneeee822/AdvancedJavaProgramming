package day2;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		
		double x, y, z;
		
		a = 8;
		
		System.out.println(a);
		
		x = a;
		
		System.out.println(x);
		
		y = 18.9;
		a = (int)y;
		
		System.out.println(a);
		
		String s = "12";
		
		//int를 string으로 바꿀 수 있음 
		String s1 = s + a;
		
		System.out.println(s1);
		
		//이렇게 형변환 해줘야 
		b = Integer.parseInt(s1);
		c = b + a;
		
		System.out.println(c);
	}

}
