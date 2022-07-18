package player;

import java.util.List;

public class Team extends Player {
    List<Player> players;

    public Team(String name, Double winRatio) {
        super(name, winRatio);
    }
}
