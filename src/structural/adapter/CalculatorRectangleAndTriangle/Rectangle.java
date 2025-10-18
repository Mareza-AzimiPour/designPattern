package structural.adapter.CalculatorRectangleAndTriangle;

/**
 * Represents a geometric rectangle defined by its length and width.
 * <p>
 * This class serves as a lightweight model for a rectangle in
 * geometric calculations or shape-based domain entities. It can be
 * extended to include derived attributes such as area or perimeter.
 * </p>
 *
 * <p><b>Example Usage:</b></p>
 * <pre>
 *     Rectangle rectangle = new Rectangle();
 *     rectangle.length = 10.0;
 *     rectangle.width = 4.0;
 *     double area = rectangle.length * rectangle.width;
 * </pre>
 *
 * @author Mohammadreza Azimipour
 * @version 1.0
 * @since 2025-10-18
 */
public class Rectangle {

    /**
     * The length of the rectangle — typically the longer side.
     */
    public double length;

    /**
     * The width of the rectangle — typically the shorter side.
     */
    public double width;
}
