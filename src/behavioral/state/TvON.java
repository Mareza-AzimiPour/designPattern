package behavioral.state;

/**
 * TvON represents a <b>ConcreteState</b> in which the TV is turned on.
 *
 * <p>
 * When the power button is pressed in this state,
 * the TV transitions to the {@link TvOFF} state.
 * </p>
 */
public class TvON extends RemoteControler {

    /**
     * Handles the power button press when the TV is in the ON state.
     *
     * <p>
     * This method turns the TV OFF by changing the
     * context's state to {@link TvOFF}.
     * </p>
     *
     * @param context the TV context
     */
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already on. Going to be off now");
        context.setState(new TvOFF());
    }
}
