package day7;

public class TestVolume {

	public static void main(String[] args) {
		
		//추상클래스는 인스턴스를 생성할 수 없음
		//Volume obj = new Volume();
		
		Rectangular box = new Rectangular();
		System.out.println(box.calcVolumn(6.0, 4.0, 2.0));

		Circle cyl = new Circle();
		System.out.println(cyl.calcVolumn(6.0, 4.0, 2.0));
		
		Square box1 = new Square();
		System.out.println(box1.calcVolumn(6.0, 4.0, 2.0));
	}

}
