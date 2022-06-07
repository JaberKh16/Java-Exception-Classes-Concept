
package javaexceptionhandling.defaultthrowandourcatch;

/**
 *  Properties: 1. In Default Throw Our Catch we can control the Exception as our way.Means no hault 
 *                      condition for the execution of the program flow.
 *                  2. Can write as many catch block  as you wanted.
 * 
 */
public class PropertiesOfDefaultThrowOurCatch {
    
    public static void main(String[] args)
    {
      
        System.out.println("Start of the program");
        // Which of these keywords must be used to monitor for exceptions -- "try" keyword
        try 
        {
            int num1 = 4;
            int num2 = 0;
            int exception = num1/num2;  // Java Default Throw will throw an ArithmeticException here
            System.out.println("Inside the try block");
           
        }
        
        // Now this is the our catch here, and here we have to provide this Exception class Reference object
        // in the catch block so that we catch that throws Exception, In this case we know we will encounter
        // an ArithmeticException here , which is the ArithmeticException class so will create a Reference
        // object for this class.
        catch(ArithmeticException ae)
        {
            System.out.println("Exception is:" + ae.getMessage());
        }
        
        System.out.println("Start of the program");
        
    }
}
