/*
 * A class can define Multiple Catch Exception inside its block.
 */
package javaexceptionhandling.multiplecatches;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MultipleCatchExceptionTesting {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in); // taking inputs
        boolean success = false;
        
        while (! success)
        {
            System.out.println("Enter 2 integers: ");
            
            try
            {
                int a = input.nextInt(); // to take integer value
                int b = Integer.parseInt(input.nextLine().trim()); // to take the string input and parse it into integer format
                int c = a/b;  // line where Exception hits if both of numbers are different types
                
                System.out.println("Result: " + c);
                success = true;
                
                
            }
            catch(ArithmeticException e)
            {
                System.out.println("ArithmeticException kicks: "+ " " + e.getMessage());;
                System.out.println("Can not divide by 0.");
            }
            catch(InputMismatchException e)
            {
                System.out.println("InputMismatchException kicks: " + " " + e.getMessage());
                System.out.println("Need 2 numbers for division.");
                if(input.hasNext())
                {
                        input.nextLine();
                }
            }
            catch(NumberFormatException e)
            {
                
                System.out.println("NumberFormatException kicks: " + " " + e.getMessage());
                System.out.println("Need 2 numbers for divison.");
            }
            
            
        }
        
        input.close(); // to close the Scanner Class
    }
}
