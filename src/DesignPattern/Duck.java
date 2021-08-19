package src.DesignPattern;

public class Duck {

    FlyBehavior flyAction;

    public void swim() {
        System.out.println("Swim super class");
    }

    public void display() {
        System.out.println("Display super class");
    }

    public void performFly() {
        flyAction.fly();
    }

    public void setFlyAction(FlyBehavior flyAction) {
        this.flyAction = flyAction;
    }

    public FlyBehavior getFlyAction() {
        return flyAction;
    }
}
