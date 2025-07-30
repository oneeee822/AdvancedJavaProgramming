package day6;

public class Surface {

	public int calSurface(int length) {
		return length * length;
	}
	
	public int calSurface(int length, int width) {
		return length * width;
	}

	/* 얜 매개변수 자료형이 같아서 안됨 
	 *	public double calSurface(int radius) {
	 * 	return Math.PI * radius * radius;
	 *	}
	*/
}
