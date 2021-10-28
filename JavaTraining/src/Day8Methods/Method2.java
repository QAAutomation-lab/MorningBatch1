package Day8Methods;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Method2 {

	static double x = 10, y = 20, z = 30;

	// static double x,y,z;
	public static void main(String[] args) {
		// x=10;
		// y=20;
		// z=30;
		System.out.println("Input the first number: " + x);
		System.out.println("Input the second number: " + y);
		System.out.println("Input the third number: " + z);
		//System.out.println("The average value is " + Method2.average());
		//average();
		double res=Method2.average();
		System.out.println("Average: "+res);
		
		System.out.println("New Average: "+average(12, 15, 17));
		System.out.println("New Average: "+average(22, 55, 18));
		System.out.println("New Average: "+average(15, 15, 17));
		int p=55,q=58,r=82;
		System.out.println("New Average2: "+average(p,q,r));
		//Method2.addition(25, 55);
				//or
		//double sum=Method2.addition(25, 55);
		//System.out.println("Addition of two number: "+sum);
				//or
		System.out.println("Addition of two number: "+Method2.addition(25, 55));
	}
	public static double average(int a,int b,int c) //int a=12,int b=15,int c=17;
													//int a=p=55,int b=q=58,int c=r=82;
	{
		return (a+b+c)/3;
	}
	public static double average() {
		return (x + y + z) / 3;
	}
	
//	public static void addition(double a,double b) {
//		//double res=a+b;
//		//System.out.println("addition of "+a+" and "+b+" : "+res);
//		System.out.println("addition of "+a+" and "+b+" : "+(a+b));
//	}
	public static double addition(long a,int b) {
		//double res=a+b;
		//System.out.println("addition of "+a+" and "+b+" : "+res);
		//System.out.println("addition of "+a+" and "+b+" : "+(a+b));
		//or
		//return res;
		//or
		return (a+b);
	}
	//Addition of two numbers
	//Multiplication of two numbers
	//division of two number
}
