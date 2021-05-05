
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
public class checkLanguageUnchecked {

    ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));

    public void checkLanguageUnchecked(String language) {
            System.out.println("HIMAJA PARACHURI");

        if (languages.contains(language)) {
            throw new CustomExceptionUnChecked(language + " already exists");
        } else {
            languages.add(language);
            System.out.println(language + " is added to the ArrayList");
        }
    }

    public static void main(String[] args) {
        checkLanguageUnchecked ceu = new checkLanguageUnchecked();

        ceu.checkLanguageUnchecked("Swift");
        ceu.checkLanguageUnchecked("Java");
    }
}
