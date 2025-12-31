package behavioral.state;

/**
 * TvOFF represents a <b>ConcreteState</b> in which the TV is turned off.
 *
 * <p>
 * When the power button is pressed in this state,
 * the TV transitions to the {@link TvON} state.
 * </p>
 */
public class TvOFF extends RemoteControler {

    /**
     * Handles the power button press when the TV is in the OFF state.
     *
     * <p>
     * This method turns the TV ON by changing the
     * context's state to {@link TvON}.
     * </p>
     *
     * @param context the TV context
     */
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already off, Going to be On now");
        context.setState(new TvON());
    }
}
