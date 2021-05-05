/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8.Example2;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class exceptionHandling2 {

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");

        try {
            String s = "Scientech Easy";
            int a[] = {0, 1, 2, 3, 4, 5};
            int sLength = s.length();
            System.out.println("String length: " + sLength);
            int b = 6;
            System.out.println(a[b]);
        } catch (NullPointerException npe) {
            System.out.println("Exception is caught");
            System.out.println(npe.toString());
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Exception is caught");
            System.out.println(aie.toString());
        }
    }
}
