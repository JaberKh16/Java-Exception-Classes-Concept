
package javaexceptionhandling.defaultthrowandourcatch;


public class DefaultThrowAndManyCatchHierarchyWork {
    
    public static void main(String[] args)
    {
      
        System.out.println("Start of the program");
        try 
        {
            String name = null; 
            int num1 = 4;
            int num2 = 0;
            int length = name.length(); // Java Default Throw will throws an NullException here
            int exception = num1/num2;  // Though already throws an exception , so this exception can't throw
            
           
        }
        
        /*
        // Now here, we have 2 catch block, the Throws will determine which Exception to catch 
        // Though Throws will throw an NullPointer Exception here so NullPointerException catch block 
        // will work and program will continue its flow, thus 2nd exception can't be throw and thus can't be
        // catch by the another catch block.This is the Hierarchy of Exception.
        // Now , if you alter the throws Exception inside the try {} then first throws exception class will
        // encounter its catch block ans so on.
        */
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
