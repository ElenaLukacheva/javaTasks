package example0;

public class ParamsMain {
    public static void main(String[] args) {
        UserWithParam<CarWithEnum> hasserCar = new UserWithParam(new CarWithEnum("BMW", TypeCar.SEDAN, "Black", 4));
        System.out.println(hasserCar.getData().getCarName());


        CarWithEnum bmw = new CarWithEnum("BMW", TypeCar.SEDAN, "Black", 4);
        CarWithEnum bmw2 = new CarWithEnum("BMW x55", TypeCar.SEDAN, "Black", 4);
        CarWithEnum bmw3 = new CarWithEnum("BMW x3", TypeCar.HATCHBACK, "Black", 4);
        System.out.println(CarWithEnum.getCounts());
        String.format("%s is good", "ICE");

    }
}
