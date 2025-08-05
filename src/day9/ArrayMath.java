package day9;

public class ArrayMath {

	//Create and add methods to adding two array, and test the method using unit testing
	//test
	//c [] addArray(arr1[], arr2[]);
	double[] arr1;
	double[] arr2;
	
	
	//Constructor
	public ArrayMath(double[] arr1, double[] arr2) {
		this.arr1 = arr1;
		this.arr2 = arr2;
	}
	

	//Getters and setters
	public double[] getArr1() {
		return arr1;
	}

	public void setArr1(double[] arr1) {
		this.arr1 = arr1;
	}

	public double[] getArr2() {
		return arr2;
	}

	public void setArr2(double[] arr2) {
		this.arr2 = arr2;
	}


	//Method
	public double[] addArray() {
		
		double[] arr = new double[this.arr1.length];
		
		for(int i = 0; i < this.arr1.length; i++) {
			arr[i] = this.arr1[i] + this.arr2[i];
		}
		
		return arr;
	}
}
