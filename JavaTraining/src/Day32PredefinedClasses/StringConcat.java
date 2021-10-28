package Day32PredefinedClasses;

public class StringConcat {

	public static void main(String[] args) {
		
		String str="Pune"+1536;
		System.out.println(str);
		String str1=str.concat(null);//Null Pointer Exception
		System.out.println(str1);
	}
}
