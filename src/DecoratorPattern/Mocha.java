package src.DecoratorPattern;

import java.util.ArrayList;

public class Mocha extends Condiment {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public ArrayList<String> getDescription() {
        ArrayList<String> orderList = new ArrayList<String>();
        orderList = beverage.getDescription();
        orderList.add("Mocha");
        return orderList;
    }

    public double cost() {
        return 1 + beverage.cost();
    }
}
