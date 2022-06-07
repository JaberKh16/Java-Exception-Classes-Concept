
package javaexceptionhandling.finallyblock;


public class FinallyBlockWithDefaultThrowOurCatch {
    
    
     public static void main(String[] args)
    {
      
        System.out.println("Start of the program");
        try 
        {
            String name = null;
            int num1 = 4;
            int num2 = 0;
            int length = name.length(); // Java Default throw will throw and Exception here which is NullPointer Exception
            int exception = num1/num2;  
           
        }
        
        catch(ArithmeticException ae)
        {
            System.out.println("Exception is:" + ae.getMessage());
        }
        
        catch(NullPointerException ne)
        {
            System.out.println("Exception is:" + ne.getMessage());
        }
        
        // this block will executed always whether you encounter an exception or not
        finally
        {
            System.out.println("I am Inside the finally block, and i have power to be executed always");
        }
        
        System.out.println("Start of the program");
        
    }
    
}
