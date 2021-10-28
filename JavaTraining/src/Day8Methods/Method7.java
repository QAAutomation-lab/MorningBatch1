package Day8Methods;

public class Method7 {

	float a=15.56f;
	int add(int num1,int num2) {
		return (num1+num2);
	}
	public static void main(String[] args) {
		
		Method7 m1=new Method7();
		
		System.out.println(m1.a);
		//System.out.println(Method7.add(12, 17));
		int sum=m1.add(12, 17);
		System.out.println("sum: "+sum);
	}
	
}
