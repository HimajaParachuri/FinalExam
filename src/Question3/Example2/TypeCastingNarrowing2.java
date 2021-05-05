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
public class TypeCastingNarrowing2 {

    public static void main(String[] args) {
        byte b;
        int i = 355;
        double d = 423.150;
        b = (byte) i;        
        System.out.println("HIMAJA PARACHURI");

        System.out.println("Conversion of int to byte: i = " + i + " b = " + b);
        System.out.println("*************************************************");
        b = (byte) d;
        System.out.println("Conversion of double to byte: d = " + d + " b= " + b);
    }
}
