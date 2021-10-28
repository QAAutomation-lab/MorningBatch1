package day20Opps;

//parent class
class Company101 {
	void display() {
		System.out.println("I am company class display()...");
	}
}
// child class of Company
class Employee101 extends Company101 {
	void display() {
		System.out.println("I am Employee class display()...");
		super.display();
	}
	void callme() {
		System.out.println("I am Employee class callme()...");
	}
}
public class Inheritance9 {

	public static void main(String[] args) {
		Employee101 e1=new Employee101();
		e1.display();
		e1.callme();
		System.out.println("****************************");
		Company101 c1=new Company101();
		c1.display();
		System.out.println("****************************");
		Company101 e2=new Employee101();
		e2.display();
	}
}
