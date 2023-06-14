package com.example.healthylife;

/**
 * FoodRecipe predstavuje jeden recept v aplikácíi.
 * Každý recept pozostáva z ingrediencie, postupu a kalorickéj tabuľky.
 *
 * @property ingredients List potravín, ktoré budeme na recept potrebovať.
 * @property recipe Samotný recept.
 * @property calorieTable Kalorická tabuľka hotového jedla.
 */
public class FoodRecipe {

    private String ingredients;
    private String recipe;
    private String calorieTable;

    public FoodRecipe(String ingredients, String recipe, String calorieTable) {
        this.ingredients = ingredients;
        this.recipe = recipe;
        this.calorieTable = calorieTable;
    }
    /**
     * Vráti List ingrediencíi.
     *
     * @return Ingrediencie.
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     * Vráti Postup pri príprave.
     *
     * @return Postup.
     */
    public String getRecipe() {
        return recipe;
    }

    /**
     * Vráti Kalorickú tabuľku.
     *
     * @return Karolická tabuľka.
     */
    public String getCalorieTable() {
        return calorieTable;
    }
}

