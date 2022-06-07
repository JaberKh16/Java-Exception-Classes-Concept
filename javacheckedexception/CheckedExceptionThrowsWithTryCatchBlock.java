
package javacheckedexception;

import java.io.IOException;


public class CheckedExceptionThrowsWithTryCatchBlock {
    
     // RuntimeException Class child class is IOException Class which is compile time exception
     // adding the throws IOException to tell Java to handle the Exception 
    public static void main(String [] args) throws IOException 
    {
        
        try 
        {
            throw new IOException(); // explicit exception throw
        }
        catch(IOException io)
        {
            System.out.println("Exception:" + io.getMessage());
        }
    }
    
}
