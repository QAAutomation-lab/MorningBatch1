package day13Constructor;

public class MethodOverloading4 {

	public static void main(int g) {
		System.out.println("Main Method with int argument Executing");
		System.out.println(g);
	}

	public static void main(char x) {
		System.out.println("Main Method with char argument Executing");
		System.out.println(x);
	}

	public static void main(String[] args) {
		System.out.println("Original main Executing");
		MethodOverloading4.main(12);
		MethodOverloading4.main('c');
		MethodOverloading4.main(1236);
	}
}
/**
f6: execute current statement and move to next statement 
f5: if its a method call dn go inside the method
f8: continue the execution
*/