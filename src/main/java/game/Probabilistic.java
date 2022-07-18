package game;

import exceptions.PlayerNotFoundException;
import exceptions.SinglePlayerException;

public interface Probabilistic<P> {

    /**
     * Updates a player in the game
     *
     * @param player the player to be updated
     * @throws PlayerNotFoundException if the player is not in the game
     */
    public void update(P player) throws PlayerNotFoundException;

    /**
     * Calculate a player chance of winning against it's opponents
     *
     * @param playerName the playerName to be analyzed
     * @throws SinglePlayerException   if the game has only 1 player
     * @throws PlayerNotFoundException if the player is not in the game
     */
    public int winChance(String playerName) throws SinglePlayerException, PlayerNotFoundException;
}
