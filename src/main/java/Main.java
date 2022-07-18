import exceptions.EmptyGameException;
import exceptions.InvalidNumberOfPlayersException;

public class Main {

    public static void main(String[] args) {
        ProbabilityCalculator calculator = null;
        try {
            calculator = new ProbabilityCalculator();
            System.out.println(calculator.calculatePlayerProbability("faker"));
        } catch (EmptyGameException | InvalidNumberOfPlayersException e) {
            System.out.println(e.getMessage());
        }

    }
}
