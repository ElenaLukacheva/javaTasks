package example0;

public class Panter extends  CatFamily implements FlyAbility{
    public void swimAnderWater(){

    }
    @Override
    public void fly(){
        System.out.println("Пантера летает на самолете");

    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public void say() {
        System.out.println("Пантера тихо мурлыкает");
    }
}
