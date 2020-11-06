/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_demoraise2;

/**
 *
 * @author Marc Pardee
 * Purpose - To create a method that calculates raise
 * 
 * version - 1.0
 * Date - 2020-05-30
 */
public class Week3_demoraise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salary = 200.00;
        System.out.println("Demonstrating some raises");
        System.out.print("the output is: " + predictRaise(salary));
        
        
    }
    public static double predictRaise(double salary){
        double newSalary;
        double totalAmount;
        final double RAISE = 1.10;
        newSalary = salary * RAISE;
        totalAmount = calBonus(newSalary);
        return totalAmount;
        
    }
    public static double calBonus(double salary){
        double totalAmount = salary + 100;
        return totalAmount;
    }
}
