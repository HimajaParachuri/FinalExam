package Question12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HIMAJA PARACHURI
 */
public class EmployeeDriver {

    public static void main(String[] args) {
        System.out.println("HIMAJA PARACHURI");
        // List of objects of Employee class
        ArrayList<Employee> al = new ArrayList<Employee>();
        //adding 5 employee details in the arraylist
        al.add(new Employee(3, "Henry Miller", 1500.00));
        al.add(new Employee(1, "Nalo Hopkinson", 1200.00));
        al.add(new Employee(4, "Frank Miller", 1000.00));
        al.add(new Employee(2, "Deborah Hopkinson", 1600.00));
        al.add(new Employee(5, "George Martin", 800.00));

        //displaying the employee details unsorted
        System.out.println("The arraylist value unsorted: \n");
        for (Employee e : al) {
            System.out.println(e.toString());
        }
        System.out.println("\n");

        //displaying the employee details according to employee ID in ascending order
        System.out.println("The arraylist value sorted according to Employee ID: \n");
        Collections.sort(al);
        for (Employee e : al) {
            System.out.println(e.toString());
        }
        System.out.println("\n");

        //displaying the employee details according to employee Salary in ascending order
        System.out.println("The arraylist value sorted according to Employee Salary: \n");
        Collections.sort(al, EmployeeDriver.SalaryComparator);
        for (Employee e : al) {
            System.out.println(e.toString());
        }
        System.out.println("\n");

        //displaying the employee details according to employee Name in ascending order
        System.out.println("The arraylist value sorted according to Employee Name: \n");
        Collections.sort(al, EmployeeDriver.NameComparator);
        for (Employee e : al) {
            System.out.println(e.toString());
        }
    }

    //Salary comparator to compare the values of salary in ascending order
    public static final Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getEmpSalary() - o2.getEmpSalary()); // salary is also positive integer
        }
    };

    //Name comparator to compare the values of Names in ascending order
    public static final Comparator<Employee> NameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getEmpName().compareTo(o2.getEmpName());
        }
    };
}
