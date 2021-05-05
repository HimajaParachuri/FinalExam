/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class TestClass {

    public static void main(String[] args) {
      
        GeometricObject[] objects = {new Square(2.0), new Square(5.0), new Square(9.5), new Square(3.5), new Square(4.1)};
        System.out.println("HIMAJA PARACHURI");
        for (GeometricObject object : objects) {
            
            System.out.println("\nArea of the Square is " + object.getArea());
            if (object instanceof Colorable) {
                ((Colorable) object).howToColor();
            } 
        }
    }
}
