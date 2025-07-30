package day6;

public class Math1 {
	
	private double a;
	private double b;
	
	public Math1(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	
	// Getters and setters
	public double add() {
		return this.a + this.b;
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

	
	//Methods
	public void setB(double b) {
		this.b = b;
	}

	public double mult() {
		return this.a * this.b;
	}
	
	
}
