package day9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class Ex1 {

	@Test //자바한테 이게 테스트라는 걸 알려준다는 어노테이션이라는 뜻  
	@DisplayName("This is Addition Testing")
	void testintAdd() { // 하나만 테스트 해야한다는 듯 
		
		Calculation obj1 = new Calculation(2.6, 4.8);
		double expected = 7.4;
		double actual = obj1.add();
		
		assertEquals(actual, expected);

		//fail("Not yet implemented");
		//System.out.println("This is my first test");
	}
	
	
	@Test 
	@DisplayName("This is Multiplication Testing")
	@Disabled
	void testingMult() { 
		
		Calculation obj1 = new Calculation(2.6, 4.8);
		double expected1 = 12.48;
		
		assertEquals(obj1.mut(), expected1);
	}
	
	@RepeatedTest(40)
	@DisplayName("This is Surface Testing")
	void testSurface() { 
		
		Calculation obj1 = new Calculation(2.6, 4.8);
		double ex = 3.14 * 2.6 * 2.6;
		
		assertEquals(obj1.surface(), ex, 0.1);
	}

}
