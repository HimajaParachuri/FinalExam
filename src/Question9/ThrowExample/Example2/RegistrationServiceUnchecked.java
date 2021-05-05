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
public class RegistrationServiceUnchecked {

    public void validateEmail(String email) {
        System.out.println("HIMAJA PARACHURI");
        if (!isDomainValid(email)) {
            throw new DomainNotValidUncheckedException("Invalid domain");
        }
    }

    private boolean isDomainValid(String email) {
        List<String> validDomains = Arrays.asList("gmail.com", "yahoo.com", "outlook.com");
        if (validDomains.contains(email.substring(email.indexOf("@") + 1))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RegistrationServiceUnchecked service = new RegistrationServiceUnchecked();
        service.validateEmail("abc@gmail1.com");
    }
}
