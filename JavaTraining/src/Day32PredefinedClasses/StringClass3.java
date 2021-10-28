package Day32PredefinedClasses;

public class StringClass3 {
	
	public static void main(String[] args) {
		String s1="I am from UP";
		
		System.out.println("Actual String: "+s1);
		String[] strAry=s1.split(" ");
		for(String s:strAry) {
			System.out.println(s);
		}
		System.out.println("***************************");
		String s2="I am from UP";
		System.out.println("Actual String: "+s2);
		String[] strAry2=s2.split(" ", 3);
		for(String s:strAry2) {
			System.out.println(s);
		}
		System.out.println("***************************");
		String s3="I am from Pune";
		
		String str[]=s3.split(" ");
		String temp="";
//		for(String s:str) {
//			System.out.println(s);
//		}
		for(int i=str.length-1;i>=0;i--) {
			temp=temp+" "+str[i];
		}
		System.out.println(temp.trim());
		
	}
}
