package behavioral.memento;

/**
 * FileCareTaker acts as the <b>Caretaker</b> in the Memento Design Pattern.
 *
 * <p>
 * It is responsible for storing and restoring the {@link Memento}
 * objects without accessing or modifying their internal state.
 * The caretaker never changes the saved state; it only keeps
 * a reference to it.
 * </p>
 */
public class FileCareTaker {

    /**
     * Holds the last saved memento object.
     * <p>
     * Stored as {@code Object} to prevent direct access
     * to the memento's internal structure.
     * </p>
     */
    private Object object;

    /**
     * Saves the current state of the given {@link FileWriterUtils}.
     *
     * @param fileWriterUtils the originator whose state is to be saved
     */
    public void save(FileWriterUtils fileWriterUtils) {
        this.object = fileWriterUtils.save();
    }

    /**
     * Restores the state of the given {@link FileWriterUtils}
     * to the last saved state.
     *
     * @param fileWriterUtils the originator whose state should be restored
     */
    public void undo(FileWriterUtils fileWriterUtils) {
        fileWriterUtils.undoToLastSave(object);
    }
}
