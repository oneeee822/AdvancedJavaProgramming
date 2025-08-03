package day7;

public abstract class VolumeN {

	private double h;
	//private double l;
	//private double w;
	
	//Constructors
	public VolumeN(double h) {
		this.h = h;
		//this.l = l;
		//this.w = w;
	}
	
	
	//Getters and setters
	public double getH() {
		return h;
	}



	public void setH(double h) {
		this.h = h;
	}


	/*
	public double getL() {
		return l;
	}



	public void setL(double l) {
		this.l = l;
	}



	public double getW() {
		return w;
	}



	public void setW(double w) {
		this.w = w;
	}
	*/


	//TODO Calculate Volume 
	public double calVolume() {
		return this.h * baseSurface();
	}
	
	//TODO Calculate Surface abstract method
	public abstract double baseSurface();
}
