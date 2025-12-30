package behavioral.command;

/**
 * FileSystemReceiver defines the operations
 * that can be performed on a file system.
 * <p>
 * Concrete implementations handle OS-specific logic.
 */
public interface FileSystemReceiver {

    /**
     * Opens a file.
     */
    void openFile();

    /**
     * Writes to a file.
     */
    void writeFile();

    /**
     * Closes a file.
     */
    void closeFile();
}
