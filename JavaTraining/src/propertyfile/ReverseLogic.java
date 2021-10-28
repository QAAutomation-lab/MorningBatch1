package propertyfile;

public class ReverseLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseNumber(6528));
	}
	
	static int reverseNumber(int num) {
		int rev=0;
		while(num!=0) {
			int num2=num%10;
			rev=rev*10+num2;
			num=num/10;
		}
		return rev;
	}

}
