package example0;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamClassExample {
    public static void main(String[] args) {
        List<CarWithEnum> cars = new ArrayList<CarWithEnum>() {{
            add(new CarWithEnum("BMW X6", TypeCar.CROSSOVER, "Black", 4));
            add(new CarWithEnum("Nissan Maxima", TypeCar.SEDAN, "Bronze", 4));
            add(new CarWithEnum("Lada 2112", TypeCar.HATCHBACK, "Red", 2));
            add(new CarWithEnum("Mersedez", TypeCar.PICPUC, "White", 0));
            add(new CarWithEnum("Honda Civik", TypeCar.SEDAN, "Green", 2));
            add(new CarWithEnum("Nissan Juke", TypeCar.CROSSOVER, "Yellow", 4));
        }};

        // cars.stream().filter(temp -> temp.getType().equals(TypeCar.SEDAN)).forEach(x -> System.out.println(x));  // -> - текущий элемент из коллекции

        List<CarWithEnum> streams = cars.stream()
                .filter(temp -> temp.getType().equals(TypeCar.SEDAN))
                .collect(Collectors.toList());
        System.out.println(streams);

        List<String> only2Doors = cars.stream()
                .filter(x -> x.getDoorCount() > 2)
                .map(CarWithEnum::getCarName)
                .collect(Collectors.toList());
        System.out.println(only2Doors);

        CarWithEnum lastCar = cars.get(cars.size() - 1);
        CarWithEnum lastCarStream = cars.stream().reduce((temp, next) -> next).get();
        System.out.println(lastCar.getCarName());
        System.out.println(lastCarStream.getCarName());

        cars.stream().filter(x -> x.getCarName().equals("Lexus RX"))
                .findFirst().orElseThrow(() -> new IllegalStateException("Не найдено"));
    }
}
