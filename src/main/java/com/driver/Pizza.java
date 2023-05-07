package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePrice,cheese,toppings,bag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            price = 300;
            basePrice = 300;
//            bill = "Base Price of The Pizza: 300";
        }
        else {
            price = 400;
            basePrice = 400;
//            bill = "Base Price of The Pizza: 400";
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        price += 80;
        cheese +=1;
//        bill += "\n Extra Cheese Added: 80";
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg) {
            price += 70;
            toppings+=1;
            //bill += "\n Extra Toppings Added: 70";
        }
        else {
            price += 120;
            toppings+=1;
          //  bill += "\n Extra Toppings Added: 120";
        }

    }

    public void addTakeaway(){
        // your code goes here
        price += 20;
        bag+=1;
        //bill+="\n Paperbag Added: 20" ;
    }

    public String getBill(){
        // your code goes here
        bill = "Base Price of The Pizza: "+basePrice+"\nExtra Cheese Added: "+cheese*80+"\nExtra Toppings Added: "+toppings*(isVeg?70:120)+"\nPaperbag Added: "+bag*20;
//        bill+= "\n Total Price: "+price;
        return this.bill;
    }
}
