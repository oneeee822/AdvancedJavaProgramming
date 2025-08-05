package day9;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Ex2Test {
	
	double[] arr1 = {1.0, 14.3, 54.21, 53.8, 4.1};
	double[] arr2 = {1.0, 14.3, 54.21, 53.8, 4.1};
	ArrayMath obj1 = new ArrayMath(arr1, arr2);
	
	
	@Test 
	void testingAddArray() { 
		

		double[] expArr = {2.0, 28.6, 108.42, 107.6, 8.2};
		
		assertArrayEquals(expArr, obj1.addArray());
	}

}
