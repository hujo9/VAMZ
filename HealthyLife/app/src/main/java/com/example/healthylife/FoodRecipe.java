package com.example.healthylife;

/* FoodRecipe je jednoduchá trieda charakterizujúca jeden recept v aplikácii. Recept pozostáva z ingrediencii, postupu a kalorickej tabuľky.*/
public class FoodRecipe {

    private String ingredients;
    private String recipe;
    private String calorieTable;

    public FoodRecipe(String ingredients, String recipe, String calorieTable) {
        this.ingredients = ingredients;
        this.recipe = recipe;
        this.calorieTable = calorieTable;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public String getCalorieTable() {
        return calorieTable;
    }
}

