package src.DesignPattern;

public class FlyWithRocket implements FlyBehavior {
    private String name;

    FlyWithRocket(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("My duck can fly with the rocket equipped in the tail: " + name);
    }
}
