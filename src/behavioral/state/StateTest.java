package behavioral.state;

/**
 * StateTest acts as the <b>Client</b> in the State Design Pattern.
 *
 * <p>
 * It demonstrates how the {@link TV} behavior changes dynamically
 * by switching between different state objects at runtime.
 * </p>
 */
public class StateTest {

    /**
     * Application entry point.
     *
     * <p>
     * Initializes the TV in the OFF state and toggles
     * the power button to demonstrate state transitions.
     * </p>
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("***** STATE PATTERN *****");

        RemoteControler initState = new TvOFF();
        TV tv = new TV(initState);

        tv.pressButton(); // OFF -> ON
        tv.pressButton(); // ON -> OFF
    }
}
