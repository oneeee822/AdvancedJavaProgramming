package Statistic;

public class StdRandom {
	
	public static double Uniform(int N) {
		
		return Math.random()*N;
	}
	
	public static double Uniform(int lo, int hi) {
		
		return lo + Math.random() * (hi - lo);
		
	}
	
	//Normal Gaussian
	public static double Gaussian() {
		
		double x;
		
		x = Math.random();
		
		return Math.exp(- x * x /2)/(2*Math.PI);

	}
	
	//Gaussian Distribution
	public static double Gaussian(double mu, double sd) {
		
		return (Gaussian()-mu)/sd;
		
	}
	
	//Bernoulli Distribution
	public static boolean Bernoulli(double p) {
		return Math.random() < p;
	}

}
