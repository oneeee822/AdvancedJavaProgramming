package day6;

public class CalculationTest {

	public static void main(String[] args) {
		
		Calculation obj = new Calculation();
		
		double res;
		
		res = obj.add(23.7, 85.2);
		System.out.println("Addition : " + res);
		
		res = obj.mut(23.7, 85.2);
		System.out.println("Multiplication : " + res);
		
		CalculationNew obj1 = new CalculationNew();
		
		res = obj1.div(2.9, 7.6);
		System.out.println("Division : " + res);
		
		res = obj1.sub(2.9, 7.6);
		System.out.println("Substration : " + res);
		
		res = obj1.add(23.7, 85.2);
		System.out.println("Addition : " + res);
	}

}
