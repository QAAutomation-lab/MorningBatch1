package day13Constructor;

public class ThisStatementClass {
	ThisStatementClass(){
		System.out.println("I am zero-param cons...");
	}
	ThisStatementClass(int i){
		this();
		System.out.println("I am int-param cons...");
	}
	ThisStatementClass(double d){
		this(15);
		System.out.println("I am double-param cons...");
	}
	ThisStatementClass(char c){
		this(25.15);
		System.out.println("I am char-param cons...");
	}
	public static void main(String[] args) {
	
//		ThisStatementClass t1=new ThisStatementClass();
//		ThisStatementClass t2=new ThisStatementClass(25);
//		ThisStatementClass t3=new ThisStatementClass(15.6);
//		ThisStatementClass t4=new ThisStatementClass('A');
				//or
		ThisStatementClass t1=new ThisStatementClass('A');
	}
}
/**
 this() statement, instance of current class, used to call another constructor of current class based on 
 		 its parameter.
 		 its should be the first statement inside constructor body
 */
