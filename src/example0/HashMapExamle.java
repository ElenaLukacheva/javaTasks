package example0;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamle {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Loki", 15);
        people.put("Bob", 25);
        people.put("Oleg", 45);
        //people.put(null, 60);
        System.out.println(people.get("Oleg"));
        for (Map.Entry<String, Integer> stringIntegerEntry : people.entrySet()) {
            if (stringIntegerEntry.getKey().equals("Bob")) {
                System.out.println("Найден");
                break;
            }
        }
        //people.replace(null, 11);
        System.out.println(people);
    }
}
