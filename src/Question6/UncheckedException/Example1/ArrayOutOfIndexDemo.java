/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6.UncheckedException.Example1;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class ArrayOutOfIndexDemo {

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        try{
            int arr[] = {1, 2, 3, 4, 5, 6, 7};
            System.out.println(arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The specified index does not exist in array.");
        }

    }

}
