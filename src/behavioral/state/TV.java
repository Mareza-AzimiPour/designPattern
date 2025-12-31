package behavioral.state;

/**
 * TV acts as the <b>Context</b> in the State Design Pattern.
 *
 * <p>
 * It maintains a reference to the current {@link RemoteControler}
 * state and delegates state-specific behavior to it.
 * </p>
 *
 * <p>
 * The TV itself does not contain conditional logic (if/else or switch)
 * to determine behavior. Instead, behavior changes dynamically
 * when the state object changes.
 * </p>
 */
public class TV {

    /**
     * Holds the current state of the TV.
     */
    private RemoteControler state;

    /**
     * Creates a TV instance with an initial state.
     *
     * @param state the initial state of the TV
     */
    public TV(RemoteControler state) {
        this.state = state;
    }

    /**
     * Returns the current state of the TV.
     *
     * @return the current {@link RemoteControler} state
     */
    public RemoteControler getState() {
        return state;
    }

    /**
     * Changes the current state of the TV.
     *
     * @param state the new state to be set
     */
    public void setState(RemoteControler state) {
        this.state = state;
    }

    /**
     * Simulates pressing the power button on the TV.
     *
     * <p>
     * The request is delegated to the current state
     * object, allowing behavior to vary depending on
     * the TV's state.
     * </p>
     */
    public void pressButton() {
        state.pressSwitch(this);
    }
}
