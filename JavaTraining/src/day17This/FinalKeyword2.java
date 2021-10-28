package day17This;

class FinalKeyword2 {

	final int speedlimit;// blank final variable
	FinalKeyword2() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}
	FinalKeyword2(int i){
		speedlimit = i;
		System.out.println(speedlimit);
	}
	void display() {
		System.out.println(speedlimit);
	}
	public static void main(String args[]) {
		FinalKeyword2 f1=new FinalKeyword2();
		System.out.println(f1.speedlimit); 
		FinalKeyword2 f2=new FinalKeyword2(102);
		System.out.println(f2.speedlimit); 
	}
}