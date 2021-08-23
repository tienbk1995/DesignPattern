package src.DecoratorPattern;

import java.util.ArrayList;

import java.util.HashMap;

public class Main {

    public static HashMap<String, Integer> getResult(ArrayList<String> orderList) {
        HashMap<String, Integer> mySumOrderList = new HashMap<String, Integer>();
        for (String element : orderList) {
            if (mySumOrderList.containsKey(element)) {
                mySumOrderList.put(element, mySumOrderList.get(element) + 1);
            } else {
                mySumOrderList.put(element, 1);
            }
        }
        return mySumOrderList;
    }

    public static void main(String[] args) {
        Beverage bevarage = new Expresso();
        bevarage = new Mocha(bevarage);
        bevarage = new Mocha(bevarage);
        bevarage = new Milk(bevarage);

        System.out.println(
                "Your order is " + getResult(bevarage.getDescription()) + " and the price costs $" + bevarage.cost());
    }
}
