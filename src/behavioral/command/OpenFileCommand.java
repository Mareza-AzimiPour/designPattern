package behavioral.command;

/**
 * OpenFileCommand is a concrete command that
 * encapsulates the request to open a file.
 * <p>
 * The actual operation is performed by the
 * {@link FileSystemReceiver}.
 */
public class OpenFileCommand implements Command {

    /**
     * Receiver responsible for file system operations.
     */
    private final FileSystemReceiver fileSystemReceiver;

    /**
     * Creates an OpenFileCommand with the given receiver.
     *
     * @param fileSystemReceiver the receiver that opens the file
     */
    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    /**
     * Executes the open file command.
     */
    @Override
    public void execute() {
        this.fileSystemReceiver.openFile();
    }
}
