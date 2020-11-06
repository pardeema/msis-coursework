/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_hellonamedialog;

import javax.swing.JOptionPane;

/**
 *
 * @author marc pardee
 * Purpose: APrint Hello Name Dialog
 * Date; 2020-05-19
 * Version: 1.0
 */
public class Week2_HelloNameDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, "+ result + "!");
    }
    
}
