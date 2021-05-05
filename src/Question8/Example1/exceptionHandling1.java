/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8.Example1;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class exceptionHandling1 {

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        try {
            int arr[] = new int[6];
            arr[7] = 10 / 10; 
            arr[3] = 10 / 0; 
            
            System.out.println("Try Block");
        } catch (ArithmeticException a) {
            System.out.println("A number cannot be divided by zero, Illegal operation in java");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Accessing array element outside of specified limit");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
        System.out.println("Try-Catch ended");
        }
    }
}

