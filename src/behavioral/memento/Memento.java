package behavioral.memento;

/**
 * Memento stores the internal state of the {@link FileWriterUtils}
 * object.
 *
 * <p>
 * This class is immutable from the perspective of the
 * {@code Caretaker} and encapsulates the details of the
 * originator's state. Only the originator should access
 * its internal data.
 * </p>
 */
public class Memento {

    /**
     * Stored file name.
     */
    String fileName;

    /**
     * Stored file content.
     */
    StringBuilder content;

    /**
     * Creates a memento containing a snapshot of the originator's state.
     *
     * <p>
     * A deep copy of the content is created to avoid
     * unintentional modifications.
     * </p>
     *
     * @param fileName the file name to store
     * @param content  the file content to store
     */
    public Memento(String fileName, StringBuilder content) {
        this.fileName = fileName;
        this.content = new StringBuilder(content); // Deep copy
    }
}
