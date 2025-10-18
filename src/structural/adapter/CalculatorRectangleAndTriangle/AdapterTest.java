package structural.adapter.CalculatorRectangleAndTriangle;

/**
 * Demonstrates the use of the Adapter Design Pattern
 * to calculate the area of a {@link Triangle} using an existing
 * {@link Calculator} that only supports rectangles.
 * <p>
 * This class acts as the <b>Client</b> in the pattern, showing how
 * a {@link CalculatorAdapter} seamlessly bridges the gap between
 * two incompatible interfaces — {@link Triangle} (source shape) and
 * {@link Calculator} (adaptee logic).
 * </p>
 *
 * <p><b>Execution Flow:</b></p>
 * <ol>
 *     <li>Create a {@link Triangle} instance with base and height.</li>
 *     <li>Wrap it inside a {@link CalculatorAdapter} implementation
 *         of {@link CalculatorInterface}.</li>
 *     <li>Invoke the {@code getArea()} method to delegate computation.</li>
 * </ol>
 *
 * <p><b>Console Output Example:</b></p>
 * <pre>
 * **Adapter  Pattern Demo
 * Area of Triangle is:100.0
 * </pre>
 *
 * @author Mohammadreza Azimipour
 * @version 1.0
 * @since 2025-10-18
 */
public class AdapterTest {

    /**
     * The entry point of the Adapter pattern demonstration.
     * <p>
     * It creates a sample triangle, adapts it through a
     * {@link CalculatorAdapter}, and prints its calculated area
     * to the console.
     * </p>
     *
     * @param args not used in this program
     */
    public static void main(String[] args) {
        System.out.println("**Adapter Pattern Demo");

        Triangle triangle = new Triangle(20, 10);

        CalculatorInterface calculatorAdapter = new CalculatorAdapter(triangle);

        System.out.println("Area of Triangle is: " + calculatorAdapter.getArea(null));
    }
}

