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
public class MultipleExceptionInMethod2 {

    public static void ExceptionHandler() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        System.out.println("HIMAJA PARACHURI");       
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(arr[7]); 
        int num1 = 10;
        int num2 = 0;
        int result = num1 / num2; 
        System.out.println(result);

    }
    
    public static void main(String[] args) {
        try{
            ExceptionHandler();
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException a){
             System.out.println("Exception is handled. \nThe Exception is: " + a);
        }
    }
}
