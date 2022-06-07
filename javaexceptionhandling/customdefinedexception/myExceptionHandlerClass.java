/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexceptionhandling.customdefinedexception;

// Custom Exception Class which inherited the Exception Class
public class myExceptionHandlerClass extends Exception {

    // Creating two constructor Exception Class contains
    
    // myExceptionHandlerClass() constructor with empty parameter
    public myExceptionHandlerClass()
    {
        super();
    }
    // myExceptionHandlerClass(String msg) constructor with 'String Type' parameter
    public myExceptionHandlerClass(String message)
    {
        super(message);
    }
    
    public myExceptionHandlerClass(int energyLevel) 
    {
        super("Energy Level Dropped below: " + energyLevel);
        System.out.println("Inside Custom Exception Class");
    }
    
}
