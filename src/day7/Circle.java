package day7;

public class Circle extends Volume{

	@Override
	public double surface(double l, double w) {
		
		return Math.PI * l * w;
	}
	
	
}
