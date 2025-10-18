package structural.adapter.CalculatorRectangleAndTriangle;

/**
 * Provides the core implementation for rectangle area calculation.
 * <p>
 * This class represents the <b>Adaptee</b> component in the
 * <em>Adapter Design Pattern</em>. It exposes a method that
 * calculates the area of a {@link Rectangle} but does not
 * directly support other geometric shapes.
 * </p>
 *
 * <p>
 * Through the use of an adapter (e.g., {@link CalculatorAdapter}),
 * this functionality can be reused to compute areas of other shapes
 * such as {@link Triangle}, by converting their dimensions into
 * an equivalent rectangular representation.
 * </p>
 *
 * <p><b>Example Usage:</b></p>
 * <pre>
 *     Rectangle rectangle = new Rectangle();
 *     rectangle.length = 8.0;
 *     rectangle.width  = 5.0;
 *
 *     Calculator calculator = new Calculator();
 *     double area = calculator.getArea(rectangle);
 * </pre>
 *
 * @author Mohammadreza Azimipour
 * @version 1.0
 * @since 2025-10-18
 */
public class Calculator implements CalculatorInterface {

    /**
     * The rectangle used internally for area computation.
     */
    private Rectangle rectangle;

    /**
     * Computes the area of the specified {@link Rectangle}.
     * <p>
     * The result is calculated using the standard geometric formula:
     * <code>area = length × width</code>.
     * </p>
     *
     * @param rectangle the {@link Rectangle} object whose area should be computed
     * @return the calculated area of the rectangle
     */
    @Override
    public double getArea(Rectangle rectangle) {
        this.rectangle = rectangle;
        return rectangle.length * rectangle.width;
    }
}

