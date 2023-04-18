public class Game {
    private final Cars cars;
    private final Dice dice;
    private final int maxSetCount;

    private static final int HURDLE = 4;

    public Game(InputView.GameInfo gameInfo) {
        this.cars = new Cars(gameInfo.getCarCount());
        this.maxSetCount = gameInfo.getSetCount();
        this.dice = new Dice();
    }

    public void play() {
        for (int i = 0; i < maxSetCount; i++) {
            doSet();
            ScoreBoard.display(cars);
        }
    }

    public void doSet() {
        for (int i = 0; i < cars.carCount(); i++) {
            int eye =  dice.roll();
            if(isOverHurdle(eye)) {
                cars.move(i);
            }
        }
    }

    public boolean isOverHurdle(int eye) {
        return eye >= HURDLE;
    }

    public static void main(String[] args) {
        Game game = new Game(InputView.input());
        game.play();
    }
}
