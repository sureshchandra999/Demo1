package com.suresh3.DesignPatterns.Creational_Patterns.Builder.Example2;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String dough;
    private final String sauce;
    private final String cheese;
    private final List<String> toppings;

   private Pizza(Builder builder) {
       this.dough = builder.dough;
       this.sauce = builder.sauce;
       this.cheese = builder.cheese;
       this.toppings = builder.toppings;

   }
    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", toppings=" + toppings +
                '}';
    }


   public static class Builder{
       private String dough;
       private String sauce;
       private String cheese;
       private List<String> toppings = new ArrayList<>();

       public Builder dough(String dough) {
           this.dough = dough;
           return this;
       }
       public Builder sauce(String sauce) {
           this.sauce = sauce;
           return this;
       }
         public Builder cheese(String cheese) {
              this.cheese = cheese;
              return this;
         }
         public Builder addTopping(String topping) {
              this.toppings.add(topping);
              return this;
         }
         public Pizza build(){
           //Business rule: Dough is required value
           if(dough == null){
               throw new IllegalArgumentException("Dough is required");
           }
           //Business rule: Can not have pineapple with seafood
             if(toppings.contains("pineapple") && (toppings.contains("seafood") || toppings.contains("fish") || toppings.contains("crab") || toppings.contains("shrimp"))){
                 throw new IllegalArgumentException("Can not have pineapple with seafood");
             }
             return new Pizza(this);

         }





   }

}
