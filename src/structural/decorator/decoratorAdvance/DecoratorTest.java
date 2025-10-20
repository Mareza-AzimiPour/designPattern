package structural.decorator.decoratorAdvance;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DecoratorTest {

    /**
     * Demonstrates the usage of {@link LowerCaseInputStream} to convert all uppercase
     * characters in an input stream to lowercase on-the-fly as data is read.
     *
     * <p>This example wraps a {@link java.io.ByteArrayInputStream} containing a text
     * buffer with {@code LowerCaseInputStream}, illustrating how the Decorator Pattern
     * can dynamically alter the behavior of an existing {@link java.io.InputStream}
     * without modifying its source.</p>
     *
     * <p>You can switch to using a real file by uncommenting the alternative line
     * that wraps a {@link java.io.FileInputStream} with {@link java.io.BufferedInputStream}.</p>
     *
     * <p>Example Output:</p>
     * <pre>
     * mareza azimi is good boy
     * </pre>
     *
     * @param args command-line arguments (not used).
     * @author Mohammad Reza
     * @see java.io.ByteArrayInputStream
     * @see java.io.BufferedInputStream
     * @see java.io.FileInputStream
     * @see LowerCaseInputStream
     * @since 1.0
     */
    public static void main(String[] args) {
        int c;
        StringBuffer sb = new StringBuffer("MAREZA AZIMI IS GOOD BOY");
        byte[] bytes = sb.toString().getBytes();
        try {
            // Wrap the byte array input with the LowerCaseInputStream decorator
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            /* Alternatively, read from file:
             * InputStream in = new LowerCaseInputStream(
             *         new BufferedInputStream(new FileInputStream("test.text")));
             */

            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
