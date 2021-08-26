package src.FactoryPattern;

import src.FactoryPattern.Pizza.*;

public class NYPizza extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYPizzaCheese();
        } else
            return null;
    }

}
