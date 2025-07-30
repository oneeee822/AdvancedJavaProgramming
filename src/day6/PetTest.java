package day6;

public class PetTest {

	public static void main(String[] args) {
		Pet cat = new Pet("cats", "neco", 5);
		Pet dog = new Pet("dogs", "and", 5);
		Pet bird = new Pet("birds", "popo", 5);
		
		cat.calculatePrice();
		dog.calculatePrice();
		bird.calculatePrice();
	}

}
