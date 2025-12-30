package behavioral.command;

/**
 * UnixFileSystemReceiver is a concrete receiver
 * that performs file operations on a Unix-based system.
 */
public class UnixFileSystemReceiver implements FileSystemReceiver {

    /**
     * Opens a file in a Unix system.
     */
    @Override
    public void openFile() {
        System.out.println("Opening file in unix system");
    }

    /**
     * Writes to a file in a Unix system.
     */
    @Override
    public void writeFile() {
        System.out.println("Writing file in unix system");
    }

    /**
     * Closes a file in a Unix system.
     */
    @Override
    public void closeFile() {
        System.out.println("Closing file in unix system");
    }
}
