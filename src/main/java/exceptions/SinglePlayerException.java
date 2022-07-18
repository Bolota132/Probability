package exceptions;

/**
 *  Thrown in case the game had only one player
 */
public class SinglePlayerException extends Exception {
    public SinglePlayerException() {
        super("The game has only one player");
    }
}
