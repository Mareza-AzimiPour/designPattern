package behavioral.command;

/**
 * Command interface declares a method for executing a command.
 * <p>
 * This interface is the core of the Command Design Pattern
 * and decouples the command invoker from the actual action performer.
 */
public interface Command {

    /**
     * Executes the encapsulated command.
     */
    void execute();
}
