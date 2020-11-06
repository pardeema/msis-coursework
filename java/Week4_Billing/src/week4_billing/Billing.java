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
public class Billing {
    private final double TAX = 1.08; //8% tax on top of current value
    
    public double computeBill(double price){
        return price * TAX;
    }
    
    public double computeBill(double price, int qty){
        return price * qty * TAX;
    }
    
    public double computeBill (double price, int qty, double coupon){
        double discountCost = (price * qty) - coupon;
        return discountCost * TAX;
    }
}
