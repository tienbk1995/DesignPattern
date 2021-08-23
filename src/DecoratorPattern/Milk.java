package src.DecoratorPattern;

import java.util.ArrayList;

public class Milk extends Condiment {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public ArrayList<String> getDescription() {
        ArrayList<String> orderList = new ArrayList<String>();
        orderList = beverage.getDescription();
        orderList.add("Milk");
        return orderList;
    }

    public double cost() {
        return beverage.cost() + 3;
    }
}
