import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static GameInfo input() {
        System.out.println("자동차는 몇 대 인가요?");
        int carCount = scanner.nextInt();
        System.out.println("몇 세트 시도 합니까?");
        int setCount = scanner.nextInt();
        return new GameInfo(carCount, setCount);
    }

    public static class GameInfo {
        private final int carCount;
        private final int setCount;

        public GameInfo(int carCount, int setCount) {
            this.carCount = carCount;
            this.setCount = setCount;
        }

        public int getCarCount() {
            return carCount;
        }

        public int getSetCount() {
            return setCount;
        }
    }

}