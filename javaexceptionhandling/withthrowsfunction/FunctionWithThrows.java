/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexceptionhandling.withthrowsfunction;

public class FunctionWithThrows {
   
    public static void main(String [] args) throws Exception
    {
        
        testSquaret(-1);   // main() calling the testSquaret()
        
    }
    
    public static void testSquaret(int s) throws Exception
    {
        System.out.println(callSquare(s));  // testSquaret() calling callSquare(s)
        /*
        try
        {
            System.out.println(callSquare(s));  // testSquaret() calling callSquare(s)
        }
        catch(Exception e)  // finally callSquare() function exceptions is being handles here
        {
            System.out.println(e.getMessage());
        }
        */
    }
    
    public static int Square(int a) throws Exception
    {
        if (a < 0)  // checks if -1 < 0
        {
            throw new Exception("can't be less than 0");  // throws the Exception, so this line is printed first
        }
        return a * a;
    }
    
    public static int callSquare(int a) throws Exception
    {
        return Square(a); // returing with calling Square(a) // comes here and refere to Exception though only 'throws'
    }
   
}

