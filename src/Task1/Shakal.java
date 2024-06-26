package Task1;

import java.util.Random;

public class Shakal extends Dog{
    public void randomAction() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                serch();
                break;
            case 1:
                hunt();
                break;
            case 2:
                gavgav();
                break;
        }
    }
    @Override
    void serch() {
        System.out.println("Шакал ищет днем");
    }
    public void hunt(){

    }

    public void gavgav(){

    }
}
