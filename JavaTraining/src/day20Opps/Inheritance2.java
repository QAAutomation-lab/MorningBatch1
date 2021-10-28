package day20Opps;
//parent class
class fruit {
//	fruit()
//	{
//		
//	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
// child class of fruit
class apple extends fruit {
//	apple(){
//		super();//default super() statement written by compiler
//	}
	public void shape() {
		System.out.println("Apple is round");
	}
	
//	public void taste() {
//		System.out.println("Fruits are sweet");
//	}
}
public class Inheritance2 {
	public static void main(String[] args) {
		apple fr = new apple(); // object of child class
		fr.taste(); // call method of parent class
		fr.shape(); // call method of child class
	}
}