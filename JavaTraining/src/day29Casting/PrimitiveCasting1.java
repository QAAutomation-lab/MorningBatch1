package day29Casting;

public class PrimitiveCasting1 {

	public static void main(String[] args) {
		
		int myInt = 9;
		double myDouble = myInt;//auto-widening or implicit widening
		double d=(double)myInt;//explicit widening
		System.out.println(myInt); // Outputs 9
		System.out.println(myDouble); // Outputs 9.0
		System.out.println(d);//9.0
		
		double salary=23400.67856856898989545d;		
		int sal=(int)salary;//explicit narrowing	--->23400	
		long f=(long)salary;//explicit narrowing	--->23400.678	
		System.out.println("Actual Salary: "+salary);
		System.out.println("Int Salary: "+sal);
		System.out.println("long Salary: "+f);
	}

}
