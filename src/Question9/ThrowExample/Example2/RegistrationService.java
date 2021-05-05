/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9.ThrowExample.Example2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class RegistrationService {

    List<String> registeredEmails = Arrays.asList("abc@gmail.com", "xyz@gmail.com");

    public void validateEmail(String email) throws EmailNotUniqueException {
        if (registeredEmails.contains(email)) {
            throw new EmailNotUniqueException("Email Already Registered");
        }
    }

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        RegistrationService service = new RegistrationService();
        try {
            service.validateEmail("abc@gmail.com");
        } 
        catch (EmailNotUniqueException e) {
            System.out.println("The mentioned email is already available");
            e.printStackTrace();
        }
    }
}
