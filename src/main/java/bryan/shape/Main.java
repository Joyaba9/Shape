/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.shape;

/**
 *
 * @author joyabryan
 */
public class Main {
  public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(2),
            new Rectangle(3, 4),
            new Sphere(2),
            new Cube(3),
            new Triangle(2.5,4.0)
            
        };

        for (Shape shape : shapes) {
            System.out.println(shape.getDescription());

            if (shape instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDShape = (TwoDimensionalShape) shape;
                System.out.printf("Area: %.2f%n", twoDShape.getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                System.out.printf("Area: %.2f, Volume: %.2f%n", threeDShape.getArea(), threeDShape.getVolume());
            }

            System.out.println();
        }
    }
}