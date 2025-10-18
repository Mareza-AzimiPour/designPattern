package structural.composite;

//leaf

/**
 * Represents an individual manager in the organizational structure.
 * <p>
 * The {@code Manager} class is a leaf node in the Composite design pattern.
 * It implements the {@link Employee} interface and provides its own
 * specific details without managing any subordinate employees.
 * </p>
 *
 * <p><b>Pattern Role:</b> Leaf in the Composite pattern.</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * Employee manager = new Manager("Reza", "M-102", "Project Manager");
 * manager.showEmployeeDetails();
 * }</pre>
 *
 * <p><b>Example Output:</b><br>
 * M-102 Reza Project Manager
 * </p>
 *
 * @author Mohammadreza Azimipour
 * @since 1.0
 */
public class Manager implements Employee {

    /**
     * The manager's name.
     */
    private String name;

    /**
     * The unique employee ID of the manager.
     */
    private String empId;

    /**
     * The job title or position of the manager.
     */
    private String position;

    /**
     * Constructs a new {@code Manager} object with the given details.
     *
     * @param name     the name of the manager
     * @param empId    the unique employee ID
     * @param position the position or job title
     */
    public Manager(String name, String empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    /**
     * Displays the manager's details.
     * <p>
     * Since {@code Manager} is a leaf node in the Composite pattern,
     * this method simply prints its own attributes (employee ID, name, and position)
     * to the console without delegating to any subordinates.
     * </p>
     */
    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}

