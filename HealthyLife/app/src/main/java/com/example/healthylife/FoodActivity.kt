package com.example.healthylife

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/** FoodActivity obsahuje prístup na všetky recepty v aplikácii
 * Pracuje so 6 layoutami, ktoré všetky obsahujú 10 tlačidiel.
 * FoodActivity taktiež obsahuje object RecipeBook, ktorý obsahuje všetky recepty.
 */

class FoodActivity : AppCompatActivity() {

    private lateinit var food1Button: Button
    private lateinit var food2Button: Button
    private lateinit var food3Button: Button
    private lateinit var food4Button: Button
    private lateinit var food5Button: Button
    private lateinit var food6Button: Button
    private lateinit var food7Button: Button
    private lateinit var food8Button: Button
    private lateinit var food9Button: Button
    private lateinit var food10Button: Button
    private lateinit var curIngredients: TextView
    private lateinit var curRecipe: TextView
    private lateinit var curCaloryTable: TextView
    private lateinit var curPicture: ImageView

    /**
     * Pri vytvorení sa prevezme foodType z intentu a na základe hodnoty zmení layout na požadovaný.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val foodType = intent.getStringExtra("foodType")
        when (foodType) {
            "breakfast" -> setContentView(R.layout.breakfast)
            "mainDishes" -> setContentView(R.layout.main_dishes)
            "soups" -> setContentView(R.layout.soups)
            "salads" -> setContentView(R.layout.salads)
            "desserts" -> setContentView(R.layout.desserts)
            "snacks" -> setContentView(R.layout.snacks)
            else -> {
            }
        }
        /*
        Pridelenie id z layoutu atributom
        */
        food1Button = findViewById(R.id.food1Button)
        food2Button = findViewById(R.id.food2Button)
        food3Button = findViewById(R.id.food3Button)
        food4Button = findViewById(R.id.food4Button)
        food5Button = findViewById(R.id.food5Button)
        food6Button = findViewById(R.id.food6Button)
        food7Button = findViewById(R.id.food7Button)
        food8Button = findViewById(R.id.food8Button)
        food9Button = findViewById(R.id.food9Button)
        food10Button = findViewById(R.id.food10Button)


