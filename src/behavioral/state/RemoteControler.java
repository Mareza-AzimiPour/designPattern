package behavioral.state;

/**
 * RemoteControler represents the <b>State</b> in the State Design Pattern.
 *
 * <p>
 * This abstract class defines the common interface for all concrete
 * states of the {@link TV}. Each concrete implementation encapsulates
 * behavior associated with a particular state of the TV.
 * </p>
 *
 * <p>
 * Implementations of this class are responsible not only for defining
 * state-specific behavior, but also for changing the current state
 * of the {@link TV} context when appropriate.
 * </p>
 */
public abstract class RemoteControler {

    /**
     * Handles the action triggered by pressing the power switch.
     *
     * <p>
     * Concrete states must provide their own implementation of this
     * method and may change the state of the given {@link TV} context.
     * </p>
     *
     * @param context the TV context whose state may be changed
     */
    public abstract void pressSwitch(TV context);
}
