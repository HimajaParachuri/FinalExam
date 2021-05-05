/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10.Example2;

import java.util.Scanner;

/**
 *
 * @author HIMAJA PARACHURI
 */


public class Fibonacci {

    private static long[] f = new long[92];

    public static long fibonacci(int a) {
        if (a == 0) {
            return 0;
        }
        if (a == 1) {
            return 1;
        }
        if (f[a] > 0) {
            return f[a];
        }
        f[a] = fibonacci(a - 1) + fibonacci(a - 2);
        return f[a];
    }

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number to find the fibonacci: ");
        int p = sc.nextInt();
        long result = fibonacci(p);
        System.out.println("The fibonacci of " + p + " is: " + result);
        System.out.println("\nThe steps of the Fibonacci computation is given below: ");
        for (int i = 1; i <= p; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
