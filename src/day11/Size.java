package day11;

public enum Size {
	
	SMALL("Small", "S"),
	MEDIUM("Medium", "M"),
	LARGE("Large", "L");
	
	private String description;
	private String symbol;

	//Constructor
	private Size(String description, String symbol) {
		this.description = description;
		this.symbol = symbol;
	}

	//Getter and setter
	public String getDescription() {
		return description;
	}

	public String getSymbol() {
		return symbol;
	}
	
	public String toString() {
		return this.description + ", " + this.symbol;
	}
}
