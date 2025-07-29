package day4;

import java.util.ArrayList;
import java.util.List;

public class Ex9 {

	public static void main(String[] args) {
		// List declaration
		double a, b;
		List myList = new ArrayList();

		myList.add(22);
		myList.add(44.8);
		myList.add(33.8);
		myList.add(-2);
		
		//Print the List
		System.out.println(myList);
		
		myList.add("one");
		myList.add(true);
		
		System.out.println(myList);
		
		//List에는 인덱스 없음 
		// a = myList[0];
		
		//List는 Object를 반환해서 타입캐스팅을 해줘야 됨 
		//에러는 없지만 String을 double로 바꿔서 에러남
		//a = (double)myList.get(0);
		//b = (double)myList.get(4);
		
		//Print element by element
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		//Add element at the beginning of the list
		myList.addFirst("First");
		System.out.println(myList);
		
		//Add element at the end of the list
		myList.addLast("Last"); // same myList.add("Last");
		System.out.println(myList);
		
		//Add element at the middle of the list
		myList.add(2, "middle"); 
		System.out.println(myList);
		
		//Remove one element
		myList.remove(0); 
		System.out.println(myList);
		
		myList.remove(true); 
		System.out.println(myList);
		
		//cannot remove elements that does not exist
		//myList.remove(-4);
		
		myList.clear();
		System.out.println(myList);
	}

}
