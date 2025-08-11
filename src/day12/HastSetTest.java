package day12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HastSetTest {
	public static void main (String[] args) {
		
		Integer a, b, c;
		
		Set<Integer> setA = new HashSet<Integer>();
		List<Integer> list = new ArrayList<>();
		
		setA.add(3); list.add(3);
		setA.add(3); list.add(3);
		setA.add(5); list.add(5);
		setA.add(-3); list.add(-3);
		setA.add(13); list.add(13);
		setA.add(12); list.add(12);
		setA.add(0); list.add(0);
		setA.add(93); list.add(93);
		
		for(Integer t : setA) {
			System.out.print(t + " ");
		}
		
		System.out.println();
				
		for(Integer t : list) {
			System.out.print(t + " ");
		}
		
		//Copy to Array
		Integer[] setArr = new Integer[setA.size()];
		
		int i = 0;
		for(Integer t : setA) {
			setArr[i] = t;
			i++;
		}
		
		System.out.println();
		
		//for(Integer t : setArr) {
		//	System.out.print(t + " ");
		//	}
		
		setA.toArray(setArr);
		for(Integer t : setArr) {
			System.out.print(t + " ");
		}
		
	}
}
