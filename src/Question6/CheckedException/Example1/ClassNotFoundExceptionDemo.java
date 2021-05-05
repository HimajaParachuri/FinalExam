/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6.CheckedException.Example1;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class ClassNotFoundExceptionDemo {

    private static final String CLASS_TO_LOAD = "java.main.Utils";

    public void check() {
         System.out.println("HIMAJA PARACHURI");
        
        try {
            Class loadedClass = Class.forName(CLASS_TO_LOAD);
            System.out.println("Class " + loadedClass + " found!");
        } 
        
        catch (ClassNotFoundException ex) {
            System.err.println("ClassNotFoundException was found: " + ex.getMessage());
        }
    }
    
     public static void main(String[] args) throws Exception  {
        ClassNotFoundExceptionDemo cd = new ClassNotFoundExceptionDemo();
        cd.check();
        
    }
     
}
