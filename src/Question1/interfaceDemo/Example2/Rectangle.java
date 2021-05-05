/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.interfaceDemo.Example2;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class Rectangle implements Polygon {

    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);
    }
}
