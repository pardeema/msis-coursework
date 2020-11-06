/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4_mathtest;
import static java.lang.Math.*;

/**
 *
 * @author Marc Pardee
 */
public class Week4_MathTest {

    /**
     * @param args the command line arguments
     * 
     * Write a java Application that uses the Math class to determine the answers
     * for each of the following:
     * 
     * a. sqrt of 37
     * b. Sine and Coside of 300
     * c. Value of the floor, ceiling, and round of 22.8
     * d. The larger and smaller of the character "D" and the integer 71
     * e. A random number between 0 and 20 (Hint: random() method returns a 
     * value between 0 and 1, you want a number that's 20x larger)
     * 
     */
    public static void main(String[] args) {
        //a Sqrt of 37
        System.out.println("Square Root of 37: " + sqrt(37));
        //b sin and cos 300
        System.out.println("Sine of 300: " + sin(300));
        System.out.println("Cosine of 300: " + cos(300));
        //c Floor, Ceiling, Round of 228
        System.out.println("Floor of 22.8: " + floor(22.8));
        System.out.println("Ceiling of 22.8: "+ ceil(22.8));
        System.out.println("Round of 22.8: " + round(22.8));
        
        //d. The large and smaller of character "D" and int 71
        int D = Character.getNumericValue('D');
        System.out.println("Larger of 'D' and 71: " + max(D, 71));
        System.out.println("Smaller of 'D' and 71: " + min(D, 71));
        
        //e. Random number between 0 and 20
        System.out.println("Random number between 0 and 20: " + random()*20 );
    }
    
}
