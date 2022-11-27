package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());

    DeluxePizza dp1 = new DeluxePizza(true);
    //System.out.println(dp.getPrice());
    dp1.addTakeaway();
    dp1.addExtraCheese();
    dp1.addTakeaway();
    System.out.println(dp1.getBill());

  }
}