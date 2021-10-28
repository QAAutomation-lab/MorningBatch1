package day29Casting;
class Parent100{
	void myHome() {
		System.out.println("Parent home");
	}
}
class Child100 extends Parent100{
	void myCar() {
		System.out.println("Child car");
	}
}
public class Casting {

	public static void main(String[] args) {

		Parent100  p1=new Child100();//auto-upcating or implicit upcasting//myhome(), myCar()
//		Child100 c1=new Child100();
//		Parent100 p2=(Parent100)c1;//explicit upcasting
		//Child100 c1=new Parent100();//no implicit downcasting//myHome()
		Parent100 c1=new Parent100();		
		Child100 c2=(Child100)p1;//explicit downcasting
	}
}
