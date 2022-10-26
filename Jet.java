/*
* Jet Class (2)
*
* @author  Peter Gemmell
* @version 11.0.16
* @since   2022-10-17
*/

/**
 * Jet class.
 */
public class Jet extends Airplane {

    /**
     * Declares MULTIPLIER to 2.
     */
    private static final int MULTIPLIER = 2;

    /**
     * Declares Jet.
     */
    public Jet() {
        // super();
    }

    /**
     * Calculates speed.
     *
     * @param speed - speed of jet
     */
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
     * Calculates accelerate.
     */
    public void accelerate() {
        super.setSpeed(getSpeed() * 2);
    }
}
