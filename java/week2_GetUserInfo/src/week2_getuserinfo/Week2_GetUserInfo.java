/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_getuserinfo;

import java.util.Scanner;

/**
 *
 * @author marc pardee
 * Purpose: Accept values from user
 * Date; 2020-05-19
 * Version: 1.0
 */
public class Week2_GetUserInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        int age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = inputDevice.nextLine();
        System.out.print("Please enter your age: ");
        age = inputDevice.nextInt();
        System.out.println("Your name is "+ name + 
                " and you are "+ age +" years old.");
    }
    
}
