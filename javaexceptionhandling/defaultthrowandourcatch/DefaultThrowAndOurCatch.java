
package javaexceptionhandling.defaultthrowandourcatch;


public class DefaultThrowAndOurCatch {
    
     public static void main(String[] args)
    {
      
       
        try 
        {
            int num1 = 4;
            int num2 = 0;
            int exception = num1/num2;  // Java Default Throw will throw an ArithmeticException here
           
        }
        
        // Now this is the our catch here, and here we have to provide this Exception class Reference object
        // in the catch block so that we catch that throws Exception, In this case we know we will encounter
        // an ArithmeticException here , which is the ArithmeticException class so will create a Reference
        // object for this class.
        catch(ArithmeticException ae)
        {
            System.out.println("Exception is:" + ae.getMessage());
        }
        
        
    }
}
