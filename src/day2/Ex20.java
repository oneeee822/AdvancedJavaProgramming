package day2;

public class Ex20 {

	public static void main(String[] args) {
		
		double t = Double.parseDouble(args[0]);
		double h = Double.parseDouble(args[1]);
		
		if(t>=35) {
			if(h>=55) {
				System.out.println("The weather is too hot");
			} else {
				System.out.println("The weather is hot");
			}		
		}
		else if(t>=20) {
			if(h>=55) {
				System.out.println("Normal Summer weather");
			} else {
				System.out.println("Nice Summer weather");
			}
		}
		else if(t>=2) {
			System.out.println("Nice winter weather");
		}
		else {
			System.out.println("Very cold weather");
		}

	}

}
