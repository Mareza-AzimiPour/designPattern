package behavioral.command;

/**
 * Utility class that provides the appropriate
 * {@link FileSystemReceiver} implementation
 * based on the underlying operating system.
 */
public class FileSystemReceiveUtils {

    /**
     * Returns the proper FileSystemReceiver depending on the OS.
     *
     * @return a WindowsFileSystemReceiver or UnixFileSystemReceiver
     */
    public static FileSystemReceiver getFileSystemReceiver() {
        String osName = System.getProperty("os.name");
        System.out.println("OS name: " + osName);
        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
