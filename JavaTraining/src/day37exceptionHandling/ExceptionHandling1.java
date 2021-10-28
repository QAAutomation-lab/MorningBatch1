package day37exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		Scanner scn=new Scanner(System.in);
		//1. abnormal statements
		int i,j,res;
		System.out.println("Enter Number1: ");
		i=scn.nextInt();
		System.out.println("Enter Number2: ");
		j=scn.nextInt();
		try {
		res=i/j;
		System.out.println("Res: "+res);
		}catch(Throwable e) {//Exception e =new ArithmeticException();
			System.out.println("Exception type: "+e);
		}
		System.out.println("Programs ends here...");
	}
}