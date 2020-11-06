/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4_formletterwriter;

/**
 *
 * @author Marc Pardee
 * 
 * Create a class named FormLetterWrite that includes two overloaded
 * methods named displaySalutation(). The first method takes one String
 * parameter that represents a customer's last name and displays the 
 * salutation "Dear Mr. or Ms." followed by lastName. The second 
 * method accepts two String params that rep first and lsast name and displays
 * "Dear " + fist and last name. After each salutation, display the rest
 * of a short business letter. "Thank you for your recent order". 
 * 
 * Write a main method that tests each overloaded method.
 */
public class FormLetterWriter {
    
    public void displaySalutation(String lastName){
        System.out.println( "Dear Mr. or Ms. " + lastName);
    }
    
    public void displaySalutation(String firstName, String lastName){
        System.out.println( "Dear " + firstName + " "+ lastName);
    }
    
    public void displayBody(){
        System.out.println( "Thank you for your recent order.");
    }
}
