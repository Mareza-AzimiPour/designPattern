package structural.adapter.CalculatorRectangleAndTriangle;

/**
 * Represents a geometric triangle shape defined by its base and height.
 * <p>
 * This class provides a simple data structure to model a triangle
 * and can be extended with additional functionalities such as area
 * calculation or perimeter estimation in geometric modules.
 * </p>
 *
 * <p><b>Example Usage:</b></p>
 * <pre>
 *     Triangle triangle = new Triangle(10.0, 5.0);
 *     double area = 0.5 * triangle.base * triangle.height;
 * </pre>
 *
 * @author Mohammadreza Azimipour
 * @version 1.0
 * @since 2025-10-18
 */
public class Triangle {

    /**
     * The length of the triangle's base.
     */
    public double base;

    /**
     * The height of the triangle measured perpendicular to its base.
     */
    public double height;

    /**
     * Constructs a new {@code Triangle} instance
     * with the specified base and height.
     *
     * @param base   the length of the triangle's base
     * @param height the height of the triangle measured perpendicular to its base
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}
