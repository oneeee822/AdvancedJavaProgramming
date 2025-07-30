package day6;

public class Pet {

	//Attributes
	String type;
	String name;
	double originalPrice;
	double dailyExp;
	int day;
	double profit = 0.15;
	
	//Constructor
	public Pet(String type, String name, int day) {
		super();
		this.type = type;
		this.name = name;
		this.day = day;
		
		switch(type) {
		case "cats":
			this.dailyExp = 10;
			break;
		case "dogs":
			this.dailyExp = 15;
			break;
		case "birds":
			this.dailyExp = 8;
			break;
		default:
			this.dailyExp = 5;
			break;
		}
	}
	
	//Getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDailyExp() {
		return dailyExp;
	}

	public void setDailyExp(double dailyExp) {
		this.dailyExp = dailyExp;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	

	//Method
	public void calculatePrice() {
		
		double expensis = this.dailyExp * this.day;
		double totalPrice = this.originalPrice + expensis;
		System.out.println(totalPrice * this.profit + totalPrice);
		
	}
	
}
