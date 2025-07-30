package day6;

public class MathTest {

	public static void main(String[] args) {
		
		Math obj1 = new Math(12.8, 7.9);
		
		System.out.println(obj1.add());
		System.out.println(obj1.mult());
		
		
		MathNew obj2 = new MathNew(12.8, 7.9);
		
		System.out.println(obj2.add());
		System.out.println(obj2.mult());
		System.out.println(obj2.div());
		System.out.println(obj2.sub());

	}

}
