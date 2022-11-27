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
    }

    public void addExtraToppings(){
        isExtraToppingsAdded=true;
        if(isVeg==true)
            extraToppings=70;
        else
            extraToppings=120;
        // your code goes here
    }

    public void addTakeaway(){
      isTakeaway=true;

    }

    public String getBill(){
        // your code goes here


        bill+="Base Price Of The Pizza: "+basePrice+ "\n";
       if(isExtraCheeseAdded) {
          bill += "Extra Cheese Added: " + extraCheese + "\n";
           price += extraCheese;
       }

        if(isExtraToppingsAdded) {
           bill += "Extra Toppings Added: " + extraToppings + "\n";
            price += extraToppings;
        }
        if(isTakeaway) {
            bill += "Paperbag Added: 20"  + "\n";
            price += 20;
        }
        bill+= "Total Price: "+price;
        return this.bill;//+=price;
    }
}
