package Task1;

import java.util.*;

public class DogsTask {
    private static Random random = new Random();
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            dogs.add(getRandomdog());
           // System.out.println(dogs);
        }
        for (int i = 0; i < 365; i++) {
            int randomIndex = random.nextInt(dogs.size());
            Dog tempDog = dogs.get(randomIndex);
            tempDog.randomAction();

            if (i % 30 == 0){
                dogs.add(getRandomdog());
                System.out.println("Новая собака");
            }
        }
        System.out.println(dogs.size());

        Map<String, Integer> animals = new HashMap<>();
        for (Dog dog : dogs) {
            String className = dog.getClass().getSimpleName();
            if (animals.containsKey(className)) {
                int countName = animals.get(className);
                animals.put(className, countName + 1);
            } else animals.put(className, 1);
            }
            for (String className : animals.keySet()){
                int count = animals.get(className);
                System.out.println(className + ": " + count);
        }

    }


    public static Dog getRandomdog() {
        Dog tempDog = null;
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                tempDog = new Kayot();
                break;
            case 1:
                tempDog = new Shakal();
                break;
            case 2:
                tempDog = new Wolf();
                break;
        }
        return tempDog;
    }
}
