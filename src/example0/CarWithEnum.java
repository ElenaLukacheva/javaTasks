package example0;

public class CarWithEnum {

    public static Integer counts = 0;

    private String carName;
    private TypeCar type;
    private String color;

    private Integer doorCount;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public TypeCar getType() {
        return type;
    }

    public void setType(TypeCar type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(Integer doorCount) {
        this.doorCount = doorCount;
    }

    public CarWithEnum(String carName, TypeCar type, String color, Integer doorCount) {
        this.carName = carName;
        this.type = type;
        this.color = color;
        this.doorCount = doorCount;
        counts++;
    }

    public static Integer getCounts() {
        return counts;
    }

    public static void setCounts(Integer counts) {
        CarWithEnum.counts = counts;
    }

    @Override
    public String toString() {
        return "CarWithEnum{" +
                "carName='" + carName + '\'' +
                ", type=" + type +
                ", color='" + color + '\'' +
                ", doorCount=" + doorCount +
                '}';
    }
}
