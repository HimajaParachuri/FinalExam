/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author HIMAJA PARACHURI
 */
/*
For testing purposes, we define a main class HashcodeEquals that checks whether
two instances of Student (who have the exact same attributes) are considered as equal.
 */
public class HashcodeEquals {

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        //creating student object with the ID and Name
        Student s = new Student(1, "Henry Miller");
        Student s1 = new Student(1, "Henry Miller");
        Student s2 = new Student(2, "David");

        //displaying the Hashcode of the student objects
        System.out.println("Student 1 hashcode = " + s.hashCode());
        System.out.println("Student 2 hashcode = " + s1.hashCode());
        System.out.println("Student 3 hashcode = " + s2.hashCode());
        //calling equals method to compare the 2 student objects and display the boolean value
        System.out.println("Checking equality between Student1 and Student2 = " + s.equals(s1));
        System.out.println("Checking equality between Student1 and Student3 = " + s.equals(s2));

        /*creating ArrayList with the generic as Student object
        Defining an array list of Student and looking for a specific student 
        inside it is a common use of equals().
         */
        List<Student> l = new ArrayList<Student>();
        //adding all the student objects
        l.add(s2);

        //displays the ArrayList size
        System.out.println("\nArrayList size = " + l.size());
        System.out.println("ArrayList contains David = " + l.contains(new Student(2, "David")));

        /*
        HashSet stores its elements in memory buckets. Each bucket is linked to a particular hash code. When calling students.add(s), 
        Java stores s inside a bucket and links it to the value of s.hashcode(). 
        Now any time an element with the same hash code is inserted into the set, it will just replace s. However, 
        since s1 has a different hash code, it will be stored in a separate bucket and will be considered a totally different object.
        
        Now when HashSet searches for an element inside it, it first generates the element's hash code and looks 
        for a bucket which corresponds to this hash code.

        Here comes the importance of overriding hashcode(), so let's override it in Student 
        and set it to be equal to the ID so that students who have the same ID are stored in the same bucket:
         */
        HashSet< Student> students = new HashSet< Student>();
        students.add(s);
        students.add(s1);

        System.out.println("HashSet size = " + students.size());
        /*
        The two elements are now considered as equal and stored in the same memory bucket, so any time we call contains() 
        and pass a student object holding the same hash code, the set will be able to find the element.
        */
        System.out.println("HashSet contains Henry = " + students.contains(new Student(1, "Henry")));

    }

}
