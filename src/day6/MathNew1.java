package day6;

public class MathNew1 extends Math1{

	private double a;
	private double b;
	
	public MathNew1(double a, double b) {
		super(a, b);
		this.a = a;
		this.b = b;
	}
	
	
	//Getters and setters
	public double getA() {
		return a;
	}

	public void setA(double a) {
		super.setA(a);
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		super.setB(b);
		this.b = b;
	}
	
	//Methods
	public double div() {
		return this.a / this.b;
	}

	public double sub() {
		return this.a - this.b;
	}
	
}
