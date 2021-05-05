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


public class Drake extends Singer{

   
    @Override
    public void albumSongTitle() {
        System.out.println("Drake album is playing: Scorpion");
    }

    @Override
    public void lyrics() {
         System.out.println("The song name is: God's Plan.....");
    }
    
    
}
