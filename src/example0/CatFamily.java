package example0;

public abstract class CatFamily {
    public void hunt(){
        System.out.println("Охота началась");
    }

    public abstract void say();
    public final void sleep(){
        System.out.println("Кошка спит");
    }

}
