/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4_circle;

/**
 *
 * @author Marc Pardee
 */
public class Week4_TestCircle {

    /**
     * @param args the command line arguments
     * 
     * a. Create a class named Circle with fields named radius, diamater, and
     * area. Include a constructor that sets the radius to 1 and calculates
     * the other two values. Also include methods named setRadius() and 
     * getRadius(). The setRadius() method not only sets the radius but 
     * also calculates the other two values. (Diamater = 2r and Area = Pi*r*r)
     * 
     * Use the Math class PI constant for this claculation.
     * 
     * b. Create a class called TestCircle whose main() declares several
     * circle objects. Using the setRadius() method, assign one Circle a small
     * radius value and assign another a larger radius value. Do not assign
     * a value to the radius of the third circle; instead, retain the vlaue
     * assigned at construction. Display all the values for all the Circle
     * objects.
     * 
     */
    public static void main(String[] args) {
        // Circle 1 - small value (5.0);
        Circle small = new Circle();
        small.setRadius(5.0);
        System.out.println("Radius of Small Circle: " + small.getRadius());
        System.out.println("Diameter of Small Circle: "+small.getDiameter());
        System.out.println("Area of Small Circle: " + small.getArea());
        
        
        //Circle 2 - Large vlaue (20);
        Circle large = new Circle();
        large.setRadius(20);
        System.out.println("Radius of large Circle: " + large.getRadius());
        System.out.println("Diameter of large Circle: "+large.getDiameter());
        System.out.println("Area of large Circle: " + large.getArea());
        
        //Circle 3 - default/basic
        Circle basic = new Circle();
        System.out.println("Radius of Basic Circle: " + basic.getRadius());
        System.out.println("Diameter of Basic Circle: "+basic.getDiameter());
        System.out.println("Area of basic Circle: " + basic.getArea());
    }
    
}
