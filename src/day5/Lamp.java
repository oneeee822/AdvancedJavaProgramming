package day5;

public class Lamp {
	
	//Attributes
	boolean isOn;

	
	//Methods
	
	/*
	 * public void turnOn() {
	 * 	isOn = true;
	 * }
	 * 
	 * public void turnOff() {
	 * 	isOn = false;
	 * }
	*/
	
	public void switchLamp() {
		isOn = !isOn;
	}
	
	public void checkStatus() {
		
		if(isOn) {
			System.out.println("Lamp is ON");
		}
		else {
			System.out.println("Lamp is OFF");
		}
		
	}
}