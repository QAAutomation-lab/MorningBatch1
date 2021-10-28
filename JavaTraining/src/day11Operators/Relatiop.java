package day11Operators;

public class Relatiop {

	public static void main(String[] args) {
		// Variables Definition and Initialization
		int num1 = 12, num2 = 4;
		System.out.println("num1: " + num1 + "--->num2: " + num2);// 12 4
		// is equal to
		//boolean res = (num1 == num2);
		//System.out.println("num1 == num2 = " + res);// false
				//or
		System.out.println("num1 == num2 = " + (num1 == num2));// false
		// is not equal to
		System.out.println("num1 != num2 = " + (num1 != num2));// true
		// Greater than
		System.out.println("num1 >  num2 = " + (num1 > num2));// true
		// Less than
		System.out.println("num1 <  num2 = " + (num1 < num2));// false
		// Greater than or equal to
		System.out.println("num1 >= num2 = " + (num1 >= num2));// true
		// Less than or equal to
		System.out.println("num1 <= num2 = " + (num1 <= num2));// false

	}
}