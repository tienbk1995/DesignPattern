package src.FactoryPattern;

import src.FactoryPattern.Pizza.*;

public class Main {
    public static void main(String[] args) {
        PizzaStore NYStore = new NYPizza();
        PizzaStore ChicagoStore = new ChicagoPizza();
        Pizza NYCheese = NYStore.orderPizza("cheese");
        Pizza ChicagoCheese = ChicagoStore.orderPizza("cheese");
        System.out.println("Ether has ordered " + NYCheese.getName());
        System.out.println("Joel has ordered " + ChicagoCheese.getName());
    }
}
