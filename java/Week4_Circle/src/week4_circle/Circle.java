/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4_circle;

import static java.lang.Math.PI;

/**
 *
 * @author Marc Pardee
 */
public class Circle {
    private double radius;
    private double diameter; 
    private double area;
    
    Circle(){
        radius = 1;
        diameter = 2 * radius;
        area = PI *radius * radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
        diameter = 2 * radius;
        area = PI * radius * radius;
    }
    
    public double getDiameter(){
        return diameter;
    }
    public double getArea(){
        return area;
    }
    
}