        /*
        Tlačídla pre vyberanie konkrétneho jedla od 1 po 10. Z konkrétneho jedla sa prevezmú parametre, ktoré a aktualizuje sa layout.
        Parametre sú následne vypísané na nový layout.
        */
        food1Button.setOnClickListener {
            setContentView(R.layout.food)
            curIngredients = findViewById(R.id.ingredients)
            curRecipe = findViewById(R.id.curRecipe)
            curCaloryTable = findViewById(R.id.curCalory)
            curPicture = findViewById(R.id.curPicture)
            if(foodType == "breakfast") {
                val recipe = RecipeBook.recipeBr1
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.br1)
            }
            if(foodType == "mainDishes") {
                val recipe = RecipeBook.recipeMd1
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.md1)
            }
            if(foodType == "soups") {
                val recipe = RecipeBook.recipeSp1
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sp1)
            }
            if(foodType == "salads") {
                val recipe = RecipeBook.recipeSl1
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sl1)
            }
            if(foodType == "desserts") {
                val recipe = RecipeBook.recipeDe1
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.de1)
            }
            if(foodType == "snacks") {
                val recipe = RecipeBook.recipeSn1
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sn1)
            }
            else{}
        }

        food2Button.setOnClickListener {
            setContentView(R.layout.food)
            curIngredients = findViewById(R.id.ingredients)
            curRecipe = findViewById(R.id.curRecipe)
            curCaloryTable = findViewById(R.id.curCalory)
            curPicture = findViewById(R.id.curPicture)
            if(foodType == "breakfast") {
                val recipe = RecipeBook.recipeBr2
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.br2)
            }
            if(foodType == "mainDishes") {
                val recipe = RecipeBook.recipeMd2
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.md2)
            }
            if(foodType == "soups") {
                val recipe = RecipeBook.recipeSp2
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sp2)
            }
            if(foodType == "salads") {
                val recipe = RecipeBook.recipeSl2
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sl2)
            }
            if(foodType == "desserts") {
                val recipe = RecipeBook.recipeDe2
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.de2)
            }
            if(foodType == "snacks") {
                val recipe = RecipeBook.recipeSn2
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sn2)
            }
            else{}
        }

        food3Button.setOnClickListener {
            setContentView(R.layout.food)
            curIngredients = findViewById(R.id.ingredients)
            curRecipe = findViewById(R.id.curRecipe)
            curCaloryTable = findViewById(R.id.curCalory)
            curPicture = findViewById(R.id.curPicture)
            if(foodType == "breakfast") {
                val recipe = RecipeBook.recipeBr3
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.br3)
            }
            if(foodType == "mainDishes") {
                val recipe = RecipeBook.recipeMd3
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.md3)
            }
            if(foodType == "soups") {
                val recipe = RecipeBook.recipeSp3
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sp3)
            }
            if(foodType == "salads") {
                val recipe = RecipeBook.recipeSl3
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sl3)
            }
            if(foodType == "desserts") {
                val recipe = RecipeBook.recipeDe3
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.de3)
            }
            if(foodType == "snacks") {
                val recipe = RecipeBook.recipeSn3
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sn3)
            }
            else{}
        }

        food4Button.setOnClickListener {
            setContentView(R.layout.food)
            curIngredients = findViewById(R.id.ingredients)
            curRecipe = findViewById(R.id.curRecipe)
            curCaloryTable = findViewById(R.id.curCalory)
            curPicture = findViewById(R.id.curPicture)
            if(foodType == "breakfast") {
                val recipe = RecipeBook.recipeBr4
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.br4)
            }
            if(foodType == "mainDishes") {
                val recipe = RecipeBook.recipeMd4
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.md4)
            }
            if(foodType == "soups") {
                val recipe = RecipeBook.recipeSp4
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sp4)
            }
            if(foodType == "salads") {
                val recipe = RecipeBook.recipeSl4
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sl4)
            }
            if(foodType == "desserts") {
                val recipe = RecipeBook.recipeDe4
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.de4)
            }
            if(foodType == "snacks") {
                val recipe = RecipeBook.recipeSn4
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sn4)
            }
            else{}
        }

        food5Button.setOnClickListener {
            setContentView(R.layout.food)
            curIngredients = findViewById(R.id.ingredients)
            curRecipe = findViewById(R.id.curRecipe)
            curCaloryTable = findViewById(R.id.curCalory)
            curPicture = findViewById(R.id.curPicture)
            if(foodType == "breakfast") {
                val recipe = RecipeBook.recipeBr5
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.br5)
            }
            if(foodType == "mainDishes") {
                val recipe = RecipeBook.recipeMd5
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.md5)
            }
            if(foodType == "soups") {
                val recipe = RecipeBook.recipeSp5
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sp5)
            }
            if(foodType == "salads") {
                val recipe = RecipeBook.recipeSl5
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sl5)
            }
            if(foodType == "desserts") {
                val recipe = RecipeBook.recipeDe5
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.de5)
            }
            if(foodType == "snacks") {
                val recipe = RecipeBook.recipeSn5
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sn5)
            }
            else{}
        }

        food6Button.setOnClickListener {
            setContentView(R.layout.food)
            curIngredients = findViewById(R.id.ingredients)
            curRecipe = findViewById(R.id.curRecipe)
            curCaloryTable = findViewById(R.id.curCalory)
            curPicture = findViewById(R.id.curPicture)
            if(foodType == "breakfast") {
                val recipe = RecipeBook.recipeBr6
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.br6)
            }
            if(foodType == "mainDishes") {
                val recipe = RecipeBook.recipeMd6
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.md6)
            }
            if(foodType == "soups") {
                val recipe = RecipeBook.recipeSp6
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sp6)
            }
            if(foodType == "salads") {
                val recipe = RecipeBook.recipeSl6
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sl6)
            }
            if(foodType == "desserts") {
                val recipe = RecipeBook.recipeDe6
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.de6)
            }
            if(foodType == "snacks") {
                val recipe = RecipeBook.recipeSn6
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sn6)
            }
            else{}
        }

        food7Button.setOnClickListener {
            setContentView(R.layout.food)
            curIngredients = findViewById(R.id.ingredients)
            curRecipe = findViewById(R.id.curRecipe)
            curCaloryTable = findViewById(R.id.curCalory)
            curPicture = findViewById(R.id.curPicture)
            if(foodType == "breakfast") {
                val recipe = RecipeBook.recipeBr7
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.br7)
            }
            if(foodType == "mainDishes") {
                val recipe = RecipeBook.recipeMd7
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.md7)
            }
            if(foodType == "soups") {
                val recipe = RecipeBook.recipeSp7
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sp7)
            }
            if(foodType == "salads") {
                val recipe = RecipeBook.recipeSl7
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sl7)
            }
            if(foodType == "desserts") {
                val recipe = RecipeBook.recipeDe7
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.de7)
            }
            if(foodType == "snacks") {
                val recipe = RecipeBook.recipeSn7
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sn7)
            }
            else{}
        }

        food8Button.setOnClickListener {
            setContentView(R.layout.food)
            curIngredients = findViewById(R.id.ingredients)
            curRecipe = findViewById(R.id.curRecipe)
            curCaloryTable = findViewById(R.id.curCalory)
            curPicture = findViewById(R.id.curPicture)
            if(foodType == "breakfast") {
                val recipe = RecipeBook.recipeBr8
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.br8)
            }
            if(foodType == "mainDishes") {
                val recipe = RecipeBook.recipeMd8
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.md8)
            }
            if(foodType == "soups") {
                val recipe = RecipeBook.recipeSp8
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sp8)
            }
            if(foodType == "salads") {
                val recipe = RecipeBook.recipeSl8
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sl8)
            }
            if(foodType == "desserts") {
                val recipe = RecipeBook.recipeDe8
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.de8)
            }
            if(foodType == "snacks") {
                val recipe = RecipeBook.recipeSn8
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sn8)
            }
            else{}
        }

        food9Button.setOnClickListener {
            setContentView(R.layout.food)
            curIngredients = findViewById(R.id.ingredients)
            curRecipe = findViewById(R.id.curRecipe)
            curCaloryTable = findViewById(R.id.curCalory)
            curPicture = findViewById(R.id.curPicture)
            if(foodType == "breakfast") {
                val recipe = RecipeBook.recipeBr9
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.br9)
            }
            if(foodType == "mainDishes") {
                val recipe = RecipeBook.recipeMd9
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.md9)
            }
            if(foodType == "soups") {
                val recipe = RecipeBook.recipeSp9
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sp9)
            }
            if(foodType == "salads") {
                val recipe = RecipeBook.recipeSl9
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sl9)
            }
            if(foodType == "desserts") {
                val recipe = RecipeBook.recipeDe9
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.de9)
            }
            if(foodType == "snacks") {
                val recipe = RecipeBook.recipeSn9
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sn9)
            }
            else{}
        }

        food10Button.setOnClickListener {
            setContentView(R.layout.food)
            curIngredients = findViewById(R.id.ingredients)
            curRecipe = findViewById(R.id.curRecipe)
            curCaloryTable = findViewById(R.id.curCalory)
            curPicture = findViewById(R.id.curPicture)
            if(foodType == "breakfast") {
                val recipe = RecipeBook.recipeBr10
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.br10)
            }
            if(foodType == "mainDishes") {
                val recipe = RecipeBook.recipeMd10
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.md10)
            }
            if(foodType == "soups") {
                val recipe = RecipeBook.recipeSp10
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sp10)
            }
            if(foodType == "salads") {
                val recipe = RecipeBook.recipeSl10
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sl10)
            }
            if(foodType == "desserts") {
                val recipe = RecipeBook.recipeDe10
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.de10)
            }
            if(foodType == "snacks") {
                val recipe = RecipeBook.recipeSn10
                curIngredients.text = recipe.getIngredients()
                curRecipe.text = recipe.getRecipe()
                curCaloryTable.text = recipe.getCalorieTable()
                curPicture.setImageResource(R.drawable.sn10)
            }
            else{}
        }
    }

    /*
    Object RecipeBook obsahuje všetky dostupné recepty, ktoré obsahuje aplikácia
    */
    object RecipeBook {

        var recipeBr1 = FoodRecipe(
            "8 large eggs\n" +
                    "\n" +
                    "¼ teaspoon ground pepper\n" +
                    "\n" +
                    "¼ teaspoon salt\n" +
                    "\n" +
                    "1 teaspoon extra-virgin olive oil\n" +
                    "\n" +
                    "4 cups baby spinach (half of a 5-oz. bag), chopped\n" +
                    "\n" +
                    "¼ cup crumbled feta",
            ("Preheat oven to 400°F.\n" +
                    "\n" +
                    "Whisk eggs, pepper and salt in a large bowl.\n" +
                    "\n" +
                    "Heat oil in a medium ovenproof nonstick skillet over medium heat. Add spinach; cook, stirring occasionally, until wilted, about 3 minutes. Add the egg mixture and sprinkle with feta. Transfer the pan to the oven.\n" +
                    "\n" +
                    "Bake until the frittata is set, about 10 minutes"), (
                    "192" +
                    " Calories\n" +
                    "13g" +
                    " Fat\n" +
                    "3g" +
                    " Carbs\n" +
                    "15g" +
                    " Protein")
        )

        var recipeBr2 = FoodRecipe(
            "4 cups frozen shredded hash brown potatoes\n" +
                    "\n" +
                    "2 cups finely chopped baby spinach\n" +
                    "\n" +
                    "½ cup finely chopped onion\n" +
                    "\n" +
                    "1 tablespoon minced fresh ginger\n" +
                    "\n" +
                    "1 tablespoon curry powder\n" +
                    "\n" +
                    "½ teaspoon salt\n" +
                    "\n" +
                    "¼ cup extra-virgin olive oil\n" +
                    "\n" +
                    "1 15-ounce can chickpeas, rinsed\n" +
                    "\n" +
                    "1 cup chopped zucchini\n" +
                    "\n" +
                    "4 large eggs",
            ("Combine potatoes, spinach, onion, ginger, curry powder and salt in a large bowl.\n" +
                    "\n" +
                    "Heat oil in a large nonstick skillet over medium-high heat. Add the potato mixture and press into a layer. Cook, without stirring, until crispy and golden brown on the bottom, 3 to 5 minutes.\n" +
                    "\n" +
                    "Reduce heat to medium-low. Fold in chickpeas and zucchini, breaking up chunks of potato, until just combined. Press back into an even layer. Carve out 4 \"wells\" in the mixture. Break eggs, one at a time, into a cup and slip one into each indentation. Cover and continue cooking until the eggs are set, 4 to 5 minutes for soft-set yolks."), (
                    "382" +
                    " Calories\n" +
                    "20g" +
                    " Fat\n" +
                    "37g" +
                    " Carbs\n" +
                    "14g" +
                    " Protein")
        )

        var recipeBr3 = FoodRecipe(
            "¼ cup whole-milk ricotta cheese\n" +
                    "\n" +
                    "2 teaspoons pure maple syrup\n" +
                    "\n" +
                    "½ teaspoon lemon zest plus 1/4 teaspoon, divided\n" +
                    "\n" +
                    "2 slices whole-grain bread, toasted\n" +
                    "\n" +
                    "½ cup fresh berries, such as blueberries, strawberries and/or blackberries",
            ("Mix ricotta, maple syrup and 1/2 teaspoon lemon zest in a small bowl. Spread onto 1 side of each toast slice. Top each toast with 1/4 cup berries and sprinkle with 1/8 teaspoon lemon zest."), (
                    "162" +
                    " Calories\n" +
                    "5g" +
                    " Fat\n" +
                    "22g" +
                    " Carbs\n" +
                    "7g" +
                    " Protein")
        )

        var recipeBr4 = FoodRecipe(
            "2 overripe bananas\n" +
                    "\n" +
                    "2 large eggs\n" +
                    "\n" +
                    "1 cup water\n" +
                    "\n" +
                    "1 teaspoon cinnamon\n" +
                    "\n" +
                    "2 cups high-protein buttermilk pancake and waffle mix",
            ("Preheat oven to 425°F. Coat a 13-by 9-inch baking pan or baking sheet with cooking spray, then line with parchment paper and coat again.\n" +
                    "\n" +
                    "Mash bananas in a large bowl. Whisk in eggs, water and cinnamon. Use a wooden spoon to fold in pancake mix; stir until just combined.\n" +
                    "\n" +
                    "Spread the batter in an even layer in the prepared pan. Bake until a toothpick inserted in the center comes out clean, 12 to 14 minutes. Let cool in the pan for 3 minutes, then cut into 12 squares."), (
                    "270" +
                    " Calories\n" +
                    "5g" +
                    " Fat\n" +
                    "52g" +
                    " Carbs\n" +
                    "17g" +
                    " Protein\n")
        )

        var recipeBr5 = FoodRecipe(
            "8 large eggs\n" +
                    "\n" +
                    "¼ teaspoon kosher salt",
            ("Prepare a sous vide water bath in a 6- to 8-quart stockpot. Heat water to 167°F. When the water is ready, use a slotted spoon to lower eggs into the pot. Cover the pot as much as possible with plastic wrap or a baking sheet. Cook for 15 minutes for a jammy yolk consistency.\n" +
                    "\n" +
                    "Peel the eggs and place 2 in each of 4 serving bowls; sprinkle evenly with salt."), (
                    "143" +
                    " Calories\n" +
                    "10g" +
                    " Fat\n" +
                    "1g" +
                    " Carbs\n" +
                    "13g" +
                    " Protein\n")
        )

        var recipeBr6 = FoodRecipe(
            "½ cup all-purpose flour\n" +
                    "\n" +
                    "½ cup whole-wheat flour\n" +
                    "\n" +
                    "¾ teaspoon baking soda\n" +
                    "\n" +
                    "½ teaspoon ground cinnamon\n" +
                    "\n" +
                    "¼ teaspoon salt\n" +
                    "\n" +
                    "2 large eggs, at room temperature\n" +
                    "\n" +
                    "2 tablespoons pure maple syrup\n" +
                    "\n" +
                    "5 tablespoons smooth natural peanut butter, divided\n" +
                    "\n" +
                    "¾ cup whole milk\n" +
                    "\n" +
                    "¼ cup unsalted roasted peanuts, chopped",
            ("Whisk all-purpose flour, whole-wheat flour, baking soda, cinnamon and salt together in a small bowl; set aside.\n" +
                    "\n" +
                    "Whisk eggs, maple syrup and 3 tablespoons peanut butter together in a medium bowl. Gradually add milk, whisking constantly until incorporated.\n" +
                    "\n" +
                    "Gently whisk the dry ingredients into the wet ingredients until just combined.\n" +
                    "\n" +
                    "Lightly coat a large nonstick skillet with cooking spray; heat over medium heat. Working in batches, use a ¼-cup scoop to add batter to the pan; cook until bubbles start to appear and edges look dry, 2 to 3 minutes. Flip and cook until golden brown, cooked through and firm to the touch in the center, 1 to 2 minutes. Repeat with the remaining batter, coating the pan with cooking spray between batches.\n" +
                    "\n" +
                    "Spread the remaining 2 tablespoons peanut butter on the pancakes and sprinkle with peanuts."), (
                    "383" +
                    " Calories\n" +
                    "19g" +
                    " Fat\n" +
                    "38g" +
                    " Carbs\n" +
                    "15g" +
                    " Protein\n")
        )

        var recipeBr7 = FoodRecipe(
            "1 cup mixed salad greens\n" +
                    "\n" +
                    "1 teaspoon red-wine vinegar\n" +
                    "\n" +
                    "1 teaspoon extra-virgin olive oil\n" +
                    "\n" +
                    "Pinch of salt\n" +
                    "\n" +
                    "Pinch of pepper\n" +
                    "\n" +
                    "2 slices sprouted whole-wheat bread, toasted\n" +
                    "\n" +
                    "¼ cup plain hummus\n" +
                    "\n" +
                    "¼ cup alfalfa sprouts\n" +
                    "\n" +
                    "¼ avocado, sliced\n" +
                    "\n" +
                    "2 teaspoons unsalted sunflower seeds",
            ("Toss greens with vinegar, oil, salt and pepper in a medium bowl. Spread each slice of toast with 2 tablespoons hummus. Top with sprouts, avocado and the greens and sprinkle with sunflower seeds."), (
                    "429" +
                    " Calories\n" +
                    "22g" +
                    " Fat\n" +
                    "46g" +
                    " Carbs\n" +
                    "16g" +
                    " Protein")
        )

        var recipeBr8 = FoodRecipe(
            "¼ avocado\n" +
                    "\n" +
                    "¼ teaspoon ground pepper\n" +
                    "\n" +
                    "⅛ teaspoon garlic powder\n" +
                    "\n" +
                    "1 slice whole-wheat bread, toasted\n" +
                    "\n" +
                    "1 large egg, fried\n" +
                    "\n" +
                    "1 teaspoon Sriracha (Optional)\n" +
                    "\n" +
                    "1 tablespoon scallion, sliced (Optional)",
            ("Combine avocado, pepper and garlic powder in a small bowl and gently mash.\n" +
                    "\n" +
                    "Top toast with the avocado mixture and fried egg. Garnish with Sriracha and scallion, if desired.\n" +
                    "\n"), (
                    "271" +
                    " Calories\n" +
                    "18g" +
                    " Fat\n" +
                    "18g" +
                    " Carbs\n" +
                    "12g" +
                    " Protein")
        )

        var recipeBr9 = FoodRecipe(
            "½ cup frozen chopped mango\n" +
                    "\n" +
                    "½ cup nonfat plain Greek yogurt\n" +
                    "\n" +
                    "¼ cup frozen sliced banana\n" +
                    "\n" +
                    "¼ cup plain unsweetened almond milk\n" +
                    "\n" +
                    "5 tablespoons unsalted almonds, divided\n" +
                    "\n" +
                    "⅛ teaspoon ground allspice\n" +
                    "\n" +
                    "¼ cup raspberries\n" +
                    "\n" +
                    "½ teaspoon honey",
            ("Blend mango, yogurt, banana, almond milk, 3 tablespoons almonds and allspice in a blender until very smooth.\n" +
                    "\n" +
                    "Pour the smoothie into a bowl and top with raspberries, the remaining 2 tablespoons almonds and honey."), (
                    "457" +
                    " Calories\n" +
                    "24g" +
                    " Fat\n" +
                    "46g" +
                    " Carbs\n" +
                    "22g" +
                    " Protein")
        )

        var recipeBr10 = FoodRecipe(
            "¾ cup nonfat vanilla Greek yogurt\n" +
                    "\n" +
                    "¼ cup part-skim ricotta\n" +
                    "\n" +
                    "½ teaspoon lemon zest\n" +
                    "\n" +
                    "¼ cup raspberries\n" +
                    "\n" +
                    "1 tablespoon slivered almonds\n" +
                    "\n" +
                    "1 teaspoon chia seeds",
            ("Combine yogurt, ricotta and lemon zest in a bowl. Top with raspberries, almonds and chia seeds."), (
                    "272" +
                    " Calories\n" +
                    "10g" +
                    " Fat\n" +
                    "25g" +
                    " Carbs\n" +
                    "22g" +
                    " Protein\n")
        )

        var recipeMd1 = FoodRecipe(
            "2 tablespoons fat-free mayonnaise\n" +
                    "\n" +
                    "4 teaspoons basil pesto\n" +
                    "\n" +
                    "8 (1-ounce) thin slices sourdough bread\n" +
                    "\n" +
                    "8 ounces sliced cooked turkey breast\n" +
                    "\n" +
                    "2 ounces thinly sliced provolone cheese\n" +
                    "\n" +
                    "8 (1/8-inch-thick) slices tomato\n" +
                    "\n" +
                    "Cooking spray",
            ("Combine mayonnaise and pesto, stirring well. Spread 1 tablespoon mayonnaise mixture on each of 4 bread slices; top each slice with 2 ounces turkey, 1/2 ounce cheese, and 2 tomato slices. Top with remaining bread slices.\n" +
                    "\n" +
                    "Preheat grill pan or large nonstick skillet coated with cooking spray over medium heat. Add sandwiches to pan; top with another heavy skillet. Cook 3 minutes on each side or until golden brown."), (
                    "257" +
                    " Calories\n" +
                    "8g" +
                    " Fat\n" +
                    "30g" +
                    " Carbs\n" +
                    "18g" +
                    " Protein")
        )

        var recipeMd2 = FoodRecipe(
            "1 tablespoon smoked paprika\n" +
                    "\n" +
                    "1 teaspoon ground pepper\n" +
                    "\n" +
                    "1 teaspoon onion powder\n" +
                    "\n" +
                    "1 teaspoon garlic powder\n" +
                    "\n" +
                    "1 teaspoon dried oregano\n" +
                    "\n" +
                    "1 teaspoon dried thyme\n" +
                    "\n" +
                    "½ teaspoon salt\n" +
                    "\n" +
                    "½ teaspoon cayenne pepper\n" +
                    "\n" +
                    "4 (5 ounce) boneless, skinless red snapper fillets\n" +
                    "\n" +
                    "1 tablespoon extra-virgin olive oil\n" +
                    "\n" +
                    "Lemon wedges",
            ("Preheat grill to medium-high (400 degrees-450 degrees F). Combine paprika, pepper, onion powder, garlic powder, oregano, thyme, salt and cayenne in a small bowl. Brush fish all over with oil; sprinkle the seasoning evenly over both sides of fish, pressing to adhere.\n" +
                    "\n" +
                    "Oil the grill grates. Grill the fish, covered, until it flakes easily and a thermometer inserted in the thickest part registers 145 degrees F, 3 to 5 minutes per side. Serve with lemon wedges."), (
                    "185" +
                    " Calories\n" +
                    "6g" +
                    " Fat\n" +
                    "3g" +
                    " Carbs\n" +
                    "30g" +
                    " Protein")
        )

        var recipeMd3 = FoodRecipe(
            "1 pound boneless, skinless chicken breast, trimmed\n" +
                    "\n" +
                    "½ teaspoon freshly ground pepper, divided\n" +
                    "\n" +
                    "3 tablespoons nonfat plain Greek yogurt\n" +
                    "\n" +
                    "3 tablespoons cider vinegar\n" +
                    "\n" +
                    "3 tablespoons minced onion\n" +
                    "\n" +
                    "2 tablespoons extra-virgin olive oil\n" +
                    "\n" +
                    "⅛ teaspoon salt\n" +
                    "\n" +
                    "1 medium tomato, chopped\n" +
                    "\n" +
                    "1 avocado, chopped\n" +
                    "\n" +
                    "3 strips cooked bacon, crumbled\n" +
                    "\n" +
                    "8 large leaves red- or green-leaf lettuce\n" +
                    "\n" +
                    "4 10-inch flour tortillas, preferably whole-wheat",
            ("Preheat grill to medium-high.\n" +
                    "\n" +
                    "Sprinkle chicken on both sides with 1/4 teaspoon pepper. Oil the grill rack (see Tip). Grill the chicken, turning once or twice, until an instant-read thermometer inserted into the thickest part registers 165 degrees F, 15 to 18 minutes. Transfer to a clean cutting board and let cool for about 5 minutes.\n" +
                    "\n" +
                    "Meanwhile, whisk yogurt, vinegar, onion, oil, salt and the remaining 1/4 teaspoon pepper in a large bowl. Chop the chicken into bite-size pieces and add to the bowl along with tomato, avocado and bacon; toss to combine.\n" +
                    "\n" +
                    "To assemble the wraps, place 2 lettuce leaves on each tortilla and top with chicken salad (about 1 cup each). Roll up like a burrito. Serve cut in half, if desired."), (
                    "\n" +
                    "526" +
                    " Calories\n" +
                    "26g" +
                    " Fat\n" +
                    "39g" +
                    " Carbs\n" +
                    "34g" +
                    " Protein")
        )

        var recipeMd4 = FoodRecipe(
            "2 slices whole-grain bread\n" +
                    "\n" +
                    "3 tablespoons hummus\n" +
                    "\n" +
                    "¼ avocado, mashed\n" +
                    "\n" +
                    "½ cup mixed salad greens\n" +
                    "\n" +
                    "¼ medium red bell pepper, sliced\n" +
                    "\n" +
                    "¼ cup sliced cucumber\n" +
                    "\n" +
                    "¼ cup shredded carrot",
            ("Spread one slice of bread with hummus and the other with avocado. Fill the sandwich with greens, bell pepper, cucumber and carrot. Slice in half and serve."), (
                    "325" +
                    " Calories\n" +
                    "14g" +
                    " Fat\n" +
                    "40g" +
                    " Carbs\n" +
                    "13g" +
                    " Protein")
        )

        var recipeMd5 = FoodRecipe(
            "2 tablespoons olive oil\n" +
                    "\n" +
                    "2 tablespoons fresh lemon juice (from 1 lemon)\n" +
                    "\n" +
                    "2 teaspoons honey\n" +
                    "\n" +
                    "1 teaspoon chopped fresh thyme\n" +
                    "\n" +
                    "1 teaspoon Dijon mustard\n" +
                    "\n" +
                    "½ teaspoon black pepper\n" +
                    "\n" +
                    "¼ teaspoon kosher salt\n" +
                    "\n" +
                    "4 cups mixed baby lettuces\n" +
                    "\n" +
                    "1 medium ripe Bosc pear, thinly sliced\n" +
                    "\n" +
                    "¼ cup crumbled Gorgonzola cheese\n" +
                    "\n" +
                    "¼ cup toasted walnuts, coarsely chopped\n" +
                    "\n" +
                    "¼ cup golden raisins",
            ("Whisk together oil, lemon juice, honey, thyme, mustard, pepper and salt in a large bowl. Add lettuce and gently toss to combine. Top with sliced pear, Gorgonzola, walnuts and raisins. Serve immediately."), (
                    "207" +
                    " Calories\n" +
                    "14g" +
                    " Fat\n" +
                    "21g" +
                    " Carbs\n" +
                    "4g" +
                    " Protein")
        )

        var recipeMd6 = FoodRecipe(
            "2 celery hearts, finely chopped (about 1/3 cup)\n" +
                    "\n" +
                    "¼ cup finely chopped red onion or shallot\n" +
                    "\n" +
                    "1 tablespoon champagne vinegar\n" +
                    "\n" +
                    "8 hard-boiled eggs, peeled and halved\n" +
                    "\n" +
                    "2 tablespoons nonfat plain strained yogurt, such as Greek-style\n" +
                    "\n" +
                    "1 tablespoon yellow mustard\n" +
                    "\n" +
                    "1 tablespoon mayonnaise\n" +
                    "\n" +
                    "1 teaspoon chopped fresh dill, plus more for garnish\n" +
                    "\n" +
                    "1 teaspoon chopped fresh chives, plus more for garnish\n" +
                    "\n" +
                    "¼ teaspoon salt\n" +
                    "\n" +
                    "¼ teaspoon ground pepper",
            ("Stir celery, onion (or shallot) and vinegar together in a medium bowl; let stand at room temperature until the onion is bright red, about 5 minutes.\n" +
                    "\n" +
                    "Add egg halves to the bowl; mash with a fork until finely crumbled. Add yogurt, mustard, mayonnaise, dill, chives, salt and pepper; stir until well combined. Garnish with additional dill and chives, if desired."), (
                    "\n" +
                    "181" +
                    " Calories\n" +
                    "12g" +
                    " Fat\n" +
                    "3g" +
                    " Carbs\n" +
                    "14g" +
                    " Protein")
        )

        var recipeMd7 = FoodRecipe(
            "2 tablespoons plain nonfat yogurt\n" +
                    "\n" +
                    "2 teaspoons chopped fresh dill\n" +
                    "\n" +
                    "2 teaspoons lemon juice\n" +
                    "\n" +
                    "½ teaspoon prepared horseradish\n" +
                    "\n" +
                    "3 ounces flaked drained canned sockeye salmon\n" +
                    "\n" +
                    "½ 6-inch whole-wheat pita bread\n" +
                    "\n" +
                    "½ cup watercress",
            ("Combine yogurt, dill, lemon juice and horseradish in a small bowl; stir in salmon. Stuff the pita half with the salmon salad and watercress."), (
                    "239" +
                    " Calories\n" +
                    "7g" +
                    " Fat\n" +
                    "19g" +
                    " Carbs\n" +
                    "25g" +
                    " Protein")
        )

        var recipeMd8 = FoodRecipe(
            "2 slices whole-grain bread\n" +
                    "\n" +
                    "3 tablespoons hummus\n" +
                    "\n" +
                    "¼ avocado, mashed\n" +
                    "\n" +
                    "½ cup mixed salad greens\n" +
                    "\n" +
                    "¼ medium red bell pepper, sliced\n" +
                    "\n" +
                    "¼ cup sliced cucumber\n" +
                    "\n" +
                    "¼ cup shredded carrot",
            ("Spread one slice of bread with hummus and the other with avocado. Fill the sandwich with greens, bell pepper, cucumber and carrot. Slice in half and serve."), (
                    "325" +
                    " Calories\n" +
                    "14g" +
                    " Fat\n" +
                    "40g" +
                    " Carbs\n" +
                    "13g" +
                    " Protein")
        )

        var recipeMd9 = FoodRecipe(
            "2 (15 ounce) cans low-sodium chickpeas, rinsed, divided\n" +
                    "\n" +
                    "1 tablespoon olive oil\n" +
                    "\n" +
                    "12 ounces 93%-lean ground turkey\n" +
                    "\n" +
                    "½ teaspoon dried oregano\n" +
                    "\n" +
                    "½ teaspoon fennel seeds, crushed\n" +
                    "\n" +
                    "½ teaspoon crushed red pepper\n" +
                    "\n" +
                    "1 medium onion, chopped (1 cup)\n" +
                    "\n" +
                    "2 medium carrots, diced (3/4 cup)\n" +
                    "\n" +
                    "4 cloves garlic, minced, or 1/2 teaspoon garlic powder\n" +
                    "\n" +
                    "3 tablespoons tomato paste\n" +
                    "\n" +
                    "1 (32 ounce) carton low-sodium chicken broth (4 cups)\n" +
                    "\n" +
                    "¼ teaspoon ground pepper\n" +
                    "\n" +
                    "⅛ teaspoon salt\n" +
                    "\n" +
                    "3 cups IQF (individually quick-frozen) spinach (8 oz.)\n" +
                    "\n" +
                    "¼ cup grated Parmesan cheese (Optional)",
            ("Mash 1 can chickpeas with a potato masher or fork. Set aside.\n" +
                    "\n" +
                    "Heat oil in a large pot over medium-high heat. Add turkey, oregano, fennel seeds and crushed red pepper. Cook, crumbling with a wooden spoon, until the turkey is no longer pink, 2 to 3 minutes. Add onion, carrots and garlic (or garlic powder). Cook, stirring often, until softened and fragrant, 3 to 4 minutes. Add tomato paste. Cook, stirring, for 30 seconds.\n" +
                    "\n" +
                    "Add broth, the mashed and whole chickpeas, pepper and salt to the pot. Cover and bring to a simmer. Reduce heat to medium and cook, covered, at a brisk simmer until the vegetables are tender and the flavors have blended, about 10 minutes.\n" +
                    "\n" +
                    "Add spinach and increase heat to medium-high, Cook, stirring, until the spinach is heated through, 1 to 2 minutes. Ladle the soup into bowls. Garnish each serving with 1 tablespoon Parmesan, if desired."), (
                    "401" +
                    " Calories\n" +
                    "13g" +
                    " Fat\n" +
                    "41g" +
                    " Carbs\n" +
                    "32g" +
                    " Protein")
        )

        var recipeMd10 = FoodRecipe(
            "3 tablespoons lemon juice\n" +
                    "\n" +
                    "2 tablespoons extra-virgin olive oil\n" +
                    "\n" +
                    "2 tablespoons low-fat mayonnaise\n" +
                    "\n" +
                    "1 clove garlic, minced\n" +
                    "\n" +
                    "½ teaspoon freshly ground pepper\n" +
                    "\n" +
                    "2 boneless, skinless chicken breasts (about 1 pound total), trimmed\n" +
                    "\n" +
                    "⅛ teaspoon salt\n" +
                    "\n" +
                    "2 small romaine hearts\n" +
                    "\n" +
                    "⅓ cup finely shredded Parmesan cheese\n" +
                    "\n" +
                    "4 8- to 9-inch spinach wraps, warmed",
            ("Preheat grill to medium-high.\n" +
                    "\n" +
                    "Combine lemon juice, oil, mayonnaise, garlic and pepper in a large bowl.\n" +
                    "\n" +
                    "Oil the grill rack (see Tip). Sprinkle chicken with salt. Cut romaine in half lengthwise, leaving root ends intact. Grill the chicken until an instant-read thermometer inserted into the thickest part registers 165 degrees F, 4 to 6 minutes per side. Two minutes before the chicken is done, place the romaine on the rack and grill, turning once or twice, until lightly charred and beginning to wilt, 2 to 3 minutes total.\n" +
                    "\n" +
                    "Cut the chicken into bite-size pieces. Cut the root ends off the romaine, then chop the leaves. Add the chicken, lettuce and Parmesan to the bowl with the dressing; toss until well combined. Fill each wrap with about 1 1/2 cups of the salad and roll closed."), (
                    "429" +
                    " Calories\n" +
                    "16g" +
                    " Fat\n" +
                    "40g" +
                    " Carbs\n" +
                    "33g" +
                    " Protein")
        )

        var recipeSp1 = FoodRecipe(
            "1 tablespoon butter\n" +
                    "\n" +
                    "1 tablespoon extra-virgin olive oil\n" +
                    "\n" +
                    "1 medium onion, chopped\n" +
                    "\n" +
                    "1 stalk celery, chopped\n" +
                    "\n" +
                    "2 cloves garlic, chopped\n" +
                    "\n" +
                    "1 teaspoon chopped fresh thyme or parsley\n" +
                    "\n" +
                    "5 cups chopped carrots\n" +
                    "\n" +
                    "2 cups water\n" +
                    "\n" +
                    "4 cups reduced-sodium chicken broth, \"no-chicken\" broth (see Note) or vegetable broth\n" +
                    "\n" +
                    "½ cup half-and-half (optional)\n" +
                    "\n" +
                    "½ teaspoon salt\n" +
                    "\n" +
                    "Freshly ground pepper to taste",
            ("Heat butter and oil in a Dutch oven over medium heat until the butter melts. Add onion and celery; cook, stirring occasionally, until softened, 4 to 6 minutes. Add garlic and thyme (or parsley); cook, stirring, until fragrant, about 10 seconds. Stir in carrots. Add water and broth; bring to a lively simmer over high heat. Reduce heat to maintain a lively simmer and cook until very tender, about 25 minutes.\n" +
                    "\n" +
                    "Puree the soup in batches in a blender until smooth. (Use caution when pureeing hot liquids.) Stir in half-and-half (if using), salt and pepper."), (
                    "176" +
                    " Calories\n" +
                    "8g" +
                    " Fat\n" +
                    "22g" +
                    " Carbs\n" +
                    "7g" +
                    " Protein")
        )

        var recipeSp2 = FoodRecipe(
            "1 tablespoon butter\n" +
                    "\n" +
                    "1 tablespoon extra-virgin olive oil\n" +
                    "\n" +
                    "1 medium onion, chopped\n" +
                    "\n" +
                    "1 stalk celery, chopped\n" +
                    "\n" +
                    "2 cloves garlic, chopped\n" +
                    "\n" +
                    "1 teaspoon chopped fresh thyme or parsley\n" +
                    "\n" +
                    "6 cups peas, fresh or frozen\n" +
                    "\n" +
                    "½ cup water\n" +
                    "\n" +
                    "4 cups reduced-sodium chicken broth, “no-chicken” broth (see Note) or vegetable broth\n" +
                    "\n" +
                    "1/2 cup half-and-half (optional)\n" +
                    "\n" +
                    "½ teaspoon salt\n" +
                    "\n" +
                    "Freshly ground pepper to taste",
            ("Heat butter and oil in a Dutch oven over medium heat until the butter melts. Add onion and celery; cook, stirring occasionally, until softened, 4 to 6 minutes. Add garlic and thyme (or parsley); cook, stirring, until fragrant, about 10 seconds.\n" +
                    "\n" +
                    "Stir in peas. Add water and broth; bring to a lively simmer over high heat. Reduce heat to maintain a lively simmer and cook until very tender, about 1 minute.\n" +
                    "\n" +
                    "Puree the soup in batches in a blender until smooth. (Use caution when pureeing hot liquids.) Stir in half-and-half (if using), salt and pepper."), (
                    "287" +
                    " Calories\n" +
                    "9g" +
                    " Fat\n" +
                    "38g" +
                    " Carbs\n" +
                    "17g" +
                    " Protein")
        )

        var recipeSp3 = FoodRecipe(
            "2 tablespoons extra-virgin olive oil\n" +
                    "\n" +
                    "1 medium onion, chopped\n" +
                    "\n" +
                    "2 medium carrots, chopped\n" +
                    "\n" +
                    "2 stalks celery, chopped\n" +
                    "\n" +
                    "1 medium red bell pepper, chopped\n" +
                    "\n" +
                    "2 cloves garlic, minced\n" +
                    "\n" +
                    "1 ½ teaspoons Italian seasoning\n" +
                    "\n" +
                    "½ teaspoon ground pepper\n" +
                    "\n" +
                    "¼ teaspoon salt\n" +
                    "\n" +
                    "8 cups low-sodium vegetable broth\n" +
                    "\n" +
                    "1 medium head green cabbage, halved and sliced\n" +
                    "\n" +
                    "1 large tomato, chopped\n" +
                    "\n" +
                    "2 teaspoons white-wine vinegar",
            ("Heat oil in a large pot over medium heat. Add onion, carrots and celery. Cook, stirring, until the vegetables begin to soften, 6 to 8 minutes. Add bell pepper, garlic, Italian seasoning, pepper and salt and cook, stirring, for 2 minutes.\n" +
                    "\n" +
                    "Add broth, cabbage and tomato; increase heat to medium-high and bring to a boil. Reduce heat to maintain a simmer, partially cover and cook until all the vegetables are tender, 15 to 20 minutes more. Remove from heat and stir in vinegar."), (
                    "133" +
                    " Calories\n" +
                    "5g" +
                    " Fat\n" +
                    "20g" +
                    " Carbs\n" +
                    "3g" +
                    " Protein\n")
        )

        var recipeSp4 = FoodRecipe(
            "2 tablespoons extra-virgin olive oil\n" +
                    "\n" +
                    "1 medium onion, chopped\n" +
                    "\n" +
                    "2 medium carrots, chopped\n" +
                    "\n" +
                    "2 stalks celery, chopped\n" +
                    "\n" +
                    "12 ounces fresh green beans, cut into 1/2-inch pieces\n" +
                    "\n" +
                    "2 cloves garlic, minced\n" +
                    "\n" +
                    "8 cups no-salt-added chicken broth or low-sodium vegetable broth\n" +
                    "\n" +
                    "2 (15 ounce) cans low-sodium cannellini or other white beans, rinsed\n" +
                    "\n" +
                    "4 cups chopped kale\n" +
                    "\n" +
                    "2 medium zucchini, chopped\n" +
                    "\n" +
                    "4 Roma tomatoes, seeded and chopped\n" +
                    "\n" +
                    "2 teaspoons red-wine vinegar\n" +
                    "\n" +
                    "¾ teaspoon salt\n" +
                    "\n" +
                    "½ teaspoon ground pepper\n" +
                    "\n" +
                    "8 teaspoons prepared pesto",
            ("Heat oil in a large pot over medium-high heat. Add onion, carrot, celery, green beans and garlic. Cook, stirring frequently, until the vegetables begin to soften, about 10 minutes.\n" +
                    "\n" +
                    "Add broth and bring to a boil. Reduce heat to a simmer and cook, stirring occasionally, until the vegetables are soft, about 10 minutes more.\n" +
                    "\n" +
                    "Add white beans, kale, zucchini, tomatoes, vinegar, salt and pepper. Increase heat to return to a simmer; cook until the zucchini and kale have softened, about 10 minutes.\n" +
                    "\n" +
                    "Top each serving of soup with 1 teaspoon pesto."), (
                    "225" +
                    " \n" +
                    "8g" +
                    " Fat\n" +
                    "28g" +
                    " Carbs\n" +
                    "13g" +
                    " Protein")
        )

        var recipeSp5 = FoodRecipe(
            "2 tablespoons canola oil\n" +
                    "\n" +
                    "1 ½ pounds lean ground beef\n" +
                    "\n" +
                    "4 cups chopped green cabbage\n" +
                    "\n" +
                    "2 cups chopped yellow onion\n" +
                    "\n" +
                    "1 ¼ cups chopped carrots\n" +
                    "\n" +
                    "1 cup chopped celery\n" +
                    "\n" +
                    "2 tablespoons light brown sugar\n" +
                    "\n" +
                    "1 tablespoon smoked paprika\n" +
                    "\n" +
                    "1 teaspoon salt\n" +
                    "\n" +
                    "½ teaspoon ground pepper\n" +
                    "\n" +
                    "¼ teaspoon cayenne pepper\n" +
                    "\n" +
                    "1 (15 ounce) can no-salt-added tomato sauce\n" +
                    "\n" +
                    "4 cups unsalted chicken broth\n" +
                    "\n" +
                    "¼ cup medium-grain brown rice",
            ("Heat oil in a large heavy pot over medium-high heat. Add ground beef; cook, stirring often, until the meat is cooked through and starting to brown slightly, 6 to 7 minutes. Add cabbage, onion, carrots and celery; cook, stirring often, until the onion is translucent, about 5 minutes.\n" +
                    "\n" +
                    "Add brown sugar, paprika, salt, pepper and cayenne to the beef mixture; cook over medium-high heat, stirring constantly, until the spices are toasted, about 1 minute. Stir in tomato sauce and broth, scraping the bottom of the pot with a wooden spoon to release any browned bits. Bring the soup to a boil over medium-high heat. Stir in rice. Reduce heat to low; cover and cook until the rice is tender, 30 to 35 minutes. If desired, sprinkle with parsley before serving."), (
                    "300" +
                    " Calories\n" +
                    "17g" +
                    " Fat\n" +
                    "18g" +
                    " Carbs\n" +
                    "20g" +
                    " Protein")
        )

        var recipeSp6 = FoodRecipe(
            "1 medium onion, chopped\n" +
                    "\n" +
                    "2 medium carrots, chopped\n" +
                    "\n" +
                    "2 stalks celery, chopped\n" +
                    "\n" +
                    "12 ounces fresh green beans, cut into 1/2-inch pieces\n" +
                    "\n" +
                    "4 cups chopped kale\n" +
                    "\n" +
                    "2 medium zucchini, chopped\n" +
                    "\n" +
                    "4 Roma tomatoes, seeded and chopped\n" +
                    "\n" +
                    "2 cloves garlic, minced\n" +
                    "\n" +
                    "2 (15 ounce) cans no-salt-added cannellini or other white beans, rinsed\n" +
                    "\n" +
                    "4 cups low-sodium chicken broth or low-sodium vegetable broth\n" +
                    "\n" +
                    "1 Parmesan rind (optional)\n" +
                    "\n" +
                    "2 teaspoons salt\n" +
                    "\n" +
                    "½ teaspoon ground pepper\n" +
                    "\n" +
                    "2 teaspoons red-wine vinegar\n" +
                    "\n" +
                    "8 teaspoons prepared pesto",
            ("Combine onion, carrots, celery, green beans, kale, zucchini, tomatoes, garlic, white beans, broth, Parmesan rind (if using), salt and pepper in a 6-quart or larger slow cooker. Cover and cook on High for 4 hours or Low for 6 hours.\n" +
                    "\n" +
                    "Remove Parmesan rind, if using. Stir in vinegar and top each serving of soup with 1 teaspoon pesto."), (
                    "174" +
                    " Calories\n" +
                    "4g" +
                    " Fat\n" +
                    "26g" +
                    " Carbs\n" +
                    "10g" +
                    " Protein")
        )

        var recipeSp7 = FoodRecipe(
            "1 tablespoon extra-virgin olive oil\n" +
                    "\n" +
                    "2 cloves garlic, minced\n" +
                    "\n" +
                    "1 small onion, diced\n" +
                    "\n" +
                    "1 tablespoon lemon juice\n" +
                    "\n" +
                    "4 cups peeled, seeded and thinly sliced cucumbers, divided\n" +
                    "\n" +
                    "1 1/2 cups vegetable broth, or reduced-sodium chicken broth\n" +
                    "\n" +
                    "½ teaspoon salt\n" +
                    "\n" +
                    "¼ teaspoon freshly ground pepper\n" +
                    "\n" +
                    "Pinch of cayenne pepper\n" +
                    "\n" +
                    "1 avocado, diced\n" +
                    "\n" +
                    "¼ cup chopped fresh parsley, plus more for garnish\n" +
                    "\n" +
                    "½ cup low-fat plain yogurt",
            ("Heat oil in a large saucepan over medium-high heat. Add garlic and onion; cook, stirring occasionally, until tender, 1 to 4 minutes. Add lemon juice and cook for 1 minute. Add 3 3/4 cups cucumber slices, broth, salt, pepper and cayenne; bring to a simmer. Reduce heat and cook at a gentle simmer until the cucumbers are soft, 6 to 8 minutes.\n" +
                    "\n" +
                    "Transfer the soup to a blender. Add avocado and parsley; blend on low speed until smooth. (Use caution when pureeing hot liquids.) Pour into a serving bowl and stir in yogurt. Chop the remaining 1/4 cup cucumber slices. Serve the soup warm or refrigerate and serve it chilled. Just before serving, garnish with the chopped cucumber and more chopped parsley, if desired."), (
                    "169" +
                    " Calories\n" +
                    "12g" +
                    " Fat\n" +
                    "14g" +
                    " Carbs\n" +
                    "4g" +
                    " Protein")
        )

        var recipeSp8 = FoodRecipe(
            "2 tablespoons extra-virgin olive oil\n" +
                    "\n" +
                    "1 medium yellow onion, chopped\n" +
                    "\n" +
                    "1 (8 ounce) package sliced cremini mushrooms\n" +
                    "\n" +
                    "2 celery stalks, thinly sliced\n" +
                    "\n" +
                    "2 carrots, thinly sliced\n" +
                    "\n" +
                    "2 tablespoons minced garlic\n" +
                    "\n" +
                    "2 teaspoons chopped fresh sage\n" +
                    "\n" +
                    "¼ teaspoon cayenne pepper (Optional)\n" +
                    "\n" +
                    "1 dried bay leaf\n" +
                    "\n" +
                    "2 pounds bone-in chicken thighs, skin removed\n" +
                    "\n" +
                    "8 cups unsalted chicken broth\n" +
                    "\n" +
                    "½ teaspoon salt\n" +
                    "\n" +
                    "½ teaspoon ground pepper\n" +
                    "\n" +
                    "2 cups chopped stemmed lacinato kale\n" +
                    "\n" +
                    "2 tablespoons fresh lemon juice",
            ("Heat oil in a large saucepan over medium-high heat. Add onion, mushrooms, celery and carrots; cook, stirring occasionally, until the vegetables start to brown slightly, about 6 minutes. Stir in garlic, sage, cayenne (if using) and bay leaf; cook, stirring constantly, for 1 minute. Stir in chicken, broth, salt and pepper.\n" +
                    "\n" +
                    "Bring the mixture to a boil over medium-high heat. Reduce heat to medium; simmer, undisturbed, until the chicken is fork-tender, about 20 minutes. Transfer the chicken to a plate to cool slightly, about 5 minutes.\n" +
                    "\n" +
                    "Meanwhile, stir kale into the soup; return to a simmer over medium heat. Simmer, undisturbed, until the kale is tender, about 5 minutes. Remove from heat.\n" +
                    "\n" +
                    "Remove and discard bones from the chicken; shred the chicken. Stir lemon juice and the shredded chicken into the soup."), (
                    "260" +
                    " Calories\n" +
                    "12g" +
                    " Fat\n" +
                    "11g" +
                    " Carbs\n" +
                    "27g" +
                    " Protein")
        )

        var recipeSp9 = FoodRecipe(
            "1 (32 fluid ounce) container reduced-sodium chicken broth\n" +
                    "\n" +
                    "3 cups water\n" +
                    "\n" +
                    "2 ½ cups chopped cooked chicken (about 12 ounces)\n" +
                    "\n" +
                    "3 medium carrots, sliced (1 1/2 cups)\n" +
                    "\n" +
                    "3 stalks celery, sliced (1 1/2 cups)\n" +
                    "\n" +
                    "1 ½ cups sliced fresh mushrooms (4 ounces)\n" +
                    "\n" +
                    "¼ cup chopped onion\n" +
                    "\n" +
                    "1 ½ teaspoons dried thyme, crushed\n" +
                    "\n" +
                    "¾ teaspoon garlic-pepper seasoning\n" +
                    "\n" +
                    "3 ounces reduced-fat cream cheese (Neufchâtel), cut up\n" +
                    "\n" +
                    "2 cups dried egg noodles",
            ("In a 5- to 6-quart slow cooker combine broth, the water, chicken, carrots, celery, mushrooms, onion, thyme, and garlic-pepper seasoning.\n" +
                    "\n" +
                    "Cover and cook on low-heat setting for 6 to 8 hours or on high-heat setting for 3 to 4 hours.\n" +
                    "\n" +
                    "If using low-heat setting, turn to high-heat setting. Stir in cream cheese until combined. Stir in uncooked noodles. Cover and cook for 20 to 30 minutes more or just until noodles are tender."), (
                    "170" +
                    " Calories\n" +
                    "6g" +
                    " Fat\n" +
                    "12g" +
                    " Carbs\n" +
                    "17g" +
                    " Protein")
        )

        var recipeSp10 = FoodRecipe(
            "2 tablespoons olive oil\n" +
                    "\n" +
                    "1 medium leek, white and light green parts only, sliced\n" +
                    "\n" +
                    "2 large stalks celery, sliced 1/8-inch thick\n" +
                    "\n" +
                    "2 cloves garlic, minced\n" +
                    "\n" +
                    "4 cups lower-sodium chicken broth or turkey broth\n" +
                    "\n" +
                    "2 (4-inch) thyme sprigs, plus thyme leaves for garnish\n" +
                    "\n" +
                    "¼ teaspoon salt\n" +
                    "\n" +
                    "¼ teaspoon ground pepper\n" +
                    "\n" +
                    "2 cups shredded or diced leftover roasted turkey or thick-cut deli turkey\n" +
                    "\n" +
                    "2 medium carrots, diagonally sliced 1/2-inch thick\n" +
                    "\n" +
                    "1 cup frozen peas\n" +
                    "\n" +
                    "Grated lemon zest & lemon wedges for garnish",
            ("Heat oil in a large Dutch oven or other heavy pot over medium heat. Add leek and celery; cook, stirring often, until the vegetables have softened, 5 to 8 minutes. Add garlic; cook, stirring constantly, until fragrant, about 1 minute.\n" +
                    "\n" +
                    "Add broth, thyme sprigs, salt and pepper; bring to a boil over high heat. Reduce heat to medium-low; simmer, stirring occasionally, until the flavors meld, about 5 minutes. Stir in turkey and carrots; cook, undisturbed, until the carrots are tender, 10 to 15 minutes. Remove and discard the thyme sprigs. Stir in peas; cook, undisturbed, for 30 seconds.\n" +
                    "\n" +
                    "Divide the soup evenly among 4 bowls. Garnish with thyme leaves and lemon zest, if desired, and serve with lemon wedges, if desired."), (
                    "264" +
                    " Calories\n" +
                    "11g" +
                    " Fat\n" +
                    "15g" +
                    " Carbs\n" +
                    "28g" +
                    " Protein")
        )

        var recipeSl1 = FoodRecipe(
            "½ cup canola mayonnaise\n" +
                    "\n" +
                    "½ cup plain whole-milk Greek yogurt\n" +
                    "\n" +
                    "1 tablespoon fresh lemon juice (from 1 lemon)\n" +
                    "\n" +
                    "2 teaspoons Dijon mustard\n" +
                    "\n" +
                    "½ teaspoon black pepper\n" +
                    "\n" +
                    "5 cups chopped rotisserie chicken breast\n" +
                    "\n" +
                    "½ cup diced celery\n" +
                    "\n" +
                    "1 cup halved red seedless grapes\n" +
                    "\n" +
                    "¼ cup sliced scallions, divided\n" +
                    "\n" +
                    "1 head butter lettuce",
            ("Stir together mayonnaise, yogurt, lemon juice, Dijon and pepper in a large bowl until combined. Add chicken, celery, grapes and 3 tablespoons scallions, and toss to combine. Serve on butter lettuce leaves, and top with the remaining scallions."), (
                    "350" +
                    " Calories\n" +
                    "19g" +
                    " Fat\n" +
                    "7g" +
                    " Carbs\n" +
                    "37g" +
                    " Protein")
        )

        var recipeSl2 = FoodRecipe(
            "1 5-ounce can no-salt light tuna in water, drained\n" +
                    "\n" +
                    "¼ cup finely chopped apple\n" +
                    "\n" +
                    "2 tablespoons finely chopped celery\n" +
                    "\n" +
                    "1 tablespoon finely chopped red onion\n" +
                    "\n" +
                    "3 tablespoons low-fat plain strained yogurt, such as Greek-style\n" +
                    "\n" +
                    "1 tablespoon finely chopped herbs, such as parsley, dill or chives\n" +
                    "\n" +
                    "1 teaspoon lemon juice\n" +
                    "\n" +
                    "⅛ teaspoon salt\n" +
                    "\n" +
                    "Pinch of ground pepper",
            ("Combine tuna, apple, celery, onion, yogurt, herbs, lemon juice, salt and pepper in a medium bowl."), (
                    "119" +
                    " Calories\n" +
                    "2g" +
                    " Fat\n" +
                    "10g" +
                    " Carbs\n" +
                    "18g" +
                    " Protein")
        )

        var recipeSl3 = FoodRecipe(
            "1 Japanese cucumber or 4 Persian mini cucumbers (about 10 ounces)\n" +
                    "\n" +
                    "2 tablespoons rice vinegar\n" +
                    "\n" +
                    "1 tablespoon toasted sesame oil\n" +
                    "\n" +
                    "¼ teaspoon grated garlic\n" +
                    "\n" +
                    "¼ teaspoon grated ginger\n" +
                    "\n" +
                    "⅛ teaspoon salt\n" +
                    "\n" +
                    "Pinch of sugar\n" +
                    "\n" +
                    "1 teaspoon sesame seeds",
            ("Peel cucumber to leave alternating green stripes. Quarter the cucumber lengthwise (halve lengthwise if using Persian cucumbers) and cut into 1/2-inch slices. Pat with a paper towel to remove any excess moisture.\n" +
                    "\n" +
                    "Whisk vinegar, sesame oil, garlic, ginger and salt in a medium bowl. Add the cucumber slices and toss to coat. Serve topped with sesame seeds."), (
                    "46" +
                    " Calories\n" +
                    "4g" +
                    " Fat\n" +
                    "3g" +
                    " Carbs\n" +
                    "1g" +
                    " Protein")
        )

        var recipeSl4 = FoodRecipe(
            "¼ cup finely chopped red onion\n" +
                    "\n" +
                    "⅓ cup canola mayonnaise\n" +
                    "\n" +
                    "3 tablespoons 2% reduced-fat Greek yogurt\n" +
                    "\n" +
                    "1 tablespoon cider vinegar\n" +
                    "\n" +
                    "1 tablespoon honey\n" +
                    "\n" +
                    "¼ teaspoon salt\n" +
                    "\n" +
                    "¼ teaspoon freshly ground black pepper\n" +
                    "\n" +
                    "4 cups coarsely chopped broccoli florets (about 1 bunch)\n" +
                    "\n" +
                    "⅓ cup slivered almonds, toasted\n" +
                    "\n" +
                    "⅓ cup reduced-sugar dried cranberries\n" +
                    "\n" +
                    "4 center-cut bacon slices, cooked and crumbled",
            ("Soak red onion in cold water for 5 minutes; drain.\n" +
                    "\n" +
                    "Combine mayonnaise, yogurt, vinegar, honey, salt and pepper, stirring well with a whisk. Stir in red onion, broccoli almonds, dried cranberries and bacon. Cover and chill 1 hour before serving."), (
                    "104" +
                    " Calories\n" +
                    "6g" +
                    " Fat\n" +
                    "11g" +
                    " Carbs\n" +
                    "4g" +
                    " Protein")
        )

        var recipeSl5 = FoodRecipe(
            "7 cups finely shredded green cabbage (about 1/2 head)\n" +
                    "\n" +
                    "1 cup thinly vertically sliced red onion\n" +
                    "\n" +
                    "1 cup grated carrot\n" +
                    "\n" +
                    "¼ cup white wine vinegar\n" +
                    "\n" +
                    "2 tablespoons sugar\n" +
                    "\n" +
                    "2 tablespoons whole-grain mustard\n" +
                    "\n" +
                    "2 tablespoons reduced-fat mayonnaise\n" +
                    "\n" +
                    "⅛ teaspoon salt\n" +
                    "\n" +
                    "⅛ teaspoon black pepper\n" +
                    "\n" +
                    "⅛ teaspoon ground red pepper",
            ("Combine cabbage, onion, and 1 cup carrot in a large bowl. Combine white wine vinegar, sugar, mustard, mayonnaise, salt, black pepper and red pepper in a small bowl; stir well with a whisk. Add the mustard mixture to cabbage mixture, and toss well to coat. Cover and chill for 20 minutes. Stir before serving."), (
                    "58" +
                    " Calories\n" +
                    "1g" +
                    " Fat\n" +
                    "12g" +
                    " Carbs\n" +
                    "2g" +
                    " Protein\n")
        )

        var recipeSl6 = FoodRecipe(
            "3 cloves garlic, chopped\n" +
                    "\n" +
                    "2 tablespoons lower-sodium soy sauce\n" +
                    "\n" +
                    "1 tablespoon toasted sesame oil\n" +
                    "\n" +
                    "1 tablespoon rice vinegar\n" +
                    "\n" +
                    "2 teaspoons granulated sugar\n" +
                    "\n" +
                    "1 teaspoon grated fresh ginger\n" +
                    "\n" +
                    "¾ teaspoon gochugaru (optional)\n" +
                    "\n" +
                    "¼ teaspoon salt\n" +
                    "\n" +
                    "4 Persian cucumbers\n" +
                    "\n" +
                    "2 large stalks celery, thinly sliced diagonally (about 1 cup), leaves reserved",
            ("Whisk garlic, soy sauce, sesame oil, vinegar, sugar, ginger, gochugaru (if using) and salt together in a large bowl.\n" +
                    "\n" +
                    "Gently smash cucumbers with the flat side of a knife and slice diagonally into thick bite-size pieces. Add the cucumbers and celery to the dressing; toss to coat. Let stand for 5 minutes.\n" +
                    "\n" +
                    "Divide the salad among 6 bowls and garnish with celery leaves."), (
                    "45" +
                    " Calories\n" +
                    "2g" +
                    " Fat\n" +
                    "5g" +
                    " Carbs\n" +
                    "1g" +
                    " Protein")
        )

        var recipeSl7 = FoodRecipe(
            "3 slices bacon\n" +
                    "\n" +
                    "¼ cup sour cream\n" +
                    "\n" +
                    "¼ cup mayonnaise\n" +
                    "\n" +
                    "4 teaspoons rice vinegar or cider vinegar\n" +
                    "\n" +
                    "¼ teaspoon ground pepper\n" +
                    "\n" +
                    "4 cups finely chopped broccoli florets (11 ounces)\n" +
                    "\n" +
                    "½ cup sliced scallions\n" +
                    "\n" +
                    "½ cup shredded extra-sharp Cheddar cheese",
            ("Cook bacon in a large skillet over medium heat until crisp, 5 to 7 minutes. Transfer to a paper-towel-lined plate. Reserve 1 tablespoon bacon fat. Chop the bacon when cool enough to handle.\n" +
                    "\n" +
                    "Whisk sour cream, mayonnaise, vinegar, pepper and the reserved bacon fat together in a large bowl. Add broccoli, scallions, cheese and the chopped bacon. Stir to coat with the dressing."), (
                    "191" +
                    " Calories\n" +
                    "17g" +
                    " Fat\n" +
                    "4g" +
                    " Carbs\n" +
                    "6g" +
                    " Protein")
        )

        var recipeSl8 = FoodRecipe(
            "2 tablespoons lemon juice\n" +
                    "\n" +
                    "2 tablespoons extra-virgin olive oil\n" +
                    "\n" +
                    "2 tablespoons chopped fresh flat-leaf parsley\n" +
                    "\n" +
                    "1 tablespoon Dijon mustard\n" +
                    "\n" +
                    "1 tablespoon honey\n" +
                    "\n" +
                    "1 teaspoon garlic powder\n" +
                    "\n" +
                    "½ teaspoon salt\n" +
                    "\n" +
                    "½ teaspoon ground pepper\n" +
                    "\n" +
                    "8 cups shredded green cabbage (from 1 small head)",
            ("Whisk lemon juice, oil, parsley, mustard, honey, garlic powder, salt and pepper together in a large bowl. Add cabbage and toss to coat; let stand for 10 minutes. Toss again; serve immediately or refrigerate for up to 1 hour before serving."), (
                    "124" +
                    " Calories\n" +
                    "7g" +
                    " Fat\n" +
                    "14g" +
                    " Carbs\n" +
                    "2g" +
                    " Protein")
        )

        var recipeSl9 = FoodRecipe(
            "6 Persian cucumbers\n" +
                    "\n" +
                    "2 teaspoons granulated sugar\n" +
                    "\n" +
                    "½ teaspoon salt\n" +
                    "\n" +
                    "1 cup thinly sliced red onion\n" +
                    "\n" +
                    "¼ cup white-wine vinegar\n" +
                    "\n" +
                    "2 tablespoons chopped fresh dill\n" +
                    "\n" +
                    "¼ teaspoon ground pepper",
            ("Using a mandoline (or a knife), thinly slice cucumbers 1/4 inch thick. Transfer the cucumber slices to a fine-mesh strainer set over a large bowl; sprinkle with sugar and salt. Toss to combine. Let stand at room temperature for 30 minutes.\n" +
                    "\n" +
                    "Discard any liquid in the bowl and wipe the bowl dry. Transfer the cucumbers to the bowl and toss with onion, vinegar, dill and pepper. Let stand at room temperature for 15 minutes. Serve immediately or refrigerate for up to 3 days."), (
                    "33" +
                    " Calories\n" +
                    "8g" +
                    " Carbs")
        )

        var recipeSl10 = FoodRecipe(
            "2 pounds beets, (5-6 medium)\n" +
                    "\n" +
                    "¼ cup extra-virgin olive oil\n" +
                    "\n" +
                    "2 tablespoons sherry vinegar, or white-wine vinegar\n" +
                    "\n" +
                    "½ teaspoon Dijon mustard\n" +
                    "\n" +
                    "½ teaspoon honey\n" +
                    "\n" +
                    "½ teaspoon salt\n" +
                    "\n" +
                    "Freshly ground pepper, to taste\n" +
                    "\n" +
                    "1 large shallot, finely chopped\n" +
                    "\n" +
                    "1 stalk celery, finely chopped",
            ("Preheat oven to 400 degrees F. Divide beets between 2 pieces of foil; bring edges together and crimp to make packets. Roast until the beets are just tender when pierced with the point of a knife, about 1 1/4 hours. Unwrap the beets and let cool.\n" +
                    "\n" +
                    "Meanwhile, whisk oil, vinegar, mustard, honey, salt and pepper in a small bowl to make dressing.\n" +
                    "\n" +
                    "When the beets are cool enough to handle, slip off the skins. Cut into 1/2-inch cubes and place in a large bowl. Add celery, shallot and the dressing; toss to coat well. Serve at room temperature or chilled."), (
                    "120" +
                    " Calories\n" +
                    "7g" +
                    " Fat\n" +
                    "13g" +
                    " Carbs\n" +
                    "2g" +
                    " Protein")
        )

        var recipeDe1 = FoodRecipe(
            "3/4 cup plus 2 tablespoons whole-wheat pastry flour, (see Ingredient Note)\n" +
                    "\n" +
                    "½ cup granulated sugar\n" +
                    "\n" +
                    "⅓ cup unsweetened cocoa powder\n" +
                    "\n" +
                    "1 teaspoon baking powder\n" +
                    "\n" +
                    "1 teaspoon baking soda\n" +
                    "\n" +
                    "¼ teaspoon salt\n" +
                    "\n" +
                    "1/2 cup nonfat buttermilk, (see Tip)\n" +
                    "\n" +
                    "½ cup packed light brown sugar\n" +
                    "\n" +
                    "1 large egg, lightly beaten\n" +
                    "\n" +
                    "2 tablespoons canola oil\n" +
                    "\n" +
                    "1 teaspoon vanilla extract\n" +
                    "\n" +
                    "½ cup hot strong black coffee\n" +
                    "\n" +
                    "Confectioners' sugar, for dusting",
            ("Preheat oven to 350 degrees F. Coat a 9-inch round cake pan with cooking spray. Line the pan with a circle of wax paper.\n" +
                    "\n" +
                    "Whisk flour, granulated sugar, cocoa, baking powder, baking soda and salt in a large bowl. Add buttermilk, brown sugar, egg, oil and vanilla. Beat with an electric mixer on medium speed for 2 minutes. Add hot coffee and beat to blend. (The batter will be quite thin.) Pour the batter into the prepared pan.\n" +
                    "\n" +
                    "Bake the cake until a skewer inserted in the center comes out clean, 30 to 35 minutes. Cool in the pan on a wire rack for 10 minutes; remove from the pan, peel off the wax paper and let cool completely. Dust the top with confectioners' sugar before slicing."), (
                    "139" +
                    " Calories\n" +
                    "3g" +
                    " Fat\n" +
                    "27g" +
                    " Carbs\n" +
                    "2g" +
                    " Protein")
        )

        var recipeDe2 = FoodRecipe(
            "½ cup regular rolled oats\n" +
                    "\n" +
                    "2 tablespoons whole-wheat pastry flour\n" +
                    "\n" +
                    "2 tablespoons packed brown sugar (see Tips)\n" +
                    "\n" +
                    "½ teaspoon ground cinnamon\n" +
                    "\n" +
                    "1 tablespoon cold butter, cut into small pieces\n" +
                    "\n" +
                    "3 medium Golden Delicious apples, cored and cut into thin wedges\n" +
                    "\n" +
                    "2 tablespoons water\n" +
                    "\n" +
                    "1 tablespoon fresh lemon juice\n" +
                    "\n" +
                    "1 tablespoon packed brown sugar (see Tips)\n" +
                    "\n" +
                    "1 (8 ounce) container Frozen yogurt or low-fat vanilla yogurt",
            ("Preheat oven to 350 degrees F. In a medium bowl combine oats, flour, 2 tablespoons brown sugar and cinnamon. Mix with fork until combined. Add the butter and work it in with your fingers, the fork or a pastry blender until the mixture begins to form clumps.\n" +
                    "\n" +
                    "In a large bowl toss the apples with the water, lemon juice and remaining 1 tablespoon brown sugar. Transfer apple mixture to a 9-inch pie plate. Sprinkle the oat mixture evenly over the apples. Bake for 40 to 45 minutes or until the topping is golden and the apples are tender. If desired, serve warm with yogurt."), (
                    "148" +
                    " Calories\n" +
                    "3g" +
                    " Fat\n" +
                    "30g" +
                    " Carbs\n" +
                    "3g" +
                    " Protein")
        )

        var recipeDe3 = FoodRecipe(
            "1 ¼ cups graham cracker crumbs\n" +
                    "\n" +
                    "4 tablespoons salted butter, melted\n" +
                    "\n" +
                    "1 tablespoon granulated sugar\n" +
                    "\n" +
                    "Zest of 1 lemon, divided\n" +
                    "\n" +
                    "1 (14 ounce) can sweetened condensed milk\n" +
                    "\n" +
                    "½ cup lemon juice\n" +
                    "\n" +
                    "1 large egg\n" +
                    "\n" +
                    "1 cup fresh blueberries",
            ("Preheat oven to 350°F. Coat an 8-inch-square baking pan with cooking spray.\n" +
                    "\n" +
                    "Stir graham cracker crumbs, butter, sugar and half the lemon zest together in a medium bowl. Press the mixture firmly and evenly into the prepared pan. Bake until lightly browned around the edges, about 10 minutes. Let cool in the pan on a wire rack for at least 10 minutes.\n" +
                    "\n" +
                    "Meanwhile, thoroughly whisk condensed milk, lemon juice, egg and the remaining lemon zest together in a medium bowl. Stir in blueberries. Pour the filling evenly over the baked crust. Bake until set, 16 to 18 minutes. Let cool at room temperature for 1 hour. Cover and refrigerate for at least 1 hour more."), (
                    "273" +
                    " Calories\n" +
                    "11g" +
                    " Fat\n" +
                    "40g" +
                    " Carbs\n" +
                    "5g" +
                    " Protein")
        )

        var recipeDe4 = FoodRecipe(
            "½ cup natural peanut butter, almond butter or sunflower seed butter\n" +
                    "\n" +
                    "¾ cup crispy rice cereal\n" +
                    "\n" +
                    "1 teaspoon pure maple syrup\n" +
                    "\n" +
                    "½ cup dark chocolate chips, melted",
            ("Line a baking sheet with parchment or wax paper. Combine peanut butter, cereal and maple syrup in a medium bowl. Roll the mixture into 12 balls, using about 2 teaspoons for each. Place on the prepared baking sheet. Freeze the balls until firm, about 15 minutes.\n" +
                    "\n" +
                    "Roll the balls in melted chocolate. Return to the freezer until the chocolate is set, about 15 minutes."), (
                    "112" +
                    " Calories\n" +
                    "8g" +
                    " Fat\n" +
                    "8g" +
                    " Carbs\n" +
                    "3g" +
                    " Protein")
        )

        var recipeDe5 = FoodRecipe(
            "1 16-ounce package frozen pineapple chunks\n" +
                    "\n" +
                    "1 cup frozen mango chunks or 1 large mango, peeled, seeded and chopped\n" +
                    "\n" +
                    "1 tablespoon lemon juice or lime juice",
            ("Process pineapple, mango and lemon (or lime) juice in a food processor until smooth and creamy. (If using frozen mango, you may have to add up to 1/4 cup water.) For the best texture, serve immediately.\n" +
                    "\n"), (
                    "55" +
                    " Calories\n" +
                    "0g" +
                    " Fat\n" +
                    "14g" +
                    " Carbs\n" +
                    "1g" +
                    " Protein")
        )

        var recipeDe6 = FoodRecipe(
            "1 tablespoon coconut oil\n" +
                    "\n" +
                    "2 tablespoons unsweetened coconut milk or low-fat milk\n" +
                    "\n" +
                    "¼ teaspoon vanilla extract\n" +
                    "\n" +
                    "1 ½ tablespoons all-purpose flour\n" +
                    "\n" +
                    "1 tablespoon sugar\n" +
                    "\n" +
                    "1 tablespoon unsweetened cocoa powder\n" +
                    "\n" +
                    "⅛ teaspoon salt\n" +
                    "\n" +
                    "2 teaspoons mini chocolate chips (Optional)",
            ("Place coconut oil in a small microwave-safe coffee mug and microwave on High until melted, 15 to 20 seconds. Cool for 1 minute. Whisk in coconut milk (or milk) and vanilla. Add flour, sugar, cocoa and salt; continue whisking until completely incorporated. Stir in chocolate chips, if using. Microwave on High until firm to the touch and no longer glossy, 30 to 40 seconds. Let stand for 8 to 10 minutes."), (
                    "234" +
                    " Calories\n" +
                    "15g" +
                    " Fat\n" +
                    "25g" +
                    " Carbs\n" +
                    "2g" +
                    " Protein")
        )

        var recipeDe7 = FoodRecipe(
            "1 ¾ cups blackberries, raspberries and/or diced mango (fresh or frozen), divided\n" +
                    "\n" +
                    "1 cup unsweetened almond milk or milk of choice\n" +
                    "\n" +
                    "¼ cup chia seeds\n" +
                    "\n" +
                    "1 tablespoon pure maple syrup\n" +
                    "\n" +
                    "¾ teaspoon vanilla extract\n" +
                    "\n" +
                    "½ cup whole-milk plain Greek yogurt\n" +
                    "\n" +
                    "¼ cup granola",
            ("Puree 1 1/4 cups fruit and milk in a blender or food processor until smooth. Scrape into a medium bowl; mix in chia, syrup and vanilla. Cover and refrigerate for at least 8 hours and up to 3 days.\n" +
                    "\n" +
                    "Divide the pudding between 2 bowls, layering each serving with 1/4 cup of the remaining fruit, 1/4 cup yogurt and 2 tablespoons granola."), (
                    "343" +
                    " Calories\n" +
                    "15g" +
                    " Fat\n" +
                    "39g" +
                    " Carbs\n" +
                    "14g" +
                    " Protein")
        )

        var recipeDe8 = FoodRecipe(
            "¾ cup whole-wheat pastry flour\n" +
                    "\n" +
                    "¼ cup cocoa powder\n" +
                    "\n" +
                    "1 ½ teaspoons ground cinnamon\n" +
                    "\n" +
                    "½ teaspoon baking soda\n" +
                    "\n" +
                    "½ teaspoon ground ginger\n" +
                    "\n" +
                    "¼ teaspoon salt\n" +
                    "\n" +
                    "¼ teaspoon ground nutmeg\n" +
                    "\n" +
                    "⅛ teaspoon ground cloves\n" +
                    "\n" +
                    "¾ cup granulated sugar\n" +
                    "\n" +
                    "½ cup unseasoned pumpkin puree\n" +
                    "\n" +
                    "1 large egg, at room temperature\n" +
                    "\n" +
                    "2 tablespoons unsalted butter, melted and cooled to room temperature\n" +
                    "\n" +
                    "2 tablespoons vegetable oil\n" +
                    "\n" +
                    "½ teaspoon vanilla extract\n" +
                    "\n" +
                    "⅓ cup mini chocolate chips",
            ("Preheat oven to 350℉. Line an 8-inch-square metal baking pan with parchment paper, allowing it to overhang the edges. Coat with cooking spray.\n" +
                    "\n" +
                    "Whisk flour, cocoa, cinnamon, baking soda, ginger, salt, nutmeg and cloves in a medium bowl. Whisk sugar, pumpkin, egg, butter, oil and vanilla in a large bowl until well combined. Add the flour mixture, stirring until just combined. Fold in chocolate chips. Pour into the prepared pan and spread in an even layer.\n" +
                    "\n" +
                    "Bake until a toothpick inserted in the center comes out clean, 20 to 25 minutes. Let cool in the pan on a wire rack for 1 hour before cutting into squares."), (
                    "114" +
                    " Calories\n" +
                    "5g" +
                    " Fat\n" +
                    "18g" +
                    " Carbs\n" +
                    "2g" +
                    " Protein")
        )

        var recipeDe9 = FoodRecipe(
            "1 cup confectioners' sugar\n" +
                    "\n" +
                    "¼ cup unsweetened cocoa powder\n" +
                    "\n" +
                    "⅛ teaspoon salt\n" +
                    "\n" +
                    "2 large egg whites\n" +
                    "\n" +
                    "1 teaspoon vanilla extract\n" +
                    "\n" +
                    "½ cup bittersweet chocolate chips or chunks, chopped",
            ("Preheat oven to 350 degrees F. Line 2 large baking sheets with parchment paper. Coat the paper with cooking spray.\n" +
                    "\n" +
                    "Combine confectioners' sugar, cocoa powder and salt in a medium bowl. Beat egg whites in a large mixing bowl with an electric mixer until soft peaks form. Add vanilla. Fold in the cocoa powder mixture with a rubber spatula until combined. Fold in chocolate chips (or chunks).\n" +
                    "\n" +
                    "Drop the batter by tablespoonfuls onto the prepared baking sheets, leaving about 2 inches between each cookie. Bake, one sheet at a time, until the cookies are just beginning to crack on top, 12 to 14 minutes. Let cool slightly on the pan before transferring to a wire rack to cool completely."), (
                    "67" +
                    " Calories\n" +
                    "2g" +
                    " Fat\n" +
                    "13g" +
                    " Carbs\n" +
                    "1g" +
                    " Protein")
        )

        var recipeDe10 = FoodRecipe(
            "1 ½ cups all-purpose flour\n" +
                    "\n" +
                    "1 cup old-fashioned oats\n" +
                    "\n" +
                    "1 cup packed light brown sugar\n" +
                    "\n" +
                    "1 teaspoon grated lemon zest\n" +
                    "\n" +
                    "¾ teaspoon baking powder\n" +
                    "\n" +
                    "½ teaspoon salt\n" +
                    "\n" +
                    "½ teaspoon ground cinnamon\n" +
                    "\n" +
                    "¼ teaspoon ground nutmeg\n" +
                    "\n" +
                    "3 tablespoons canola oil\n" +
                    "\n" +
                    "¼ cup apple juice concentrate, thawed\n" +
                    "\n" +
                    "2 medium tart apples, such as Granny Smith, peeled and thinly sliced\n" +
                    "\n" +
                    "¼ cup coarsely chopped walnuts",
            ("Preheat oven to 350°F. Coat a 9-inch-square baking pan with cooking spray.\n" +
                    "\n" +
                    "Combine flour, oats, brown sugar, lemon zest, baking powder, salt, cinnamon and nutmeg in a large bowl. Work in oil and apple juice concentrate with your fingers until coarse crumbs form.\n" +
                    "\n" +
                    "Firmly press 2 cups of the oat mixture into the prepared pan. Arrange apples over the crust in three rows. Mix walnuts into the remaining oat mixture. Sprinkle the walnut mixture evenly over the apples and pat firmly into an even layer.\n" +
                    "\n" +
                    "Bake until the top is golden brown and the apples are tender when pierced with a sharp knife, 30 to 35 minutes. Cool completely on a wire rack."), (
                    "160" +
                    " Calories\n" +
                    "4g" +
                    " Fat\n" +
                    "29g" +
                    " Carbs\n" +
                    "2g" +
                    " Protein")
        )

        var recipeSn1 = FoodRecipe(
            "2 ounces grated fresh Parmesan cheese (about 1/2 cup)\n" +
                    "\n" +
                    "¼ teaspoon freshly ground black pepper",
            ("Preheat oven to 400°.\n" +
                    "\n" +
                    "Line a large baking sheet with parchment paper. Spoon cheese by tablespoonfuls 2 inches apart on prepared baking sheet. Spread each mound to a 2-inch diameter. Sprinkle mounds with pepper. Bake at 400° for 6 to 8 minutes or until crisp and golden. Cool completely on baking sheet. Remove from baking sheet using a thin spatula.\n" +
                    "\n" +
                    "Kids Can Help: Let kids sprinkle the grated cheese onto the baking sheets."), (
                    "31" +
                    " Calories\n" +
                    "2g" +
                    " Fat\n" +
                    "0g" +
                    " Carbs\n" +
                    "3g" +
                    " Protein")
        )

        var recipeSn2 = FoodRecipe(
            "2 cups all-purpose flour\n" +
                    "\n" +
                    "¾ teaspoon baking soda\n" +
                    "\n" +
                    "½ teaspoon salt\n" +
                    "\n" +
                    "1 cup sugar\n" +
                    "\n" +
                    "¼ cup butter, softened\n" +
                    "\n" +
                    "2 large eggs\n" +
                    "\n" +
                    "1 ½ cups mashed ripe banana (about 3 bananas)\n" +
                    "\n" +
                    "⅓ cup plain low-fat yogurt\n" +
                    "\n" +
                    "1 teaspoon vanilla extract\n" +
                    "\n" +
                    "Cooking spray",
            ("Preheat oven to 350°F.\n" +
                    "\n" +
                    "Lightly spoon flour into dry measuring cups; level with a knife. Combine the flour, baking soda and salt, stirring with a whisk.\n" +
                    "\n" +
                    "Place sugar and butter in a large bowl, and beat with a mixer at medium speed until well blended (about 1 minute). Add the eggs, 1 at a time, beating well after each addition. Add banana, yogurt and vanilla; beat until blended. Add flour mixture; beat at low speed just until moist. Spoon batter into an 8 1/2 x 4 1/2-inch loaf pan coated with cooking spray.\n" +
                    "\n" +
                    "Bake at 350°F for 1 hour or until a wooden pick inserted in center comes out clean. Cool 10 minutes in pan on a wire rack; remove from pan. Cool completely on wire rack."), (
                    "187" +
                    " Calories\n" +
                    "4g" +
                    " Fat\n" +
                    "34g" +
                    " Carbs\n" +
                    "3g" +
                    " Protein")
        )

        var recipeSn3 = FoodRecipe(
            "½ cup packed brown sugar\n" +
                    "\n" +
                    "1 large egg white, beaten\n" +
                    "\n" +
                    "1 teaspoon salt\n" +
                    "\n" +
                    "½ teaspoon vanilla extract\n" +
                    "\n" +
                    "¼ teaspoon ground cinnamon\n" +
                    "\n" +
                    "12 ounces blanched or raw hazelnuts (about 3 cups)",
            ("Preheat oven to 250°F.\n" +
                    "\n" +
                    "Whisk together brown sugar, egg white, salt, vanilla and cinnamon in a large bowl. Add nuts; toss to coat. Spread nut mixture in a single layer on a parchment paper-lined baking sheet. Bake at 250°F until crisp and toasted, about 50 minutes, stirring every 15 minutes. Remove from oven; cool completely. Store nuts in an airtight container up to 1 week."), (
                    "132" +
                    " Calories\n" +
                    "11g" +
                    " Fat\n" +
                    "8g" +
                    " Carbs\n" +
                    "3g" +
                    " Protein")
        )

        var recipeSn4 = FoodRecipe(
            "1 medium Potatoes, russet, flesh and skin, raw\n" +
                    "\n" +
                    "1 tablespoon canola oil\n" +
                    "\n" +
                    "¼ teaspoon sea salt\n" +
                    "\n" +
                    "¼ teaspoon freshly ground black pepper\n" +
                    "\n" +
                    "Canola oil\n" +
                    "\n" +
                    "1 teaspoon chopped fresh rosemary",
            ("In a large bowl of cold water, soak potato slices for 20 minutes. Drain potatoes; pat dry with paper towels.\n" +
                    "\n" +
                    "Wipe bowl dry; then add oil, salt and pepper. Add potatoes; toss gently to coat.\n" +
                    "\n" +
                    "Lightly coat air fryer basket with cooking spray. Place half of the potato slices in the basket and cook in two batches at 375°F until cooked through and crispy, about 25 to 30 minutes.\n" +
                    "\n" +
                    "Using a pair of tongs, carefully remove chips from air fryer to plate. Sprinkle over rosemary; serve immediately or store in an airtight plastic container."), (
                    "100" +
                    " Calories\n" +
                    "4g" +
                    " Fat\n" +
                    "15g" +
                    " Carbs\n" +
                    "2g" +
                    " Protein")
        )

        var recipeSn5 = FoodRecipe(
            "2 ½ cups old-fashioned rolled oats\n" +
                    "\n" +
                    "¼ cup unsalted raw pepitas (pumpkin seed kernels)\n" +
                    "\n" +
                    "⅓ cup unsalted raw hazelnuts\n" +
                    "\n" +
                    "16 pitted Medjool dates, chopped\n" +
                    "\n" +
                    "½ cup smooth natural peanut butter\n" +
                    "\n" +
                    "3 tablespoons agave syrup\n" +
                    "\n" +
                    "½ teaspoon vanilla extract\n" +
                    "\n" +
                    "3 tablespoons dried currants\n" +
                    "\n" +
                    "2 teaspoons chia seeds\n" +
                    "\n" +
                    "¼ teaspoon ground cinnamon\n" +
                    "\n" +
                    "¼ teaspoon salt",
            ("Position rack in center of oven; preheat to 350°F. Line an 8-inch-square baking pan with parchment paper, leaving a 2-inch overhang on 2 sides.\n" +
                    "\n" +
                    "Spread oats and pepitas evenly on a small rimmed baking sheet. Spread hazelnuts on a separate small rimmed baking sheet. Bake both baking sheets on the center rack until golden and fragrant, 10 to 15 minutes. Let cool on the baking sheets for 5 minutes.\n" +
                    "\n" +
                    "Transfer the hazelnuts to a clean kitchen towel and rub to remove the majority of skins (discard the skins). Coarsely chop the nuts; set aside.\n" +
                    "\n" +
                    "Place dates in a food processor; process until smooth, about 1 minute, stopping to scrape down sides as needed. Add peanut butter, agave and vanilla; process until combined, about 30 seconds. Transfer the mixture to a large bowl. Add the toasted oats and pepitas, the chopped hazelnuts and currants, chia seeds, cinnamon and salt; stir to fully combine, using your hands if needed.\n" +
                    "\n" +
                    "Press the mixture evenly into the prepared baking pan. Freeze until firm, about 10 minutes.\n" +
                    "\n" +
                    "Using the parchment overhangs as handles, lift the bars out of the pan and place on a cutting board. Slice into 12 (2-by-2¾-inch) bars. Refrigerate in an airtight container until firm, about 1 hour, before serving."), (
                    "285" +
                    " Calories\n" +
                    "10g" +
                    " Fat\n" +
                    "44g" +
                    " Carbs\n" +
                    "7g" +
                    " Protein")
        )

        var recipeSn6 = FoodRecipe(
            "1 medium orange, peeled and quartered\n" +
                    "\n" +
                    "3 kale leaves\n" +
                    "\n" +
                    "1 medium apple, cut into wedges\n" +
                    "\n" +
                    "1 medium carrot, peeled\n" +
                    "\n" +
                    "1 large beet, peeled and cut into wedges\n" +
                    "\n" +
                    "1 1-inch piece peeled fresh ginger\n" +
                    "\n" +
                    "Ice cubes (optional)",
            ("Working in this order, process orange, kale, apple, carrot, beet and ginger through a juicer according to the manufacturer's directions. (No juicer? See Tip.)\n" +
                    "\n" +
                    "Fill 2 glasses with ice, if desired, and pour the juice into the glasses. Serve immediately."), (
                    "100" +
                    " Calories\n" +
                    "1g" +
                    " Fat\n" +
                    "21g" +
                    " Carbs\n" +
                    "2g" +
                    " Protein")
        )

        var recipeSn7 = FoodRecipe(
            "½ cup spaghetti squash seeds (from 2 medium squash; see Tip)\n" +
                    "\n" +
                    "½ teaspoon extra-virgin olive oil\n" +
                    "\n" +
                    "1 teaspoon maple syrup\n" +
                    "\n" +
                    "½ teaspoon ground cumin\n" +
                    "\n" +
                    "½ teaspoon ground cinnamon\n" +
                    "\n" +
                    "⅛ teaspoon kosher salt",
            ("Preheat oven to 300°F. Line a large rimmed baking sheet with parchment paper.\n" +
                    "\n" +
                    "Toss spaghetti squash seeds with oil, maple syrup, cumin, cinnamon and salt in a small bowl. Spread on the prepared baking sheet in an even layer. Bake for 15 minutes. Stir the seeds and continue baking until golden and crispy, 10 to 15 minutes."), (
                    "203" +
                    " Calories\n" +
                    "17g" +
                    " Fat\n" +
                    "6g" +
                    " Carbs\n" +
                    "10g" +
                    " Protein")
        )

        var recipeSn8 = FoodRecipe(
            "1 ¾ cups almond flour\n" +
                    "\n" +
                    "¼ cup coconut flour\n" +
                    "\n" +
                    "1 tablespoon baking powder\n" +
                    "\n" +
                    "¼ teaspoon baking soda\n" +
                    "\n" +
                    "¼ teaspoon salt\n" +
                    "\n" +
                    "1 cup blueberries\n" +
                    "\n" +
                    "3 large eggs\n" +
                    "\n" +
                    "½ cup reduced-fat milk\n" +
                    "\n" +
                    "⅓ cup plus 2 tablespoons light brown sugar\n" +
                    "\n" +
                    "¼ cup avocado oil\n" +
                    "\n" +
                    "1 ½ teaspoons vanilla extract",
            ("Preheat oven to 350 degrees F. Generously coat a muffin tin with cooking spray.\n" +
                    "\n" +
                    "Sift almond flour, coconut flour, baking powder, baking soda and salt together in a large bowl. Add blueberries and toss to coat. Whisk eggs, milk, brown sugar, oil and vanilla in a medium bowl. Add to the dry ingredients and stir until combined. Divide the batter among the muffin cups (about 1/4 cup batter per cup).\n" +
                    "\n" +
                    "Bake the muffins until lightly browned around the edges and a toothpick inserted in the center comes out clean, 20 to 25 minutes. Let cool in the pan on a wire rack for 20 minutes. Run a knife around the edges and remove from the tin to cool completely."), (
                    "204" +
                    " Calories\n" +
                    "15g" +
                    " Fat\n" +
                    "15g" +
                    " Carbs\n" +
                    "6g" +
                    " Protein")
        )

        var recipeSn9 = FoodRecipe(
            "1 (15 ounce) can no-salt-added chickpeas\n" +
                    "\n" +
                    "¼ cup tahini\n" +
                    "\n" +
                    "¼ cup extra-virgin olive oil\n" +
                    "\n" +
                    "¼ cup lemon juice\n" +
                    "\n" +
                    "1 clove garlic\n" +
                    "\n" +
                    "1 teaspoon ground cumin\n" +
                    "\n" +
                    "½ teaspoon chili powder\n" +
                    "\n" +
                    "½ teaspoon salt",
            ("Drain chickpeas, reserving 1/4 cup of the liquid. Transfer the chickpeas and the reserved liquid to a food processor. Add tahini, oil, lemon juice, garlic, cumin, chili powder and salt. Puree until very smooth, 2 to 3 minutes."), (
                    "155" +
                    " Calories\n" +
                    "12g" +
                    " Fat\n" +
                    "10g" +
                    " Carbs\n" +
                    "4g" +
                    " Protein")
        )

        var recipeSn10 = FoodRecipe(
            "3 cups whole-milk plain Greek yogurt\n" +
                    "\n" +
                    "¼ cup pure maple syrup or honey\n" +
                    "\n" +
                    "1 teaspoon vanilla extract\n" +
                    "\n" +
                    "1 ½ cups sliced strawberries\n" +
                    "\n" +
                    "¼ cup mini chocolate chips",
            ("Line a large rimmed baking sheet with parchment paper.\n" +
                    "\n" +
                    "Stir yogurt, maple syrup (or honey) and vanilla in a medium bowl. Spread on the prepared baking sheet into a 10-by-15-inch rectangle. Scatter the strawberries on top and sprinkle with chocolate chips.\n" +
                    "\n" +
                    "Freeze until very firm, at least 3 hours. To serve, cut or break into 32 pieces."), (
                    "34" +
                    " Calories\n" +
                    "1g" +
                    " Fat\n" +
                    "4g" +
                    " Carbs\n" +
                    "2g" +
                    " Protein")
        )

    }
}