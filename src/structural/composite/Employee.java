package structural.composite;

//Component

/**
 * Represents the base component in the Composite design pattern.
 * <p>
 * The {@code Employee} interface defines the common operation
 * to be implemented by both leaf elements (such as {@code Developer})
 * and composite elements (such as {@code Directory})
 * in the organizational structure.
 * </p>
 *
 * <p><b>Pattern Role:</b> Component in the Composite pattern.</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * Employee dev = new Developer("Alice", "Backend Developer");
 * Employee dir = new Directory();
 * dir.addEmployee(dev);
 * dir.showEmployeeDetails();
 * }</pre>
 *
 * @author Mohammadreza Azimipour
 * @since 1.0
 */
public interface Employee {

    /**
     * Displays the details of the employee.
     * <p>
     * For a leaf element, this method typically prints
     * its own details (e.g., name, position).
     * For a composite element, it delegates the call
     * to its children recursively.
     * </p>
     */
    void showEmployeeDetails();
}

