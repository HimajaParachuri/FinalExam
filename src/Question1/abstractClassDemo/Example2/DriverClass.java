/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.abstractClassDemo.Example2;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class DriverClass {

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        Person p = new Person("John Paul", "Male");
        System.out.println(p.toString());
        p.danceSlow();
        p.singRock();
        p.concreteMethod();
        Person p1 = new Person("Patricia", "Female");
        System.out.println("\n" + p1.toString());
        p1.danceSlow();
        p.concreteMethod();
    }
}
