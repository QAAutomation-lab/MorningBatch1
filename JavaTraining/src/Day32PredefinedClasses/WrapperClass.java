package Day32PredefinedClasses;

public class WrapperClass {

	public static void main(String[] args) {
		int a=20;  
		/*
		 * In all the wrapper classes toString() will be overrided
		 * Converting int into Integer  
		 */
		Integer k=new Integer(a);//converting int into Integer object explicitly
		Integer l=new Integer(20);//converting int into Integer object explicitly
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally ==> new Integer(a);
		System.out.println("a: "+a+"\nk: "+k+"\nl: "+l+"\nj: "+j);  

		System.out.println("***Unboxing of boxed object*****");
		//Converting Integer to int    
		Integer a1=new Integer(3);  //boxing operation 
		int i1=a1.intValue();//converting Integer to int explicitly, unboxing 
		System.out.println("a1: "+a1+"\ni1: "+i1);   
		System.out.println((a1==i1));//
		System.out.println(a1.equals(i1));//
	}

}
