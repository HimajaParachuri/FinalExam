/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9.ThrowExample.Example1;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class CustomExceptionUnChecked extends RuntimeException {
    public CustomExceptionUnChecked(String message) {
    super(message);
  }
}
