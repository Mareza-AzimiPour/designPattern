package behavioral.command;

/**
 * WindowsFileSystemReceiver is a concrete receiver
 * that performs file operations on a Windows system.
 */
public class WindowsFileSystemReceiver implements FileSystemReceiver {

    /**
     * Opens a file in a Windows system.
     */
    @Override
    public void openFile() {
        System.out.println("Opening file in window");
    }

    /**
     * Writes to a file in a Windows system.
     */
    @Override
    public void writeFile() {
        System.out.println("Writing file in window");
    }

    /**
     * Closes a file in a Windows system.
     */
    @Override
    public void closeFile() {
        System.out.println("Closing file in window");
    }
}
