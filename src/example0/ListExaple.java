package example0;

import java.util.ArrayList;
import java.util.List;

public class ListExaple {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<>();
        names1.add("Jhon");
        names1.add("Kate");
        String firstNames = names1.get(0);
        System.out.println(firstNames);
        System.out.println(names1.contains("Kate"));
        System.out.println(names1.contains("Oleg"));

        for (int i = 0; i < names1.size(); i++) {
            System.out.println(names1.get(i));
        }

        List<Car> names = getCarNames();
        List<Car> carWithFuel = new ArrayList<>();


        for (Car car : names) {
            if(car.getFuel() > 15) {
                carWithFuel.add(car);
            }
        }

        System.out.println(carWithFuel);
     }

     private static List<Car> getCarNames(){
         List<Car> names = new ArrayList<Car>() {{
             add(new Car("Tesla", 0));
             add(new Car("Nissan", 30));
             add(new Car("Exeed", 15));
             add(new Car("Renault", 50));
         }};
         return names;
     }



}

