package Day32PredefinedClasses;
class Demo1223{
	//Rule1: constructor as private
	private Demo1223() {
		System.out.println("I am zero-param");
	}
	//Rule2: static instance
	static Demo1223 d1=new Demo1223();
	String name="Pune";
	//Rule3: static method with return type as class
	static Demo1223 getInstance() {
		return d1;
	}
	 void print() {
		 System.out.println("I am print() of Singleton class Demo1223 ");
	 }
}
public class SingletonClass2 {

	public static void main(String[] args) {
		//Demo1223 d1=new Demo1223();//compile time error due to singleton class concept
				//or
		Demo1223 d1=Demo1223.getInstance();//getInstance()=d1=new Demo1223();
		d1.print();
		System.out.println(d1.name);//Pune
		d1.name="Bangalore";
		System.out.println("d1 ref: "+d1.name);//Bangalore
		Demo1223 d2=Demo1223.getInstance();
		System.out.println("d2 ref: "+d2.name);//Bangalore
	}

}
