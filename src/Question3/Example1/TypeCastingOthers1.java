/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3.Example1;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class TypeCastingOthers1 {

    public static void main(String[] args) {
        
        System.out.println("HIMAJA PARACHURI");

        
        System.out.println("Type conversion from int to String");
        int a = 100;
        System.out.println("The integer value is: " + a);

        String data = String.valueOf(a);
        System.out.println("The string value is: " + data);

        System.out.println("\nType conversion from String to int");
        String b = "101";
        System.out.println("The string value is: " + b);
        int num = Integer.parseInt(b);
        System.out.println("The integer value is: " + num);
    }
}

