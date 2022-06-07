
package javaexceptionhandling.finallyblock;


public class FinallyBlockWithoutCatchBlock {
    
    public static void main(String [] args)
    {
        // writing an try{} and finally {} without the catch also work, it's not good practice will get error
        // and if Java Default Catch doesn't work then Exception can't be catch.
        try
        {
            String name = null;
            String substring = name.substring(2, 6); // Java Default Throw will throw an exception here
            
        }
        
        finally
        {
            System.out.println("I m inside the finally block");
        }
        
        
    }
    
}
