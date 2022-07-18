package game;

import exceptions.EmptyGameException;
import player.Player;

import java.util.List;

public abstract class Game<P extends Player> implements Probabilistic<P> {
    protected List<P> players;
    protected String name;

    /**
     * Creates a game with the given name and players
     *
     * @param name    the games name
     * @param players the list of players
     * @throws EmptyGameException if the game has no players
     */
    protected Game(String name, List<P> players) throws EmptyGameException {
        if (players.size() == 0) {
            throw new EmptyGameException();
        }

        this.players = players;
        this.name = name;
    }

    /**
     * @return the game name
     */
    public String getGameName() {
        return name;
    }

    /**
     * @return the list of players in the game
     */
    public List<P> getPlayers() {
        return players;
    }
}
