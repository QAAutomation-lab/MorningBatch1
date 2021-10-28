package day17This;
class Student101 {
	int rollno;
	float fee;
	Student101(int rollno) {
		this.rollno = rollno;
	}
	Student101(int rollno, float fee) {
		this(rollno);//reusing constructor
		this.fee = fee;
	}
	void display() {
		System.out.println(rollno + " " + fee);
	}
}
class ThisStatement3 {
	public static void main(String args[]) {
		System.out.println("**********************Creating S1 object***************************");
		Student101 s1 = new Student101(111);//
		System.out.println(s1.rollno + " " + s1.fee);//111 0.0
		System.out.println("**********************Creating S2 object***************************");
		Student101 s2 = new Student101(112, 6000f);//112  6000.0
		System.out.println(s2.rollno + " " + s2.fee);//112  6000.0
		System.out.println("*****************Display()*************************");
		s1.display();//111 0.0
		s2.display();//112 6000.0
	}
}
/**
 * One constructor calls another constructor of the class called Constructor
 * Chaining
 */