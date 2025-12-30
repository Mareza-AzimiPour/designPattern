package behavioral.command;

/**
 * CommandTest acts as a client that demonstrates
 * the usage of the Command Design Pattern.
 * <p>
 * It creates commands, assigns them to an invoker,
 * and executes them without coupling to receivers.
 */
public class CommandTest {

    public static void main(String[] args) {
        FileSystemReceiver fs = FileSystemReceiveUtils.getFileSystemReceiver();

        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        FileInvoker invoker = new FileInvoker(openFileCommand);
        invoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        invoker = new FileInvoker(closeFileCommand);
        invoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        invoker = new FileInvoker(writeFileCommand);
        invoker.execute();
    }
}
