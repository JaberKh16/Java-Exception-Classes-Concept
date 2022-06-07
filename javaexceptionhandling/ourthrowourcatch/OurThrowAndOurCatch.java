
package javaexceptionhandling.ourthrowourcatch;


public class OurThrowAndOurCatch {
    
    public static void main(String [] args)
    {
        // here . we are throwing the exception
        try 
        {
            int balance = 5000;
            int withdrawlAmount = 8000;
        
            if(withdrawlAmount > balance)
            {
                // throwing an explicit exception via creating the ArithmeticException class object along 
                // with it's constructor where i m going to pass  a string .
                throw new ArithmeticException("you don't have sufficient balance for withdrawl!!");
            }
            
            else 
            {
                balance = balance - withdrawlAmount;
                System.out.println("Amount withdrawl succesfull");
            }
            
        }
        
        // here, we are catching the exception
        catch(ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }
        
        
        System.out.println("program flow continue........");
    }
    
}

