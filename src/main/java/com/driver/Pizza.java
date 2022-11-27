package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private int extraToppings;
    private int extraCheese=80;

    private int basePrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeaway = false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
            price=300;
        else
            price=400;
        basePrice=price;
        // your code goes here
    }

    public int getPrice(){
        return this.basePrice;
    }

    public void addExtraCheese(){
       isExtraCheeseAdded=true;
        price += extraCheese;

    }

    public void addExtraToppings(){
        isExtraToppingsAdded=true;
        if(isVeg==true)
            extraToppings=70;
        else
            extraToppings=120;

        price += extraToppings;
        // your code goes here
    }

    public void addTakeaway(){
      isTakeaway=true;
        price += 20;
    }

    public String getBill(){
        // your code goes here


        bill+="Base Price Of The Pizza: "+basePrice+ "\n";
       if(isExtraCheeseAdded) {
          bill += "Extra Cheese Added: " + extraCheese + "\n";
       }

        if(isExtraToppingsAdded) {
           bill += "Extra Toppings Added: " + extraToppings + "\n";
        }
        if(isTakeaway) {
            bill += "Paperbag Added: 20"  + "\n";

        }
        bill+= "Total Price: "+price;
        return this.bill;//+=price;
    }
}
