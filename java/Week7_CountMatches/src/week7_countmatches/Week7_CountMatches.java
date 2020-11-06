/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7_countmatches;

import java.util.Scanner;

/**
 *
 * @author Marc Pardee
 * 
 * Date 2020-06-27
 * 
 * Write an application that allows a user to enter two Strings. output
 * the number of characters in the first String that also appear in the 
 * second Strin, and output those characters. 
 * 
 * Examples:
 * "open"
 * "close"
 * "The characters in open and close are as follows:" o e
 * 
 * 
 */
public class Week7_CountMatches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2;
        System.out.println("Enter a string: ");
        s1 = input.nextLine();
        System.out.println("Enter another string: ");
        s2 = input.nextLine();
        
        System.out.println("The characters in " + s1 + " that are also"
                + " in " + s2 + " are as follows: ");
        for(int i=0;i<s1.length(); i++){
            char c1 = s1.charAt(i);

            for(int j=0; j<s2.length(); j++){
                char c2 = s2.charAt(j);
                if(c1 == c2 ){
                    System.out.print(c1+" ");
                }
            }
        }
        System.out.println("\n");
        
    }
    
}
