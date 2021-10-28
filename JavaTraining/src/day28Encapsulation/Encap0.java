package day28Encapsulation;
class Demo{
	private int empID=1000;
	private double salary =45000;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class Encap0 {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		//System.out.println(d1.empID);// compile time error
		//System.out.println(d1.salary);// compile time error
		System.out.println(d1.getEmpID());
		System.out.println(d1.getSalary());
		//salary + bonus
		double updatedSalary=d1.getSalary()+14000;
		System.out.println("Updated salary: "+updatedSalary);
		System.out.println(d1.getSalary());
		System.out.println("********************************");
		d1.setEmpID(1223);
		d1.setSalary(55000);
		System.out.println(d1.getEmpID());
		System.out.println(d1.getSalary());
	}

}
