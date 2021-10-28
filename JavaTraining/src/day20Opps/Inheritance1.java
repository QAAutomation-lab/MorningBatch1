package day20Opps;

//super class/ parent class
class A1 {
	static int a = 10;
	int b = 20;
	double c = 13.45;
}
//subclass / child class, B1 inherits class A1 non-static members(variable and method)
class B1 extends A1 {
	static int x = 30;
	int y = 40;
	double z = 53.45;
	/* Class A1 non-static members */
	//	int b=20;
	//	double c=13.45;
}

//C1 inherits class B1 non-static members
class C1 extends B1 {
	static int p = 50;
	int q = 60;
	double r = 66.45;
	/* Class A1 non-static members */
	//	int b=20;
	//	double c=13.45;
	/* Class B1 non-static members */
	//	int y = 40;
	//	double z = 53.45;
}

public class Inheritance1 {

	public static void main(String[] args) {
		/**
		 * Static members are not involve in inheritance because they are class members
		 */
		/****************** Access static member class A members *********************/
		System.out.println("Class A1 static variable: " + A1.a);
		/****************** Access static member class B members *********************/
		System.out.println("Class B1 static variable: " + B1.x);
		/****************** Access static member class C members *********************/
		System.out.println("Class C1 static variable: " + C1.p);

		/******* Access non-static member class A1,B1 & C1 members*******************/
		System.out.println("*******************************************");
		C1 c1 = new C1();
		System.out.println("Member of class A1, accessed from class C1 : " + c1.b);
		System.out.println("Member of class A1, accessed from class C1 : " + c1.c);
		System.out.println("Member of class B1, accessed from class C1 : " + c1.q);
		System.out.println("Member of class B1, accessed from class C1 : " + c1.r);
		System.out.println("Member of class C1, accessed from class C1 : " + c1.y);
		System.out.println("Member of class C1, accessed from class C1 : " + c1.z);
		System.out.println("*******************************************");
	}

}
