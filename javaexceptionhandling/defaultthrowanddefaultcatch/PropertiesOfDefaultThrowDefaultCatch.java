
package javaexceptionhandling.defaultthrowanddefaultcatch;

/*
    We have an Exception in our code and we didn't catch the Exception then Java by default
    catch the Exception.
    
    For example,  If we have Arithmetic Exception (1/0) in our code , Java throws the ArithmeticException
                         Object and the Java Catch Mechanism catch that object and throws the 
                        ArithmeticException on the screen in compile time.
    
   This is the Java Default Throw and Default Catch Mechanism way to handle Exceptions.

    Properties:-  1. Though Java internally handling the throws and catch so, the point Java get an exception
                            program hault there, can't executed further.

*/
public class PropertiesOfDefaultThrowDefaultCatch {
    
     
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
        
        System.out.println("Start of the program.......");
        
        System.out.println("Exception is : " + exception); // Java Default Throw will throw an exception here
        
        // Though Java Default Throw Default Catch get an Exception so programs terminates at the
        // exception point and this line won't be executed.
        System.out.println("End of the program.......");
        
    }
}
