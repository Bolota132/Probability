package exceptions;

public class InvalidNumberOfPlayersException extends Exception {
    public InvalidNumberOfPlayersException() {
        super("Invalid number of players");
    }
}
