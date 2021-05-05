/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.interfaceDemo.Example1;

/**
 *
 * @author HIMAJA PARACHURI
 */

public class EdSheeran implements Singer{
    @Override
    public void paymentForWork(int hours, String name) {
        System.out.println("The Singer name is: "+ name +"\nThe Singer will make: "+ hours*300 + "$");
    }

    
    @Override
    public void albumSongTitle() {
        System.out.println("The Album name is: Divide");
    }

    @Override
    public void lyrics() {
        System.out.println("The song name is: Shape of you.....");
    }
    
}
