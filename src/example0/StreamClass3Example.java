package example0;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamClass3Example {
    public static void main(String[] args) {
        Map<String, Integer> coins = new HashMap<String, Integer>(){{
            put("GPB", 200);
            put("USD", 80);
            put("RUB", 100);
            put("AED", 131);
        }};
        System.out.println(coins);

        Map<String, Integer> reverse = coins.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (first, second) -> first, LinkedHashMap::new));
        System.out.println(reverse);
    }
}
