package src.DesignPatternStrategy;

public class FlyNoWay implements FlyBehavior {
    private String name;

    FlyNoWay(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("My duck can't fly: " + name);
    }
}
