package player;

public class Player {
    private String name;
    private Double winRatio;

    public Player(String name, Double winRatio) {
        this.name = name;
        this.winRatio = winRatio;
    }

    public Double getWinRatio() {
        return winRatio;
    }

    public String getName() {
        return name;
    }
}
