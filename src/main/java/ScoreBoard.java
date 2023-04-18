public class ScoreBoard {
    public static void display(Cars cars) {
        for (int j = 0; j < cars.carCount(); j++) {
            System.out.println(cars.getScore(j));
        }

        System.out.println();
    }
}
