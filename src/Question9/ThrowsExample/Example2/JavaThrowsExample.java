/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9.ThrowsExample.Example2;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class JavaThrowsExample {

    void method1() throws ArithmeticException {
        throw new ArithmeticException("Calculation error");
    }

    void method2() throws ArithmeticException {
        method1();
    }

    void method3() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled");
        }
    }

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        JavaThrowsExample obj = new JavaThrowsExample();
        obj.method3();
        System.out.println("End Of Program");
    }
}
