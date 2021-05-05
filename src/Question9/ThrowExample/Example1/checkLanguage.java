/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9.ThrowExample.Example1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class checkLanguage {
    

    ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript", "NodeJS"));
    public void checkLanguage(String language) throws CustomException {
           

        if (languages.contains(language)) {
            throw new CustomException(language + " already exists");
        } else {
            languages.add(language);
            System.out.println(language + " is added to the ArrayList");
        }
    }

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        checkLanguage cl = new checkLanguage();
        try {
            cl.checkLanguage("DotNet");
            cl.checkLanguage("Java");
        } 
        catch (CustomException e) {
            System.out.println("[" + e + "] Exception Occured and Handled successfully");
        }
    }
}
