package game;

import exceptions.EmptyGameException;
import exceptions.InvalidNumberOfPlayersException;
import exceptions.PlayerNotFoundException;
import exceptions.SinglePlayerException;
import player.Player;
import player.Team;

import java.util.List;

public class CSGO extends Game<Team> {

    /**
     * Creates a game with the given name and players
     *
     * @param teams the list of players
     * @throws EmptyGameException if the game has no players
     */
    public CSGO(List<Team> teams) throws EmptyGameException, InvalidNumberOfPlayersException {
        super("CSGO", teams);
        if (teams.size() != 2) {
            throw new InvalidNumberOfPlayersException();
        }
    }


    /**
     * Updates a player in the game
     *
     * @param player the player to be updated
     * @throws PlayerNotFoundException if the player is not in the game
     */
    @Override
    public void update(Team player) throws PlayerNotFoundException {
        int index = -1;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(player.getName())) {
                index = i;
                break;
            }
        }
        if (index < 0) {
            throw new PlayerNotFoundException();
        }

        players.add(index, player);
    }

    /**
     * Calculate a player chance of winning against it's opponents
     *
     * @param playerName the playerName to be analyzed
     * @throws SinglePlayerException   if the game has only 1 player
     * @throws PlayerNotFoundException if the player is not in the game
     */
    @Override
    public int winChance(String playerName) throws SinglePlayerException, PlayerNotFoundException {
        if (players.size() == 1) {
            throw new SinglePlayerException();
        }

        Double othersWinRatio = 0.0;
        Player player;
        try {
            player = players.stream().filter((p -> p.getName().equals(playerName))).toList().get(0);
        } catch (Exception e) {
            throw new PlayerNotFoundException();
        }
        List<Team> otherPlayers = players.stream().filter((p) -> !p.getName().equals(playerName)).toList();

        for (Player p : otherPlayers) {
            othersWinRatio += p.getWinRatio();
        }

        return (int) ((player.getWinRatio() / (player.getWinRatio() + othersWinRatio)) * 100);
    }
}
