package day6;

public class SurfaceCal {

	public static void main(String[] args) {
		
		Surface obj = new Surface();
		
		int res; 
		
		res = obj.calSurface(4, 10);
		System.out.println(res);
		
		res = obj.calSurface(10);
		System.out.println(res);
	}

}
