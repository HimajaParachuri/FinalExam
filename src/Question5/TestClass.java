/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class TestClass {

    public static void main(String[] args) {
        ComparableCircle o1 = new ComparableCircle(2.5);
        ComparableCircle o2 = new ComparableCircle(25);
        System.out.println("HIMAJA PARACHURI");
        if (o1.compareTo(o2) > 0) {
            System.out.println("The area of ​​the first circle is large");
        } else if (o1.compareTo(o2) < 0) {
            System.out.println("The area of ​​the second circle is large");
        } else {
            System.out.println("The area of ​​the two circles is the same");
        }
    }

}
