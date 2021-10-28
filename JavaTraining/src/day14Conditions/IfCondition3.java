package day14Conditions;

public class IfCondition3 {
	public static void main(String[] args) {
		// Creating two variables for age and weight
		int age = 20;
		int weight = 40;
		// applying condition on age and weight
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		}
	}
}