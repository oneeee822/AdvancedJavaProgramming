package day6;

public abstract class Math2New extends Math1{
	
	private double a;
	private double b;
	
	
	public Math2New(double a, double b) {
		super(a, b);
		this.a = a;
		this.b = b;
	}


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
	
	
	//Uncompleted methods
	//TODO by wonhee~ 이런 거 나타내려고 추상클래스 쓰는 거
	public abstract double myDiv();
	public abstract double mySub();
	
	

}
