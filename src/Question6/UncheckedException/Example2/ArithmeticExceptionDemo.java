/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6.UncheckedException.Example2;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        try{
            int num1 = 10;
            int num2 = 0;
            int result = num1/num2;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Please mention the divisor more than 0");
        }
    }
}
