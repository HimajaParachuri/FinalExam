/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3.Example2;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class TypeCastingOthers2 {

    public static void main(String[] args) {
        int a = 1234;
        int b = -1234;
        System.out.println("HIMAJA PARACHURI");
            
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        System.out.println("String str1 = " + str1);
        System.out.println("String str2 = " + str2);

        int x = 123;
        Integer y = new Integer(x); 
        System.out.println("Before conversion: " + y.getClass().getName());

        System.out.println("After conversion: " + y.toString().getClass().getName());
        System.out.println("After conversion (using Static method): " + Integer.toString(x).getClass().getName());
 
        String s = "200";  
        int i = Integer.parseInt(s);
        System.out.println(i);
    }
}
