/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class TestClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getArrayValues g = new getArrayValues();
        int[] array = g.getValue();
        System.out.println("HIMAJA PARACHURI");
        System.out.print("Enter the index of the array: ");
        try {
            System.out.println("The corresponding element value is " + array[sc.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }

    }

}
