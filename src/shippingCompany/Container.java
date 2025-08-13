package shippingCompany;


public class Container {
	
	private double length;
	private double width;
	private double hight;
	private double cost;
	
	//Constructor
	public Container(double length, double width, double hight, double cost) {
		this.length = length;
		this.width = width;
		this.hight = hight;	
		this.cost = cost;
	}

	//Getters and setters
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}
	
	public double volume() {
	    return length * width * hight; 
	}
	
}
