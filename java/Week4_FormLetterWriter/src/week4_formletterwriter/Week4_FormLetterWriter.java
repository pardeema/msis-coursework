/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4_formletterwriter;

/**
 *
 * @author Marc Pardee
 */
public class Week4_FormLetterWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lastName = "Smith"; 
        String firstName = "John";
        
        //Testing overloaded method 1
        FormLetterWriter sal1 = new FormLetterWriter();
        
        sal1.displaySalutation(lastName);
        sal1.displayBody();
        
        //Testing overloaded method 2
        FormLetterWriter sal2 = new FormLetterWriter();
        
       sal2.displaySalutation(firstName, lastName);
       sal2.displayBody();
        
        
        
    }
    
}
