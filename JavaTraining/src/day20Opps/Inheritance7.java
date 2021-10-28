package day20Opps;
//parent class
class fruits{
	int fruitAge;
	fruits() {
		System.out.println("fruit class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
// child class of fruit
class orange extends fruits {
	int fruitAge;
	orange() {
		// super(); //java compiler will write default super()
		System.out.println("orange class Cons..");
		fruitAge = 5;
	}
	public void shape() {
		System.out.println("orange is round");
		System.out.println("Orange fruitAge: "+fruitAge);
		System.out.println("Fruits fruitAge: "+super.fruitAge);
		taste();//super.taste();
	}
}
public class Inheritance7 {

	public static void main(String[] args) {

		System.out.println("*******************************************");
		orange o1=new orange();
		o1.shape();
		System.out.println("*******************************************");
	}

}
/**
 * this(): instance of current class,is used to call another constructor of same class bases on its parameter
 * super(): instance of parent class,is used to call parent class constructor from child class based on its parameter
 * 
 * this: instance of current class, use to differentiate local and global variable when they have same name and used
 * only in non-static method
 * 
 * super: instance of parent class, use to differentiate child class and parent class variable/method when they have
 * same name and used only in non-static method
 */
