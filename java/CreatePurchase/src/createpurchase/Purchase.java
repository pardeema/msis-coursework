/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createpurchase;

/**
 *
 * @author Marc Pardee
 * Date 2020-06-20
 * 
 * Create a class named Purchase. Each purchase contains an invoice number,
 * amount of sale, and amount of sales tax. Include set methods for the 
 * invoice number and sales amount. Within the set() method for the sales
 * amount, calculate the sales tax as 5% of the sales amount. Also include
 * a display method that displays a purchase's details. 
 */
public class Purchase {
    final private double TAX = 0.05;
    private int invoiceNum;
    private double salesAmount;
    private double salesTax;
    
    public void setInvoiceNum(int num){
        invoiceNum = num;
    }
    public void setSalesAmount(double sale){
        salesAmount = sale;
        salesTax = salesAmount * TAX;
    }
    public void getInvoice(){
        double totalCost = salesAmount + salesTax;
        System.out.println("Purchase Details:\n======");
        System.out.println("Invoice Number: " + invoiceNum);
        System.out.println("Sales Amount: $" + salesAmount);
        System.out.println("Sales Tax: $" + salesTax);
        System.out.println("-------\nTotal cost: $" + totalCost);
        
    }
}
