/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10.Example1;

import java.util.Scanner;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class EuclidDemo {

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } 
        else {
            return GCD(b, a % b); 
        }
    }

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the First value");
        int p = sc.nextInt();
        System.out.println("Please enter the Second value");
        int q = sc.nextInt();
        int result = GCD(p, q);
        System.out.println("The GCD of the given numbers is: " + result);
    }
}
