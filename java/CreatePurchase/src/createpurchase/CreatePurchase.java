/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createpurchase;

import java.util.Scanner;

/**
 *
 * @author Marc Pardee
 * Date 2020-06-20
 * 
 * Create an applicatoin that declares a Purchase Object and prompts the 
 * user for purchase details. When you prompt for an invoice number do not let
 * the user proceed until a number between 1000 and 8000 has been entered.
 * 
 * When you prompt for a sale amount do not proceed unless its >= 0;
 * 
 * After a purchase object has been created, display the object's invoice
 * number, sale amount and sales tax.
 */
public class CreatePurchase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Invoice Number: ");
        int invoiceNum = input.nextInt();
        while(invoiceNum < 1000 || invoiceNum > 8000){
            System.out.println("ERROR: Invoice # must be between 1000 - 8000");
            System.out.println("Enter Invoice Number: ");
            invoiceNum = input.nextInt();
        }
        
        System.out.print("Enter Sales Amount: $  ");
        double salesAmount = input.nextDouble();
        while(salesAmount < 0){
            System.out.println("ERROR: Sales Amount must be a positive value!");
            System.out.print("Enter Sales Amount: $  ");
            salesAmount = input.nextDouble();
        }
        
        Purchase purchase = new Purchase();
        purchase.setInvoiceNum(invoiceNum);
        purchase.setSalesAmount(salesAmount);
        
        purchase.getInvoice();
    }
    
}
