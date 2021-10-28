package day20Opps;
interface Printable {
	int age=30;//by default public static final
	void print();
}
interface Showable {
	void show();
}
class Interface3 implements Printable, Showable {
	public void print() {
		System.out.println("Hello, print");
	}
	public void show() {
		System.out.println("Welcome, show");
	}
	public static void main(String args[]) {
		Interface3 obj = new Interface3();
		obj.print();
		obj.show();
		System.out.println(Printable.age);
	}
}