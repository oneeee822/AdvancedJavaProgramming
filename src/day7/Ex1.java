package day7;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printHello b = () -> System.out.println("Hello!");
		
		/* 여러줄적는
		 * printHello b = () -> {
		 * System.out.println("Hello!");
		 * System.out.println("Hello!");
		 * System.out.println("Hello!");
		 * };
		 */
		
		b.printH(); //인터페이스 메소드에 의해서만 호출됨
	}
	
	public static void printHello() {
		System.out.println("Hello!");
	}

}
