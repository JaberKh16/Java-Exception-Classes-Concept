
package javaexceptionhandling.defaultthrowandourcatch;


public class DefaultThrowAndManyCatch {
    
     public static void main(String[] args)
    {
      
        System.out.println("Start of the program");
        try 
        {
            int num1 = 4;
            int num2 = 0;
            int exception = num1/num2;  // Java Default Throw will throw an ArithmeticException here
           
        }
        
        // Now here, we have 2 catch block, the Throws will determine which Exception to catch 
        // Though Throws will throw an Arithmetic Exception here so ArithmeticException catch block will work
        catch(ArithmeticException ae)
        {
            System.out.println("Exception is:" + ae.getMessage());
        }
        
        catch(NullPointerException ne)
        {
            System.out.println("Exception is:" + ne.getMessage());
        }
        
        System.out.println("Start of the program");
        
    }
    
}
