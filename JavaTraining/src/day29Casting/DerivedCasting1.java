package day29Casting;
class Parent{
	// Function
	void show() {
		// Print message for this class
		System.out.println("Parent show method is called");
	}
	void callme() {
		System.out.println("Parent callme method is called");
	}
}
class Child extends Parent {
	void readme() {
		System.out.println("Child readme method is called");
	}
}
public class DerivedCasting1 {
	// Main driver method
	public static void main(String[] args) {
		//Object of Child class and reference of child class
		Child c1=new Child();
		c1.readme();
		c1.callme();
		c1.show();
		//Object of Parent class and reference of Parent class
		Parent p1=new Parent();
		p1.show();
		p1.callme();		
		// Creating a Parent class object but referencing it to a Child class
		Parent obj = new Child();//auto-up/implicit up casting
		obj.show();
		obj.callme();
		//obj.readme();
		Child c2=new Child();
		c2.readme();
		c2.callme();
		c2.show();
		Parent p2=(Parent)c2;//explicit up casting
				//or
		//Parent p2=c2;
				//or
		//Parent p2=(Parent)new Child();
		p2.show();
		p2.callme();
		//p2.readme();
	}
}









