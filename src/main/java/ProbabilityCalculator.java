import exceptions.EmptyGameException;
import exceptions.InvalidNumberOfPlayersException;
import exceptions.PlayerNotFoundException;
import exceptions.SinglePlayerException;
import game.CSGO;
import game.Game;
import game.HearthStone;
import player.Player;
import player.Team;

import java.util.List;

public class ProbabilityCalculator {
    Game<Player> game;

    ProbabilityCalculator() throws EmptyGameException, InvalidNumberOfPlayersException {
        try {
            this.game = new HearthStone(List.of(new Player("faker", 80.0), new Player("bjergsen", 70.0)));
        } catch (EmptyGameException | InvalidNumberOfPlayersException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    /**
     * Calculates the player win ratio
     *
     * @param player the players name to be analyzed
     */
    public String calculatePlayerProbability(String player) {
        try {
            return game.winChance(player) + "% de chance de vitória";
        } catch (SinglePlayerException | PlayerNotFoundException e) {
            return e.getMessage();
        }
    }


}
