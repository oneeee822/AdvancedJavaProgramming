package day6;

public class MathTest1 {

	public static void main(String[] args) {
		
		Math1 obj1 = new Math1(24.0, 6.0);
	
		System.out.println(obj1.add());
		System.out.println(obj1.mult());
		
		System.out.println("------------------------------");
		
		MathNew1 obj2 = new MathNew1(24.0, 6.0);
		
		System.out.println(obj2.add());
		System.out.println(obj2.mult());
		System.out.println(obj2.div());
		System.out.println(obj2.sub());
		
		//super class에 있는 메소드를 사용하기 때문에 super class a,b도 바꿔줘야 함  
		System.out.println("------------------------------");
		obj2.setB(6.0);
		System.out.println(obj2.add());
		System.out.println(obj2.mult());
		System.out.println(obj2.div());
		System.out.println(obj2.sub());

		System.out.println("------------------------------");
		
		MathNew1M obj3 = new MathNew1M(24.0, 6.0);
		
		System.out.println(obj3.add());
		System.out.println(obj3.mult());
		System.out.println(obj3.div());
		System.out.println(obj3.sub());
		System.out.println(obj3.rem());
		
		System.out.println("------------------------------");
		
		Formula obj4 = new Formula(25.0, 6.0);
		
		System.out.println(obj4.add());
		System.out.println(obj4.myFormula());
		
		System.out.println("------------------------------");
		
		Math2NewM obj5 = new Math2NewM(24.0, 6.0);
		System.out.println(obj5.add());
		System.out.println(obj5.mult());
		System.out.println(obj5.myDiv());
		System.out.println(obj5.mySub());
	
	}

}
