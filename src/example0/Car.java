package example0;

import java.util.Objects;

public class Car {
    private String model;
    private Integer fuel;
    private Double speed;

    public Car(String model, Integer fuel) {
        this.model = model;
        this.fuel = fuel;
        System.out.println("Создали машину " + model);
        speed = 60.5;
    }

    public Car() {
    }

    public Integer getFuel() {
        return fuel;
    }
    public void goToRoad(){
        if (fuel > 20){
            System.out.println("Maшина поехала на трассу, остаток бензина " + fuel);
            fuel = fuel - 15;
        } else {
            System.out.println("Недостаточно бензина");
            addFuelToCar();
            System.out.println("Машина заправлена, " + fuel + " Литров");
        }
    }

    private void addFuelToCar(){
        fuel = fuel + 20;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public void beep(){
        System.out.println("Машина посигналила");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(fuel, car.fuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, fuel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", fuel=" + fuel +
                '}';
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
