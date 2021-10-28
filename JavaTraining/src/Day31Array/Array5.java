package Day31Array;

class TestReturnArray {
	// creating method which returns an array	
	static int[] getArray() {
		return new int[] { 10, 30, 50, 90, 60 };
		//int[] getArray =new int[] { 10, 30, 50, 90, 60 };
	}
}
public class Array5 {
	public static void main(String args[]) {
		// calling method which returns an array
		int arr[] = TestReturnArray.getArray();//{ 10, 30, 50, 90, 60 };
		// printing the values of an array
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
