/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexceptionhandling.customdefinedexception;

/**
 *
 * @author jaber
 */
public class MainExceptionTest {

    int energyLevel;
    public MainExceptionTest(int a)
    {
        this.energyLevel = a;
    }
    
    public void testEnergy() throws myExceptionHandlerClass
    {
        if (this.energyLevel < 50)
        {
            throw new myExceptionHandlerClass(50);
        }
    }
    
    public static void main(String [] args)
    {
        MainExceptionTest met = new MainExceptionTest(40);
        try
        {
            met.testEnergy();
        }
        catch(myExceptionHandlerClass mehc)
        {
            mehc.printStackTrace();
        }
    }
}
