package day9;

public class CalculationTest {

	//이게 메뉴얼 테스트?라는 듯 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculation obj1 = new Calculation(2.6, 4.8);
		double expected = obj1.add();
		double actual = 7.2;
		
		if(expected == actual) {
			System.out.println("Correct program results");
		} else {
			System.out.println("Wrong results error in add method");
		}
		
	}

}
