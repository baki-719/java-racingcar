import java.util.Random;

public class Dice {
    private static final int MAX = 10;
    public int roll() {
        return new Random().nextInt(MAX);
    }
}
