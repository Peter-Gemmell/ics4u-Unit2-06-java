/*
* Main Class (1)
*
* @author  Peter Gemmell
* @version 11.0.16
* @since   2022-10-17
*/

/**
 * Main class.
 */
final class Main {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(String[] args) {
        final int one = 212;
        final int two = 422;
        final int three = 4;
        final int four = 5000;

        final Airplane biplane = new Airplane();
        biplane.setSpeed(one);
        System.out.println(biplane.getSpeed());

        final Jet boeing = new Jet();
        boeing.setSpeed(two);
        System.out.println(boeing.getSpeed());
        int counter = 0;

        while (counter < three) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > four) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            } else {
                boeing.accelerate();
            }
            counter++;
        }
        System.out.println(biplane.getSpeed());
    }
}
