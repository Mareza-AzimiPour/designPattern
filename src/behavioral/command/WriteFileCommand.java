package behavioral.command;

/**
 * WriteFileCommand is a concrete command that
 * encapsulates the request to write to a file.
 * <p>
 * The write operation is delegated to a
 * {@link FileSystemReceiver}.
 */
public class WriteFileCommand implements Command {

    /**
     * Receiver that handles file writing.
     */
    private final FileSystemReceiver fileSystemReceiver;

    /**
     * Creates a WriteFileCommand with the given receiver.
     *
     * @param fileSystemReceiver the receiver that writes to the file
     */
    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    /**
     * Executes the write file command.
     */
    @Override
    public void execute() {
        fileSystemReceiver.writeFile();
    }
}
