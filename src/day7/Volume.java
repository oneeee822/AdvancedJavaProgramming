package day7;

public abstract class Volume{
	
	public double calcVolumn(double h, double l, double w) {
		return h * surface(l, w);
	}
	
	public abstract double surface(double l, double w);

}
