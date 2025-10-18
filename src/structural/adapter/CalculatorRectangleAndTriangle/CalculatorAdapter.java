package structural.adapter.CalculatorRectangleAndTriangle;

/**
 * Adapts a {@link Triangle} object to be compatible with the {@link CalculatorInterface}
 * for area calculation, by internally converting it into a {@link Rectangle}.
 * <p>
 * This class plays the <b>Adapter</b> role in the <em>Adapter Design Pattern</em>,
 * enabling a {@code Triangle} (which lacks a direct area method matching the target interface)
 * to be used with an existing {@code Calculator} that computes rectangle areas.
 * </p>
 *
 * <p><b>Design Intent:</b></p>
 * The adapter treats the triangle as a rectangle whose base equals the triangle's base
 * and whose width is half its height (i.e. area equivalence:
 * <code>area = base * (0.5 * height)</code>).
 * Thus, it delegates the computation to {@link Calculator#getArea(Rectangle)}.
 * </p>
 *
 * <p><b>Example Usage:</b></p>
 * <pre>
 *     Triangle triangle = new Triangle(10.0, 6.0);
 *     CalculatorInterface adapter = new CalculatorAdapter(triangle);
 *     double area = adapter.getArea(null);  // Adapted to rectangle internally
 * </pre>
 *
 * @author Mohammadreza Azimipour
 * @version 1.0
 * @since 2025-10-18
 */
public class CalculatorAdapter implements CalculatorInterface {

    /**
     * The underlying calculator used to compute the rectangular area.
     */
    private Calculator calculator;

    /**
     * The triangle that needs to be adapted for area calculation.
     */
    private Triangle triangle;

    /**
     * Constructs a new {@code CalculatorAdapter} that adapts the
     * given {@link Triangle}.
     *
     * @param triangle the triangle instance to adapt
     */
    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    /**
     * Converts the triangle into an equivalent rectangle representation
     * and delegates the area calculation to {@link Calculator#getArea(Rectangle)}.
     * <p>
     * The conversion uses the formula:
     * <code>Rectangle.length = triangle.base</code> and
     * <code>Rectangle.width = 0.5 * triangle.height</code>.
     * </p>
     *
     * @param rectangle a {@link Rectangle} placeholder (not used, may be {@code null})
     * @return the computed area of the adapted triangle
     */
    @Override
    public double getArea(Rectangle rectangle) {
        calculator = new Calculator();
        Rectangle r = new Rectangle();

        r.length = triangle.base;
        r.width = 0.5 * triangle.height;

        return calculator.getArea(r);
    }
}

