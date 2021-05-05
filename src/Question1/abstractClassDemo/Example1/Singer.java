/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.abstractClassDemo.Example1;

/**
 *
 * @author HIMAJA PARACHURI
 */

public abstract class Singer {
   
    public void paymentForWork (int hours){
        System.out.println("The Singer will make: " + hours*250+ "$");
    }
   
    public abstract void albumSongTitle();
    public abstract void lyrics();
}
