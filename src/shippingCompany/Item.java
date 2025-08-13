package shippingCompany;

public class Item {
	
	private double length;  
	private double width;
	private double hight;
	private double weight;
	private int quantity;
	private String name;
	
	//Constructor
	public Item(String name, double length, double width, double hight, double weight, int quantity) {
		this.length = length/100;
		this.width = width/100;
		this.hight = hight/100;
		this.weight = weight;
		this.quantity = quantity;
		this.name = name;
	}

	//Getters and setters
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Methods
	public double volume() {
		return this.hight * this.length * this.width;
	}
	
	public double totalVolume() {
		return volume() * this.quantity;
	}
	
	public double totalWeight() {
		return this.weight * this.quantity;
	}

}
