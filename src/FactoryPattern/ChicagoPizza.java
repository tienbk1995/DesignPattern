package src.FactoryPattern;

import src.FactoryPattern.Pizza.*;

public class ChicagoPizza extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoPizzaCheese();
        } else
            return null;
    }

}
