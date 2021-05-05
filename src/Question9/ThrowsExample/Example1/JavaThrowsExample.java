/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9.ThrowsExample.Example1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class JavaThrowsExample {

    public static void ReadFromFile() throws IOException {
         File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
    }
    }

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        try {
            ReadFromFile();
            
        } catch (IOException ioe) {
            System.out.println("Exception Handled using throws Keyword");
            
        }
    }
}
