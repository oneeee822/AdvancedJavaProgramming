package day6;

public class OuterClass {
	
	//Attributes
	private String name;
	private double number;
	
	
	//Constructors
	public OuterClass() {
		
	}

	public OuterClass(String name, double number) {
		this.name = name;
		this.number = number;
	}
	
	
	//Getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getNumber() {
		return number;
	}


	public void setNumber(double number) {
		this.number = number;
	}

	
	//Method
	@Override
	public String toString() {
		return "OuterClass [name=" + this.name + ", number=" + this.number + "]";
	}
	
	
}
