/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexceptionhandling.finallyexceptionflow;

/**
 *
 * @author jaber
 */
public class FInallyFlowException {
    
    public static void main(String [] args)
    {
        try
        {
            test();
        }
        catch(Exception e)
        {
            System.out.println("Catch from main(): " + e.getMessage());
        }
    }
    
    public static void test()
    {
        try
        {
            int c = 4/0; // Exception hits
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Catch from test(): " + ae.getMessage());
            // though newly throws exception was not handled here so will be handled by main() catch block
            throw new IllegalArgumentException("throwing another exception not related with try block exception");
        }
        finally
        {
            System.out.println("Finally from test() method.");
        }
        
        System.out.println("After Finally from test() method.");
    }
    
}
