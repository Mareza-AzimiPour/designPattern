package structural.composite;

import java.util.ArrayList;
import java.util.List;

//Composite

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a composite directory that can contain multiple {@link Employee} objects.
 * <p>
 * The {@code Directory} class acts as the <b>Composite</b> in the Composite design pattern.
 * It maintains a collection of child {@code Employee} elements and delegates
 * operations (such as displaying employee details) to them.
 * </p>
 *
 * <p><b>Pattern Role:</b> Composite in the Composite pattern.</p>
 *
 * <p><b>Key Responsibilities:</b></p>
 * <ul>
 *   <li>Maintain a list of child employees (developers, managers, or nested directories).</li>
 *   <li>Implement the {@link Employee} interface to allow uniform treatment with leaves.</li>
 *   <li>Delegate the {@code showEmployeeDetails()} call to all contained employees.</li>
 * </ul>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * Employee dev1 = new Developer("Ali", "D-101", "Backend Developer");
 * Employee dev2 = new Developer("Sara", "D-102", "Frontend Developer");
 * Employee mgr1 = new Manager("Reza", "M-100", "Project Manager");
 *
 * Directory directory = new Directory();
 * directory.addEmployee(dev1);
 * directory.addEmployee(dev2);
 * directory.addEmployee(mgr1);
 *
 * directory.showEmployeeDetails();
 * }</pre>
 *
 * <p><b>Expected Output:</b><br>
 * D-101 Ali Backend Developer<br>
 * D-102 Sara Frontend Developer<br>
 * M-100 Reza Project Manager
 * </p>
 *
 * @author Mohammadreza Azimipour
 * @since 1.0
 */
public class Directory implements Employee {

    /**
     * The list of employees contained within this directory (Composite structure).
     */
    private List<Employee> employees = new ArrayList<>();

    /**
     * Displays the details of all employees contained in this directory.
     * <p>
     * As a composite element, this method iterates over each child
     * and delegates the call to their {@code showEmployeeDetails()} implementation.
     * </p>
     */
    @Override
    public void showEmployeeDetails() {
        for (Employee e : employees) {
            e.showEmployeeDetails();
        }
    }

    /**
     * Adds an {@link Employee} to this directory.
     *
     * @param e the employee to add
     */
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    /**
     * Removes an {@link Employee} from this directory.
     *
     * @param e the employee to remove
     */
    public void removeEmployee(Employee e) {
        employees.remove(e);
    }
}

