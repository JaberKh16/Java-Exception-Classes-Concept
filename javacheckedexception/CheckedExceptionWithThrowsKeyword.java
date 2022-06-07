
package javacheckedexception;

import java.io.IOException;

/*
    // To tells Java we want to throw an checked exception , need to use the keyword "throws"
                         Syntax - throws ExceptionClass Name
*/
public class CheckedExceptionWithThrowsKeyword  {
    
    // adding the throws IOException to tell Java to handle the Exception 
    public static void main(String [] args) throws IOException 
    {
        throw new IOException(); // explicit exception throw
    }
    
}
