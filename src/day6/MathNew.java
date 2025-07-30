package day6;

public class MathNew extends Math{

	double a;
	double b;
	
	public MathNew(double a, double b) {
		super(a, b);
		this.a = a;
		this.b = b;
	}
	
	public double div() {
		return this.a / this.b;
	}
	
	public double sub() {
		return this.a - this.b;
	}
	
}
