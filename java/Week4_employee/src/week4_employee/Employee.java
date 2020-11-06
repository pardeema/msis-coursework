/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4_employee;

/**
 *
 * @author Marc Pardee
 */
public class Employee {
    private int empNum;
    private String empLastName;
    private String empFirstName;
    private double empSalary;
    
    public void setEmpNum(int emp){
        empNum = emp;
    }
    
    public int getEmpNum(){
        return empNum;
    }
    
    public void setEmpLastName(String lastName){
        empLastName = lastName;
    }
    
    public String getEmpLastName(){
        return empLastName;
    }
    
    public void setEmpFirstName(String firstName){
        empFirstName = firstName;
        
    }
    public String getEmpFirstName(){
        return empFirstName;
    }
    public void setEmpSalary(double salary){
        empSalary = salary;
    }
    public double getSalary(){
        return empSalary;
    }
}
