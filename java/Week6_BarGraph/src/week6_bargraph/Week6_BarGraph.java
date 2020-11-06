/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_bargraph;

import java.util.Scanner;

/**
 *
 * @author Marc Pardee
 * Date 2020-06-20
 * 
 * Friendly Hal's Used Cars has four salespeople named Pam, Leo, Kim, and Bob
 * Accept values for hte number of cars sold by each salesperson in a month
 * and create a bar chart that illustrates sales, similar to the one below.
 * 
 * Pam: XXXXX
 * Leo: XXXXXXXXXXXX
 * Kim: XXXXXXXXX
 * Bob: XXXXXX
 */
public class Week6_BarGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pam, leo, kim, bob;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cars sold by Pam: ");
        pam  = input.nextInt();
        System.out.println("Enter cars sold by Leo: ");
        leo = input.nextInt();
        System.out.println("Enter cars sold by Kim: ");
        kim = input.nextInt();
        System.out.println("Enter cars sold by Bob: ");
        bob = input.nextInt();
        
        printCars(pam, "Pam");
        printCars(leo, "Leo");
        printCars(kim, "Kim");
        printCars(bob, "Bob");

    }

    public static void printCars(int cars, String name) {
        System.out.print(name+"\t");
        for(int car=0; car < cars; ++car){
            System.out.print("X");
        }
        System.out.println();
    }
    
}
