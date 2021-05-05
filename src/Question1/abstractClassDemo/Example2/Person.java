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

public class Person extends Human {

    String gender;
    public Person(String name, String gender) {
        super(name);
        this.gender = gender;
    }

    @Override
    void singRock() {
        System.out.println(name +" is singing rock");
    }

    @Override
    void danceSlow() {
        System.out.println(name +" is dancing slow!");
    }

    @Override
    public String toString() {
        return "The person name is: " + name + "\nGender: " + gender;
    }

}
