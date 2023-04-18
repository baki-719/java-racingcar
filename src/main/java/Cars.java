import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(int carCount) {
        this.cars = new ArrayList<>();

        for(int i = 0 ; i < carCount; i++) {
            cars.add(new Car());
        }
    }

    public int carCount() {
        return this.cars.size();
    }

    public String getScore(int index) {
        return cars.get(index).calculateScore();
    }

    public void move(int index) {
        cars.get(index).moveForward();
    }

    public static class Car {
        private int position;

        public Car() {
            this.position = 0;
        }

        public void moveForward() {
            this.position++;
        }

        public String calculateScore() {
            return "-".repeat(position);
        }
    }
}
