/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10.Example3;

import java.util.ArrayList;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class ListSearch {

    int search(ArrayList<Integer> arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                return mid;
            }
            if (arr.get(mid) > x) {
                return search(arr, l, mid - 1, x);
            }

            return search(arr, mid + 1, r, x);
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        ListSearch s = new ListSearch();
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        al.add(30);
        al.add(35);

        int n = al.size();
        int x = 35;
        System.out.println("The elements of the arraylist are: " + al);

        int result = s.search(al, 0, n - 1, x);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("The Element " + x + " is found at "
                    + "index " + result);
        }
    }
}
