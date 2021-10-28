package day37exceptionHandling;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		// 1. abnormal statements
		int[] empIds = { 12, 20, 30 };
		try {
			System.out.println(empIds[3]);// ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled.." + e);
		}
		System.out.println("Programs ends here...");
	}
}
