package exceptions;

/**
 *  Thrown in case player was not found
 */
public class PlayerNotFoundException extends Exception {
    public PlayerNotFoundException() {
        super("Player not found");
    }
}
