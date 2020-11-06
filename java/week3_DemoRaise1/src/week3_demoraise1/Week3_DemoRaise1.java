/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_demoraise1;

/**
 *
 * @author Marc Pardee
 * Purpose - To create a method that calculates raise
 * 
 * version - 1.0
 * Date - 2020-05-30
 */
public class Week3_DemoRaise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salary = 200.00;
        double startingWage = 800.00;
        System.out.println("Demonstrating some raises");
        predictRaise(salary); 
        predictRaise(startingWage);
    }
    
    public static void predictRaise(double salary){
        double newSalary;
        final double RAISE = 1.10;
        newSalary = salary * RAISE;
        System.out.println("Current Salary: " + salary+"\tAfter Raise: "+
                newSalary);
  
    }
    
}
