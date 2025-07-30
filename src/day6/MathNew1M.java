package day6;

public class MathNew1M extends MathNew1{

	private double a;
	private double b;
	
	//Constructor
	public MathNew1M(double a, double b) {
		super(a, b);
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
	
	//Methods
	public double div() {
		if(this.b != 0) {
			return this.a / this.b ;
		}
		else {
			return Double.POSITIVE_INFINITY;
		}
	}
	
	public double rem() {
		return this.a % this.b ;
	}
	
}
