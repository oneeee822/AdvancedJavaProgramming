package day6;

public class TestInner {

	public static void main(String[] args) {
		
		OuterClass obj1 = new OuterClass("Donald", 44.8);
		String str = obj1.toString();

		System.out.println(str);
		
		//Inner클래스 선언 방법 
		OuterClass.Inner inObj = obj1.new Inner();
		
		inObj.printName();
	}

}
