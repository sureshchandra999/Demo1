package com.suresh3.DesignPatterns.Creational_Patterns.Builder.Example1;
/*
The Builder pattern is particularly useful when you need to create complex objects with
many optional components or configurations.
Use Case: Creating nutrition facts labels where most fields are optional but validation is required.

 */
public class NutritionFacts {
    private final int servingSize; // (ml) required
    private final int servings; // (per container) required
    private final int calories; // (per serving) optional
    private final int fat; // (g/serving) optional
    private final int sodium; // (mg/serving) optional
    private final int carbohydrate; // (g/serving) optional
    private final int protein; // (g/serving) optional
    private final int fiber; // (g/serving) optional
    private final int sugar; // (g/serving) optional
    private final int vitaminA; // (IU) optional
    private final int vitaminC; // (mg) optional
    private final int calcium; // (mg) optional
    private final int iron; // (mg) optional

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
        this.protein = builder.protein;
        this.fiber = builder.fiber;
        this.sugar = builder.sugar;
        this.vitaminA = builder.vitaminA;
        this.vitaminC = builder.vitaminC;
        this.calcium = builder.calcium;
        this.iron = builder.iron;
    }

    public static class Builder{
        //required parameters
        private final int servingSize;
        private final int servings;

        //optional parameters
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;
        private int protein = 0;
        private int fiber = 0;

        private int sugar = 0;
        private int vitaminA = 0;
        private int vitaminC = 0;
        private int calcium = 0;
        private int iron = 0;
        public Builder(int servingSize, int servings) {
            if(servingSize <= 0 || servings <= 0) {
                throw new IllegalArgumentException("Serving size and servings must be greater than 0");
            }
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories(int val) {
            calories = val;
            return this;
        }
        public Builder fat(int val) {
            fat = val;
            return this;
        }
        public Builder sodium(int val) {
            sodium = val;
            return this;
        }
        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }
        public Builder protein(int val) {
            protein = val;
            return this;
        }
        public Builder fiber(int val) {
            fiber = val;
            return this;
        }
        public Builder sugar(int val) {
            sugar = val;
            return this;
        }
        public Builder vitaminA(int val) {
            vitaminA = val;
            return this;
        }
        public Builder vitaminC(int val) {
            vitaminC = val;
            return this;
        }
        public Builder calcium(int val) {
            calcium = val;
            return this;
        }
        public Builder iron(int val) {
            iron = val;
            return this;
        }
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }


    }


}
