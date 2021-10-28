package day28Encapsulation;

class Student {
	// private data member
	private String name;
	// getter method for name
	public String getName() {
		return name;
	}
	// setter method for name
	public void setName(String name){  
	this.name=name;  
	}
}
public class Encap3 {
	
	public static void main(String[] args) {
		
		//creating instance of the encapsulated class  
		Student s = new Student();
		//setting value in the name member  
		s.setName("vijay");
		//getting value of the name member  
		System.out.println(s.getName());
	}
}