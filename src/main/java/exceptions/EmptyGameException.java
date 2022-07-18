package exceptions;

/**
 * Thrown in case Game had no players
 */
public class EmptyGameException extends Exception {
    public EmptyGameException() {
        super("The game needs at least 1 player");
    }
}
