package day37exceptionHandling;

public class ExceptionHandling13 {

	    public static void main(String[] args) 
	    {
	    	System.out.println("program starts");
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println("Hello Geeks");
	    }
}