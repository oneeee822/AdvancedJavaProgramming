package day10;

public class TestAge {

	public static void main(String[] args) {
		
		int age = 23;
		
		try {
			CustomException.validate(age);
			System.out.println("The Age is OK..." + age);
		}
		catch(InvalidAgeException ex){
			System.out.println("Caught the exception");
			
			//printing the message from InvalidAgeException object
			System.out.println("Exception occurred: "+ ex);
		}


	}

}
