/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7_babynamecomparison;

import java.util.Scanner;

/**
 *
 * @author Marc Pardee
 * Date 2020-06-27
 * 
 * Write an application that prompts the user for three first names
 * and concatenates them in every possible two-name combinatino
 * so that new parents can easily compare them to find 
 * the most pleasing baby name.
 * 
 * A B C
 * 
 * AB
 * AC
 * BC
 * BA
 * CA
 * CB
 */
public class Week7_BabyNameComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameA, nameB, nameC;
        System.out.println("Enter a first name: ");
        nameA = input.nextLine();
        System.out.println("Enter another name: ");
        nameB = input.nextLine();
        System.out.println("Enter another name: ");
        nameC = input.nextLine();
        
        System.out.println("Name combinations are as follows: ");
        System.out.println(nameA + " " + nameB);
        System.out.println(nameA + " " + nameC);
        System.out.println(nameB + " " + nameC);
        System.out.println(nameB + " " + nameA);
        System.out.println(nameC + " " + nameA);
        System.out.println(nameC + " " + nameB);
        
    }
    
}
