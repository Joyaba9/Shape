/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.shape;

/**
 *
 * @author joyabryan
 */
public class Triangle extends TwoDimensionalShape {
     private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    String getDescription() {
        return String.format("Triangle with base %.2f and height %.2f", base, height);
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }
}