/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8.Example1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class MultipleExceptionInMethod1 {

    
    public static void findFile() throws NullPointerException,IOException {
        String ptr = null;
        System.out.println("HIMAJA PARACHURI");
        if (ptr.equals("Java")) {
            System.out.print("Same");
        } else {
            System.out.print("Not Same");
        }

        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);

    }

    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException | NullPointerException e1) {
            System.out.println("Exception is handled. \nThe Exception is: " + e1);
        }
    }
}
