package Task1;

import java.util.Random;

public class Wolf extends Dog{

    public void randomAction() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                serch();
                break;
            case 1:
                eat();
                break;
            case 2:
                multiply();
                break;
        }
    }

    @Override
    void serch() {
        System.out.println("Волк ищет днем");
    }
    public void eat(){
        System.out.println("Волк кушает");

    }

    public void multiply(){
        System.out.println("Волк нашел волчицу");

    }
}
