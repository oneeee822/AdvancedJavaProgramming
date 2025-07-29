package day2;

public class Ex10 {

	public static void main(String[] args) {
		
		int year = 2010;
		
		boolean isLeap;
		
		
		isLeap = year%400==0 || ((year%4==0)&(year%100!=0));
		
		System.out.println(isLeap);
		
		String str = (isLeap) ? "This is leap year." : "This is not leap year.";
		
		System.out.println(str);
		
		// 한 줄
		//System.out.println((year%400==0 || ((year%4==0)&(year%100!=0))) ? "This is leap year." : "This is not leap year.");
		
		
		
		/***
		if(year%400==0 || ((year%4==0)&(year%100!=0))){
			System.out.println(year+" is leap year.");
		}
		else {
			System.out.println(year+" is not leap year.");
		}
		***/
	}

}
