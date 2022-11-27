package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private int extraToppings;
    private int extraCheese=80;
    private int paperBag=20;

    boolean visitedExtraCheese =false;
    boolean visitedExtraToppings =false;
    boolean visitedExtraBag =false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
            price=300;
        else
            price=400;

        bill+="Base Price Of The Pizza: "+price+ "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        if (!visitedExtraCheese) {
            visitedExtraCheese = true;
            price += extraCheese;
            bill += "Extra Cheese Added: "+ extraCheese + "\n";
        }
    }

    public void addExtraToppings() {
        if (!visitedExtraToppings) {
            visitedExtraToppings = true;
            if (isVeg == true)
                extraToppings = 70;
            else
                extraToppings = 120;

            price += extraToppings;
            bill += "Extra Toppings Added: "+ extraToppings + "\n";

        }
    }
    public void addTakeaway(){
       if(!visitedExtraBag) {
           visitedExtraBag=true;
           price+=paperBag;
           bill += "Paperbag Added: "+ paperBag+"\n";
       }
    }

    public String getBill(){
       bill+= "Total Price: "+price +"\n";
        return this.bill;
    }
}
