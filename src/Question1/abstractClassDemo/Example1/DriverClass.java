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

public class DriverClass {
    
    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        System.out.println("Creating Object for the Singer 1: Taylor Swift");
        Singer TS = new TaylorSwift();
        TS.paymentForWork(10);
        TS.albumSongTitle();
        TS.lyrics();
        System.out.println("\nCreating Object for the Singer 2: Drake");
        Singer drake = new Drake();
        drake.paymentForWork(8);
        drake.albumSongTitle();
        drake.lyrics();
    }
}
