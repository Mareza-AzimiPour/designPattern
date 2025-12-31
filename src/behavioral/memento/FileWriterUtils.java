package behavioral.memento;

/**
 * FileWriterUtils represents the <b>Originator</b> in the
 * Memento Design Pattern.
 *
 * <p>
 * It maintains the internal state (file name and content)
 * and provides mechanisms to save this state into a {@link Memento}
 * and restore it later without exposing its internal structure.
 * </p>
 */
public class FileWriterUtils {

    /**
     * Name of the file being edited.
     */
    private String fileName;

    /**
     * Content of the file.
     */
    private StringBuilder content;

    /**
     * Creates a FileWriterUtils instance for the given file name.
     *
     * @param fileName the name of the file
     */
    public FileWriterUtils(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    /**
     * Returns the current content of the file as a string.
     *
     * @return file content
     */
    @Override
    public String toString() {
        return this.content.toString();
    }

    /**
     * Appends text to the file content.
     *
     * @param msg the text to append
     */
    public void write(String msg) {
        this.content.append(msg);
    }

    /**
     * Creates a {@link Memento} representing the current state
     * of this object.
     *
     * @return a memento containing the current state
     */
    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    /**
     * Restores the state of this object from the given memento.
     *
     * @param obj the memento object containing the previous state
     */
    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }
}
