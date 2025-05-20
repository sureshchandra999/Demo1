package com.suresh3.DesignPatterns.Creational_Patterns.Builder.Example1;

public class Main {
    NutritionFacts nutritionFacts = new NutritionFacts.Builder(240, 8)
            .calories(100)
            .sodium(35)
            .carbohydrate(27)
            .build();
    //System.out.println("NutritionFacts created with required: " + nutritionFacts);
   // System.out.println("NutritionFacts created with servingSize : " + nutritionFacts.servingSize);
}
