/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7_comparestrings;

import java.util.Scanner;

/**
 *
 * @author Marc Pardee
 * 
 * 
 */
public class Week7_CompareStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String aName = "Carmen";
        String anotherName ;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        anotherName = input.nextLine();
        if(aName.equals(anotherName)){
            System.out.println(aName + " equals " + anotherName);
        }else{
            System.out.println(aName + " does not equal " + anotherName);
        }
    }
    
}
