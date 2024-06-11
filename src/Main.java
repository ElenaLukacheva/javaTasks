import example0.Car;

public class Main {
    public static void main(String[] args) {
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
