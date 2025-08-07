package day11;

public class SizeTest {

	public static void main(String[] args) {
		
		//Print the enum Size
		for(Size t : Size.values()) {
			System.out.println(t);
		}
		
		//Print the enum Size description
		for(Size t : Size.values()) {
			System.out.println(t.toString());
		}
	}

}
