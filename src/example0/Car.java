package example0;

public class Car {
    private String model;
    private Integer fuel;

    public Car(String model, Integer fuel) {
        this.model = model;
        this.fuel = fuel;
        System.out.println("Создали машину " + model);
    }

    public Car() {
    }

    public Integer getFuel() {
        return fuel;
    }
    public void goToRoad(){
        if (fuel > 20){
            System.out.println("Maшина поехала на трассу");
        }else {
            System.out.println("Недостаточно бензина");
        }
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public void beep(){
        System.out.println("Машина посигналила");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
