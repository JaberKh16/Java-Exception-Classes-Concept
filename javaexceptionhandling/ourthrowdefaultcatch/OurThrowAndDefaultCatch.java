
package javaexceptionhandling.ourthrowdefaultcatch;
/*
    // To create a explicit throw (our throw) need to use th keyword "throw"
    // Also need to create a Object for the Exception Class ==>
            Syntax -  throw new ExcptionClass(constructor);
*/
public class OurThrowAndDefaultCatch {
    
    public static void main(String [] args)
    {
        int balance = 5000;
        int withdrawlAmount = 8000;
        
        if(withdrawlAmount > balance)
        {
            // throwing an explicit exception via creating the ArithmeticException class object along 
            // with it's constructor where i m going to pass  a string .
            throw new ArithmeticException("you don't have sufficient balance for withdrawl");
        }
        
        else 
        {
            balance = balance - withdrawlAmount;
            System.out.println("Amount withdrawl succesfull");
        }
        
        System.out.println("program flow continue........");
    }
}
