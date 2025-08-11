package day12;

import java.util.ArrayList;
import java.util.List;

public class ListCleanTest {

	public static void main(String[] args) {
		//Create List of Integers
		//2, 0, 16, -8, 9, 7, 12, -4, 0, 18
		//print only the positive numbers
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> nlist = new ArrayList<Integer>();
		
		list.add(2);
		list.add(0);
		list.add(16);
		list.add(-8);
		list.add(9);
		list.add(7);
		list.add(12);
		list.add(-4);
		list.add(0);
		list.add(18);
		
		for(Integer t : list) {
			System.out.print(t>0 ? t+ " " : "");
		}
		
		System.out.println();
		
		list.forEach(t -> {
			if(t>0) System.out.print(t+" ");
		});
		
		System.out.println();
		
		//이거 많이 씀 
		list.stream().filter(t -> t > 0).forEach(System.out::println);

		//Even numbers in new List 
		list.stream().filter(t -> t%2==0).forEach(t -> nlist.add(t));
		System.out.println(nlist);
	}

}
