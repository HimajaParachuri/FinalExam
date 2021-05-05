/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6.CheckedException.Example2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class FileNotFoundDemo {

    
    public void check() throws  IOException {
         System.out.println("HIMAJA PARACHURI");
        FileInputStream fis = null;
        fis = new FileInputStream("B:/myfile.txt");
        int k;
         
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
        fis.close();
    }

    public static void main(String[] args) throws IOException {
       
        FileNotFoundDemo fnfd = new FileNotFoundDemo();
        fnfd.check();
    }
}
