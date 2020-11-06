/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_knots;

/**
 *
 * @author Marc Pardee
 * Date - 2020-06-20
 * 
 * A knot is a unit of speed equal to one nautical mile per hour. Write
 * an app that displays ver integer knot value from 15 to 30 and its 
 * km/hr and mph equivalents. One nautical mile is 1.852 km and 1.151 miles
 *
 */
public class Week6_Knots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double KM_PER_KNOT = 1.852;
        final double MI_PER_KNOT = 1.151;
        
        for(int x = 15; x <= 30 ; ++x){
            double kmph = x * KM_PER_KNOT;
            double mph = x *MI_PER_KNOT;
            System.out.println(x + " Knots is: " + kmph + " kmph and: "
                                + mph + " mph");
        }
    }
    
}
