package day12;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {

	public static void main(String[] args) {
		
		Map<String, Double> employees = new HashMap<String, Double>();
		
		employees.put("Emily Davis", 91000.00);
		employees.put("John Doe", 75000.00);
		employees.put("Jane Smith", 82000.00);
		employees.put("Robert Johnson", 68000.00);
		
		for(Map.Entry<String, Double> entry : employees.entrySet())
			System.out.println(entry.getKey()+ " " + entry.getValue());
		
		
		

	}

}
