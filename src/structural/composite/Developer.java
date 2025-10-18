package structural.composite;

//leaf

/**
 * Represents a software developer within the organization hierarchy.
 * <p>
 * The {@code Developer} class acts as a leaf node in the Composite design pattern.
 * It implements the {@link Employee} interface and only contains
 * individual employee information without maintaining subordinate elements.
 * </p>
 *
 * <p><b>Pattern Role:</b> Leaf in the Composite pattern.</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * Employee dev1 = new Developer("Ali", "D-101", "Backend Developer");
 * Employee dev2 = new Developer("Sara", "D-102", "Frontend Developer");
 * dev1.showEmployeeDetails();
 * dev2.showEmployeeDetails();
 * }</pre>
 *
 * <p><b>Example Output:</b><br>
 * D-101 Ali Backend Developer<br>
 * D-102 Sara Frontend Developer
 * </p>
 *
 * @author Mohammadreza Azimipour
 * @since 1.0
 */
public class Developer implements Employee {

    /**
     * The name of the developer.
     */
    private String name;

    /**
     * The unique employee ID of the developer.
     */
    private String empId;

    /**
     * The position or job title of the developer.
     */
    private String position;

    /**
     * Constructs a new {@code Developer} instance with the specified details.
     *
     * @param name     the name of the developer
     * @param empId    the unique employee ID
     * @param position the position or job title
     */
    public Developer(String name, String empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    /**
     * Displays the developer's details.
     * <p>
     * Since this class represents a leaf in the Composite pattern,
     * this method only prints the developer’s own attributes
     * (employee ID, name, and position) to the console.
     * </p>
     */
    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}

