/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author HIMAJA PARACHURI
 */
//Student Class with ID and Name variables
public class Student {

    private int id;
    private String name;

    //Student Class Constructor with input parameters
    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    //getter and setters for the input variables name and ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*Overriding the hashCode() method
    A method provided by java.lang.Object that returns an integer representation of the object memory address.
    This method returns a random integer by default, which is unique for each case. 
    This integer will shift between application executions and will not remain constant.
    
    set the hashcode to be equal to the ID so that students who have the same ID are stored in the same location:
     */
    @Override
    public int hashCode() {
        return id;
    }

    /*overriding equals method
    equals - a method provided by java.lang.Object that indicates whether some
    other object passed as an argument is "equal to" the current instance. 
    The JDK's default implementation is dependent on memory location, 
    which means that two objects are identical if and only if they are located in the same memory address.
    
    If the equals(Object) method determines that two objects are equal, 
    then calling the hashcode() method on each of the two objects must yield the same integer value.
    */
    
    /*
    We consider two students to be equal if they have the same ID for business purposes,
    so we bypass the equals() formula and have our own implementation as follows:
    */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
    if (!(obj instanceof Student))
        return false;
    if (obj == this)
        return true;
    return this.getId() == ((Student) obj).getId();
    }

}
