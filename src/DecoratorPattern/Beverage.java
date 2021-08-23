package src.DecoratorPattern;

import java.util.ArrayList;

public abstract class Beverage {
    ArrayList<String> orderList = new ArrayList<String>();

    String description = "Unknown Beverage";

    public ArrayList<String> getDescription() {
        orderList.add(description);
        return orderList;
    }

    public abstract double cost();
}
