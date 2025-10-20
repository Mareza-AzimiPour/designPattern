package structural.decorator.decoratorAdvance;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * The {@code LowerCaseInputStream} class is a custom decorator for Java’s
 * {@link java.io.InputStream}, designed to convert all incoming bytes
 * representing characters to lowercase as they are read.
 *
 * <p>This class extends {@link java.io.FilterInputStream}, which already implements
 * the Decorator Design Pattern for input streams. By wrapping another {@code InputStream},
 * it transparently transforms the stream’s output data to lowercase without altering
 * the underlying source or client code.</p>
 *
 * <p>Example:</p>
 * <pre>
 * try (InputStream in =
 *          new LowerCaseInputStream(new FileInputStream("input.txt"))) {
 *     int c;
 *     while ((c = in.read()) >= 0) {
 *         System.out.print((char) c);
 *     }
 * }
 * </pre>
 *
 * <p>Output: The content of the file will be printed entirely in lowercase.</p>
 *
 * @author Mohammad Reza
 * @see java.io.InputStream
 * @see java.io.FilterInputStream
 * @since 1.0
 */
public class LowerCaseInputStream extends FilterInputStream {

    /**
     * Constructs a {@code LowerCaseInputStream} that wraps the specified input stream.
     *
     * @param in the {@link InputStream} to be wrapped and filtered to lowercase
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    /**
     * Reads a single byte from the underlying input stream and converts it to lowercase
     * if it represents an alphabetic character.
     *
     * @return the lowercase representation of the next byte, or {@code -1} if the end
     * of the stream has been reached.
     * @throws IOException if an I/O error occurs while reading the stream.
     */
    @Override
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    /**
     * Reads a block of bytes from the input stream into the specified byte array,
     * then converts the characters within the buffer to lowercase.
     *
     * @param b      the buffer into which data is read.
     * @param offset the start offset in array {@code b} at which the data is written.
     * @param len    the maximum number of bytes to read.
     * @return the total number of bytes read into the buffer, or {@code -1} if there
     * is no more data.
     * @throws IOException if an I/O error occurs while reading the stream.
     */
    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = 0; i < result && i < len; i++) {
            b[offset + i] = (byte) Character.toLowerCase((char) b[offset + i]);
        }
        return result;
    }
}

