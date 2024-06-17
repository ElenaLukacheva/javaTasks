package example0;

public class Lion extends CatFamily implements FlyAbility {

    public void loudSay(){

    }
    public void superRun(){

    }
    public void beKing(){

    }

    @Override
    public void say() {
        System.out.println("Лев громко рычит");
    }
    @Override
    public void hunt(){
        System.out.println("Лев охотится");
    }

    @Override
    public void fly() {
        System.out.println("У льва появилась возможность летать");
    }

    @Override
    public String name() {
        return "Полет на крыльях";
    }
}
