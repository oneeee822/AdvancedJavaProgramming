package day6;

public class Formula extends MathNew1{

	double a;
	double b;
	
	//Constructor
	public Formula(double a, double b) {
		super(a,b);
		this.a = a;
		this.b = b;
	}
	
	//Getters and setters 
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	//Method
	public double add() {
		return this.a + 2 * this.b;
	}
	
	public double myFormula() {
		return mult() - add();
		/* 이렇게 하면 super class의 add()가 호출됨 
		 * return mult() - super.add();
		 */
	}
}
