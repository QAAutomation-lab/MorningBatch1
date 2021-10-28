package day13Constructor;

public class ThisKeywordSample1 {

	int age=25;//non-static global variable
	void display() {
		int age=50;//local variable
		System.out.println("age: "+age);//50
		System.out.println("NSG variable: "+this.age);//25
	}
	public static void main(String[] args) {
		ThisKeywordSample1 t1=new ThisKeywordSample1();		
		t1.display();
		System.out.println("age: "+t1.age);//25
	}
}

/**
this --> its a keyword which is an instance of current class, used to differentiate local and'
         global variable when they have same name.
         Always used for non-static member only
*/