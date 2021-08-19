package src.DesignPattern;

public class RedHeadDuck extends Duck {
    private String name;

    RedHeadDuck(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("My duck is: " + name);
    }
}
