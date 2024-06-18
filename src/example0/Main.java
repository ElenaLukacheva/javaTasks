package example0;

import example0.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Stas";
        names[1] = "Jhon";
        names[2] = "Alex";
        System.out.println(names[0]);
        System.out.println(Arrays.asList(names));

        String[] names1 = new String[]{"Oleg", "Stas", "Bob"};

        Car[] cars = new Car[3];
        cars[0] = new Car("Tesla", 60);
        cars[1] = new Car("Reno", 100);
        cars[2] = new Car("Honda", 20);
        System.out.println(Arrays.asList(cars));

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            Car tempCar = cars[i];
            if (tempCar.getModel().equals("Honda")){
                System.out.println("Машина найдена");
                break;
            }
            System.out.println(tempCar);
        }
        System.out.println(Arrays.asList(cars));

        for (int i = cars.length - 1; i >= 0; i--) {
            Car tempCar = cars[i];
           if (tempCar.getModel() == "Tesla"){
               tempCar.setFuel(0);
           }
           }
        System.out.println(Arrays.toString(cars));


        System.out.println("------------------");

        Lion lion = new Lion();
        lion.say();
        lion.hunt();
        lion.fly();
        System.out.println(lion.name());

        Panter panter = new Panter();
        panter.hunt();
        panter.say();
        panter.fly();
        System.out.println("-----------------");


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
