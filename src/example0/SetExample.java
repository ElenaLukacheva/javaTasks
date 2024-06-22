package example0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        List<String> namesOriginal = new ArrayList<String>(){
            {
               add("Lexus");
               add("Lexus");
               add("Lexus");
               add("Nissan");
               add("Lada");
               add("Niva");
               add("Exeed");
            }};

        Set<String> names = new HashSet<>(namesOriginal);
        System.out.println(names);


        for (String name : names) {
            if (name.equals("Lada"));
            System.out.println("Найден нужный элемент");
            break;
        }
    }
}
