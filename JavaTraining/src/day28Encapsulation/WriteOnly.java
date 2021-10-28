package day28Encapsulation;

class Student3 {
	// private data member
	private String college="xyz";

	// getter method for college
	public void setCollege(String college) {
		this.college = college;
	}
}
public class WriteOnly {

	public static void main(String[] args) {

		// creating instance of the encapsulated class
		Student3 s = new Student3();
		// getting value of the name member
		s.setCollege("RGIT");
		Student3 s1 = new Student3();
		System.out.println("Bye");
	}
}
