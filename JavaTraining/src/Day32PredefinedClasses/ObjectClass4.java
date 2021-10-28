package Day32PredefinedClasses;
class Print extends Object{	
	int a=10;
	public int hashCode() {
		return 101;
	}
	public String toString() {
		return "I am Print Class toString";
	}
	public boolean equals(Object obj) {//Object obj=p2=new Print();//auto up casting
		Print p=(Print)obj;//explicit downcasting
		return (this.a==p.a);
			  //10 == 10
	}	
}
public class ObjectClass4{

	static int last_roll = 100;
	int roll_no;
	ObjectClass4()
    {
        roll_no = last_roll;
        last_roll++;
    }	
	public static void main(String args[]) {

		ObjectClass4 s1 = new ObjectClass4();
		System.out.println("s: toString of ObjectClass4: "+s1);//Day32String.ObjectClass4@jhuy98798
		System.out.println("s: hashCode of ObjectClass4: "+s1.hashCode());//68768757
		
		ObjectClass4 s2 = new ObjectClass4();
		System.out.println("s2: toString of ObjectClass4: "+s2);//Day32String.ObjectClass4@j546987548
		System.out.println("s2: hashCode of ObjectClass4: "+s2.hashCode());//68568686987
		System.out.println("s1 & s2 compare: "+s1.equals(s2));//false
		ObjectClass4 s3 =s2;
		System.out.println("s3 & s2 compare: "+s3.equals(s2));//false
		Print p1=new Print();
		System.out.println("toString of Print: "+p1);//I am Print Class toString
		System.out.println("hashCode of Print: "+p1.hashCode());//101
		Print p2=new Print();
		System.out.println("Comparing Print class object p1 & p2 with overriden equals() :"
								+p1.equals(p2));//true
	}
}
/*
 *  == --->compare two values
 *  d1.equals(d2) --> compare two objects based on there address
 * 
 */
