
package javaexceptionhandling.defaultthrowanddefaultcatch;

/*
    We have an Exception in our code and we didn't catch the Exception then Java by default
    catch the Exception.
    
    For example,  If we have Arithmetic Exception (1/0) in our code , Java throws the ArithmeticException
                         Object and the Java Catch Mechanism catch that object and throws the 
                        ArithmeticException on the screen in compile time.
    
   This is the Java Default Throw and Default Catch Mechanism way to handle Exceptions.
   
   Exceptional handling is managed via 5 keywords – 
            1. try
            2. catch
            3. throws 
            4. throw 
            5. finally..

*/

public class DefaultThrowAndDefaultCatch {
    
    public static void main(String[] args)
    {
        int num1 = 4;
        int num2 = 0;
        int exception = num1/num2;
        /*
            // will get and exception here, says -->
            // "Exception in thread "main" java.lang.ArithmeticException: / by zero"
            // where the Exception says got and AritmeticException which the Default Throw Exception.
            // and "/ by zero" is the message for that exception defined in Java Default Catch .
        */
        
        System.out.println("Exception is : " + exception); // Java Default Throw will throw an exception here
        
    }
    
}
