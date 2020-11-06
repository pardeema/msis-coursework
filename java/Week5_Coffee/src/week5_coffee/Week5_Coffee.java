/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_coffee;

import java.util.Scanner;

/**
 *
 * @author Marc Pardee
 * Date: 2020-06-16
 * 
 * Write an application that displays a menu of three items for the Jivin' Java
 * Coffee Shop as follows:
 * 
 * ---------------------
 * (1) American     1.99
 * (2) Espresso     2.50
 * (3) Latte        2.15
 * ---------------------
 * 
 * Prompt the user to choose an item using the number (1,2,3) that corresponds
 * to the item or to enter 0 to quit the application. After the user makes
 * the first selection, if the choise is 0, display a total bill of $0.
 * 
 * Otherwise, display the menu again. The user should respond to this prompt
 * with another item to order or 0 to quit. If hte user types 0, the cost
 * of the single item is displayed. If the user types, 1, 2, or 3 add the 
 * cost of the second item to the first and the display a third time. If the
 * user types 0 to quit, display cost of the two items, else display total
 * for all three selections. Save as Coffee.java
 */
public class Week5_Coffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double AMERICAN_PRICE = 1.99;
        final double ESPRESSO_PRICE = 2.5;
        final double LATTE_PRICE = 2.15;
        
        Scanner input = new Scanner(System.in);
        int choice;
        double totalCost = 0;
        displayPrompt();
        choice = input.nextInt();
        
        if(choice == 0){
            displayGoodbye(totalCost);
        }else{
            switch(choice){
                case 1:
                    totalCost += AMERICAN_PRICE;
                    break;
                case 2:
                    totalCost += ESPRESSO_PRICE;
                    break;
                case 3:
                    totalCost += LATTE_PRICE;
                    break;
            }
            displayPrompt();
            choice = input.nextInt();
            if(choice == 0){
                displayGoodbye(totalCost);
            }else{
                switch(choice){
                case 1:
                    totalCost += AMERICAN_PRICE;
                    break;
                case 2:
                    totalCost += ESPRESSO_PRICE;
                    break;
                case 3:
                    totalCost += LATTE_PRICE;
                    break;
                }
                displayPrompt();
                choice = input.nextInt();
                if(choice == 0){
                    displayGoodbye(totalCost);
                }else{
                    switch(choice){
                        case 1:
                            totalCost += AMERICAN_PRICE;
                            break;
                        case 2:
                            totalCost += ESPRESSO_PRICE;
                            break;
                        case 3:
                            totalCost += LATTE_PRICE;
                            break;
                    }
                    displayGoodbye(totalCost);
                }
            }
                    
        }
        
    }

    public static void displayPrompt() {
        System.out.println("---------------------");
        System.out.println("(1) American     1.99");
        System.out.println("(2) Espresso     2.50");
        System.out.println("(3) Latte        2.15");
        System.out.println("---------------------");
        System.out.print("\nEnter your drink choice (or 0 to quit):  ");
    }

    public static void displayGoodbye(double totalCost) {
        System.out.println("Thanks! Total Cost today is: $" + totalCost);
    }
    
}
