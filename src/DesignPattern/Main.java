package src.DesignPattern;

public class Main {
    public static void main(String[] args) {
        Duck Donald = new MallardDuck("Donald");
        Donald.performFly();
        Donald.setFlyAction(new FlyWithRocket("Donald"));
        Donald.performFly();
    }
}
