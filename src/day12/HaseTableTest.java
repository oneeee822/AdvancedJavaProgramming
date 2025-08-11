package day12;

import java.util.Hashtable;

public class HaseTableTest {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> HtName = new Hashtable<Integer, String>();
		//HashMap HtMap = new HashMap();
		
		HtName.put(0,"Donald Trump");
		HtName.put(1,"Elon Musk");
		HtName.put(2,"Christiano Ronaldo"); //같은 키를 가지고 있는 애들 

		System.out.println(HtName);
		
		for(int i = 0; i< HtName.size(); i++) {
			System.out.println(HtName.get(i));
		}
		
		System.out.println(HtName.getOrDefault(2, null));
	}

}
