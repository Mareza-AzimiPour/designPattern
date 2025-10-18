package structural.adapter.CalculatorRectangleAndTriangle;

/**
 * Defines the contract for geometric area calculation.
 * <p>
 * This interface represents the <b>Target</b> role in an
 * Adapter design pattern, providing a unified method
 * signature for calculating the area of geometric shapes.
 * </p>
 *
 * <p>
 * Implementations of this interface can adapt specific
 * shape types (such as rectangles, triangles, or circles)
 * to provide their respective area computations without
 * modifying existing shape classes.
 * </p>
 *
 * <p><b>Design Note:</b></p>
 * This interface abstracts the area calculation behavior
 * and allows flexible integration of new shape adapters
 * in systems following the Structural Design Patterns.
 *
 * <pre>
 *     CalculatorInterface calculator = new RectangleAreaAdapter();
 *     double result = calculator.getArea(new Rectangle(10, 5));
 * </pre>
 *
 * @author Mohammadreza Azimipour
 * @version 1.0
 * @since 2025-10-18
 */
public interface CalculatorInterface {

    /**
     * Calculates the area of the given rectangle.
     *
     * @param rectangle the {@link Rectangle} object whose area is to be calculated
     * @return the computed area of the rectangle
     */
    double getArea(Rectangle rectangle);
}
