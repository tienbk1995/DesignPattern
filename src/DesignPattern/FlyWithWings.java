package src.DesignPattern;

public class FlyWithWings implements FlyBehavior {
    private String name;

    FlyWithWings(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("My duck flying: " + name);
    }

}
