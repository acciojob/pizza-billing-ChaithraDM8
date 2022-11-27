package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
            price=300;
        else
            price=400;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        price+=80;
        // your code goes here
    }

    public void addExtraToppings(){
        if(isVeg==true)
            price+=70;
        else
            price+=120;
        // your code goes here
    }

    public void addTakeaway(){
        price+=20;

    }

    public String getBill(){
        // your code goes here
       bill+=price;
        return this.bill;
    }
}
