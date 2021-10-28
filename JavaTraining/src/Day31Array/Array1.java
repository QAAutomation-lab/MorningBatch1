package Day31Array;

public class Array1 {

	public static void main(String[] args) {
		/*
		//declaration
		int a[];
		//size initialization
		a = new int[5];
		*/
			//or
		int a[]=new int[5];//declaration and instantiation  
		System.out.println(a[0]);  
		System.out.println(a[1]);  
		System.out.println(a[2]);  
		System.out.println(a[3]);  
		System.out.println(a[4]); 
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
//		System.out.println("*************After initialization*************");
//		System.out.println(a[0]);  
//		System.out.println(a[1]);  
//		System.out.println(a[2]);  
//		System.out.println(a[3]);  
//		System.out.println(a[4]);
				//or
		System.out.println("Array Element counts: "+a.length);//5
//		System.out.println("************normal for-loop***************");
//		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		{
			System.out.println(a[i]);  
		}
		System.out.println("**************for-each loop*************");
		for(int num: a) {
			System.out.println(num);
		}
		int[] getArray =new int[] { 10, 30, 50, 90, 60 };
					//or
		//int[] getArray2 ={ 10, 30, 50, 90, 60 };
		System.out.println("**************for-each loop----5*************");
		for(int num: getArray) {
			System.out.println(num);
		}
	}
}

