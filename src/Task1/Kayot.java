package Task1;

import java.util.Random;

public class Kayot extends Dog{
    public void randomAction() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                serch();
                break;
            case 1:
                sleep();
                break;
            case 2:
                swim();
                break;
        }
    }
    @Override
    void serch() {
        System.out.println("Кайот ищет утром");
    }

    public void sleep(){

    }
    public void swim(){

}

}
