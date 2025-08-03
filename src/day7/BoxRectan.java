package day7;

public class BoxRectan extends VolumeN{

	private double l;
	private double h;
	private double w;
	
	public BoxRectan(double h, double w, double l ) {
		super(h);
		this.l = l;
		this.h = h;
		this.w = w;
	}

	@Override
	public double baseSurface() {
		
		return l * h * w;
	}
	

	
	
}
