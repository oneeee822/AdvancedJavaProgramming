package day7;

public class CylinBox extends VolumeN {

	//private double h;
	private double r;
	
	public CylinBox(double h, double r) {
		super(h);
		//this.h = h;
		this.r = r;
	}

	@Override
	public double baseSurface() {
		
		return Math.PI * r * r;
	}
	
	
	
}
