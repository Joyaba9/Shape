/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.shape;

/**
 *
 * @author joyabryan
 */
public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
    
    
     @Override
    String getDescription() {
        return "Sphere{" + "radius=" + radius + '}';
    }

 
      
    
    
    
}
