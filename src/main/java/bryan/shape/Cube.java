/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.shape;

/**
 *
 * @author joyabryan
 */
public class Cube extends ThreeDimensionalShape {
    private double length;

    public Cube(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    double getArea() {
        return 6 * Math.pow(length, 2);
    }

    @Override
    double getVolume() {
        return Math.pow(length, 3);
    }
    
     @Override
    String getDescription() {
        return "Cube{" + "length=" + length + '}';
    }

    
    
    
    
    
}