package Day32PredefinedClasses;

import java.util.Scanner;

public class StringClass2 {

	public static void main(String[] args) {

//		String str1="DhanoriPune";//output: enuPironahD
//		String temp="";
//		//to print one by one character of string
////		for(int i=0;i<str1.length();i++) {
////			System.out.println(str1.charAt(i));
////		}
//		//
//		for(int i=str1.length()-1;i>=0;i--) {
//			temp=temp+str1.charAt(i);
//		}
//		System.out.println("str1: "+str1);
//		System.out.println("temp: "+temp);
//		System.out.println(reverseString("DhanoriPune"));
//		
//		String s1="Bangalore";
//		System.out.println(reverseString(s1));
//		
//		Scanner scn=new Scanner(System.in);
//		String s2;
//		System.out.println("Enter String to be reverse: ");
//		s2=scn.next();
//		System.out.println("Reverse String is: "+reverseString(s2));
		
		//System.out.println(palinString("abcd"));
		Scanner scn=new Scanner(System.in);
		String s2;
		System.out.println("Enter string to check for palindrome");
		s2=scn.next();
		palinString(s2);
		
	}
	
	static String reverseString(String str) {
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		return temp;
	}
	
	static void palinString(String str) {
		String s1=str;
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		if(temp.equals(s1)) {
			System.out.println("Given string is a palindrome..."+str);
		}else {
			System.out.println("Given string is not a palindrome..."+str);
		}
	}
	static String palinString2(String str) {
		String s1=str;
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		if(temp.equals(s1)) {
			return "Given string is a palindrome..."+str;
		}else {
			return "Given string is not a palindrome..."+str;
		}
	}
}
