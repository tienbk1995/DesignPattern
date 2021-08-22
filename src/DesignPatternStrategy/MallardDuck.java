package src.DesignPatternStrategy;

public class MallardDuck extends Duck {
    private String name;

    MallardDuck(String name) {
        this.name = name;
        flyAction = new FlyWithWings(name);
    }

    public void display() {
        System.out.println("My duck is: " + name);
    }

}