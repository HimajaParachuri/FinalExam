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
public class DriverClass {
    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        System.out.println("Creating Object for the Singer 1");
        Singer ES = new EdSheeran();
        ES.paymentForWork(13,"Ed Sheeran");
        ES.albumSongTitle();
        ES.lyrics();
        
        System.out.println("\nCreating Object for the Singer 2");
        Singer beyonce = new Beyonce();
        beyonce.paymentForWork(12,"Beyonce");
        beyonce.albumSongTitle();
        beyonce.lyrics();
    }
}
