package day6;

public class Math2NewM extends Math2New{

	double a;
	double b;
	
	public Math2NewM(double a, double b) {
		super(a, b);
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double myDiv() {
		
		return this.a / this.b;
	}
	
	@Override
	public double mySub() {
		
		return this.a - this.b;
	}
	
	
	
	
	
}
