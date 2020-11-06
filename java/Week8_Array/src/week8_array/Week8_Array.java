/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_array;

/**
 *
 * @author Marc Pardee
 * 
 * Date - 2020-07-03
 * 
 * Purpose - array example
 * version 1.0
 */
public class Week8_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = {10,15,23,29,31,34,38,45};
        
        for( int i=0; i < numbers.length; ++i){
            System.out.print( numbers[i] + " " );
        }
        System.out.println();
        
        for(int i = numbers.length - 1; i >= 0; --i){
            System.out.print( numbers[i] + " " );
        }
    }
    
}
