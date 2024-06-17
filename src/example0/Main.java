package example0;

import example0.Car;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.say();
        lion.hunt();
        lion.fly();
        System.out.println(lion.name());

        Panter panter = new Panter();
        panter.hunt();
        panter.say();
        panter.fly();
        System.out.println("------------------");


        Car nissan = new Car("Nissan Qashqa", 30);
        nissan.goToRoad();
        nissan.goToRoad();
        nissan.goToRoad();
        nissan.goToRoad();
        System.out.println("---------------");

        Car nissan1 = new Car("Nissan", 40);
        Car nissan2 = new Car("Nissan", 40);
        Car bmw = new Car("BMW", 80);
        boolean isSame = nissan1.equals(nissan2);

        boolean isModelSame = nissan1.getModel().equals(nissan2.getModel());
        boolean isFuelSame = nissan1.getFuel().equals(nissan2.getFuel());
        System.out.println(isModelSame);
        System.out.println(isFuelSame);
        System.out.println(nissan1);
        System.out.println(nissan2);
        System.out.println(bmw);
        System.out.println(isSame);

        System.out.println("---------------");
        Car car = new Car();
        car.beep();
        car.setModel("Nissan");
        car.setFuel(100);
        car.goToRoad();
        System.out.println(car.getModel());

        Car car2 = new Car();
        car2.setModel("BMW");
        car2.setFuel(20);
        car2.goToRoad();
        System.out.println("BMW");

        Car mers = new Car("Mersedez Benz", 100);
        System.out.println(mers.getModel());
        mers.goToRoad();


    }
}
