package Day32PredefinedClasses;

public class ObjectClass3 extends Object{

	static int last_roll = 100;
	int roll_no;
	// Constructor
	ObjectClass3()
    {
        roll_no = last_roll;
        last_roll++;
    }
	@Override
    public String toString()
    {
        return "BasicCoreJava";
    }

	// Driver code
	public static void main(String args[]) {
		ObjectClass3 s = new ObjectClass3();

		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
	}

}
