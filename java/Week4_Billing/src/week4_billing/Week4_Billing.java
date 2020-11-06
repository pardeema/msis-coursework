/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4_billing;

/**
 *
 * @author Marc Pardee
 */
public class Week4_Billing {

    /**
     * @param args the command line arguments
     * Create a class named Billing that includes three overloaded computerBill
     * methods for a photo book store.
     * 
     * 1) when computeBill receives a single parameter it represents the price
     * of one photo book ordered. Add 8% tax and return total due.
     * 
     * 2) When computeBill receives two params, they represent price of a 
     * photo book and the quantity ordered. Multiply the two values add 8% tax
     * and return the totla
     * 
     * 3) When computeBill receives three params, they represent the price of
     * a photo book, quantity order, and a coupon value. Multiply qty and price
     * reduce by coupon value and add 8% tax and return
     */
    public static void main(String[] args) {
        Billing bill = new Billing();
        
        // Case 1 - only price
        double price1 = 10.00;
        System.out.println("Case 1 (only price): ");
        System.out.println(bill.computeBill(price1));
        
        //Case 2 - price & qty;
        double price2 = 5.00;
        int qty2 = 10; 
        System.out.println("Case 2 - price & qty: ");
        System.out.println(bill.computeBill(price2, qty2));
        
        //Case 3 - price, qty, coupon
        double price3 = 12.00;
        int qty3 = 5;
        double coupon = 10.00;
        System.out.println("Case 3 - price, qty, coupn: ");
        System.out.println(bill.computeBill(price3, qty3, coupon));
        
    }
    
}
