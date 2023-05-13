/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.shape;

/**
 *
 * @author joyabryan
 */
public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    String getDescription() {
         return "Circle{" + "radius=" + radius + '}';
    } 
    
    
}