package day9;

public class Calculation {

	private double a;
	private double b;
	
	//Constructor
	public Calculation(double a, double b) {
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
		return a + b;
	}
	
	public double mut() {
		return a * b;
	}
	
	public double surface() {
		return Math.PI * this.a * this.a;
	}
	
}
