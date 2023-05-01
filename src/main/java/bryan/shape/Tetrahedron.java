/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.shape;

/**
 *
 * @author joyabryan
 */
public class Tetrahedron extends ThreeDimensionalShape {
    private double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    @Override
    String getDescription() {
        return String.format("Tetrahedron with edge length %.2f", edge);
    }

    @Override
    double getArea() {
        return Math.sqrt(3) * Math.pow(edge, 2);
    }

    @Override
    double getVolume() {
        return Math.pow(edge, 3) / (6 * Math.sqrt(2));
    }
}