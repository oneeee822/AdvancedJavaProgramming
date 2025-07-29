package day5;

public class Ex11 {

	public static void main(String[] args) {
		
		int n = 3;
		move(n, true);

	}
	
	public static void move(int n, boolean left) {
		
		if(n==0)return;
		
		move(n-1, !left);
		
		if(left) {
			System.out.println(n + " moves to Left");
		}
		else {
			System.out.println(n + " moves to Right");
		}
		
		move(n-1, !left);
	}

}
