package src.tienphan.example;


public class Main {

  public static TaxCalculator getTaxCalculator() {
    return new TaxCalculator2019();
  }

  public static void drawBox(UIControl control) {
    control.draw();
  }
}