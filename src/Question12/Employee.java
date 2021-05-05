/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class Employee implements Comparable<Employee>{
    
     int empId;
     String empName;
     double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }    
    
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee ID:" + empId + ", Employee Name: " + empName + ", Employee Salary: " + empSalary;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.empId==o.empId){
            return 0;
        }
        else if (this.empId>o.empId){
            return 1;
        }
        else
            return -1;
    }   
    
    
}
