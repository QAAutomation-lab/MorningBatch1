package day13Constructor;

import java.util.Scanner;
class SampleCons2 {

	SampleCons2() {
		main();
	}
	int age=25;
	static double salary=2536.346;
	public void main() {
		int i, j, res;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of i : ");
		i = scan.nextInt();
		System.out.print("Enter value of j : ");
		j = scan.nextInt();
		scan.close();
		res = i + j;
		System.out.println("The sum of i and j is : " + res);
	}
}
public class SampleCons {

	SampleCons() {
		main();
	}
	int age=25;
	static double salary=2536.346;
	public void main() {
		int i, j, res;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of i : ");
		i = scan.nextInt();
		System.out.print("Enter value of j : ");
		j = scan.nextInt();
		scan.close();
		res = i + j;
		System.out.println("The sum of i and j is : " + res);
	}

	public static void main(String[] args) {
		SampleCons d = new SampleCons();
		
	}
}
