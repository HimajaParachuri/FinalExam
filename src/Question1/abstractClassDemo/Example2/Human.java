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


public abstract class Human {

    String name;
    public Human(String name) {
        this.name = name;
    }
    abstract void singRock();
    abstract void danceSlow();
    public void concreteMethod() {
        System.out.println("Person is Walking as well!!");
    }

    

}
