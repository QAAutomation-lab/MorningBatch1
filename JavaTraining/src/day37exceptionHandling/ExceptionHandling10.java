package day37exceptionHandling;
// Throwing Unchecked Exception
public class ExceptionHandling10 {   
    //function to check if person is eligible to vote or not   
    public static void validateAge(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");   
            //System.out.println("hello");//unreachable code
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function  
        validateAge(15);
        validateAge(25);
        System.out.println("rest of the code...");    
  }    
}    