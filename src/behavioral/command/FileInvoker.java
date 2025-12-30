package behavioral.command;

/**
 * FileInvoker is responsible for invoking commands.
 * <p>
 * It does not know how the command is executed,
 * only that it can call the execute method.
 * <p>
 * This class represents the Invoker in the
 * Command Design Pattern.
 */
public class FileInvoker {

    /**
     * Command to be executed.
     */
    private final Command command;

    /**
     * Creates an invoker with a specific command.
     *
     * @param command the command to be executed
     */
    public FileInvoker(Command command) {
        this.command = command;
    }

    /**
     * Executes the assigned command.
     */
    public void execute() {
        command.execute();
    }
}
