package com.example.healthylife

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * RecipesActivity zobrazuje tlačítka na špecifický typ jedla.
 * Po kliknutí na jedno z tlačítok je hodnota choice nastavená na vybraný typ jedla.
 * Tento atribút je dalej používaný v aplikácii na nastavenie aplikácie podľa požiadavky používateľa.
 */
class RecipesActivity : AppCompatActivity() {
    private lateinit var myProgressButton: Button
    private lateinit var bmiCalculatorButton: Button
    private lateinit var breakfast: Button
    private lateinit var mainDishesButton: Button
    private lateinit var soupsButton: Button
    private lateinit var saladsButton: Button
    private lateinit var dessertsButton: Button
    private lateinit var snacksButton: Button
    private lateinit var choice: String

    /**
     * Vráti hodnotu choice.
     * @return hodnota choice
     */
    fun getChoice(): String {
        return choice
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes)

        myProgressButton = findViewById(R.id.myProgressButton)
        bmiCalculatorButton = findViewById(R.id.bmiCalculatorButton)
        breakfast = findViewById(R.id.breakfastButton)
        mainDishesButton = findViewById(R.id.mainDishesButton)
        soupsButton = findViewById(R.id.soupsButton)
        saladsButton = findViewById(R.id.saladsButton)
        dessertsButton = findViewById(R.id.dessertsButton)
        snacksButton = findViewById(R.id.snacksButton)

        myProgressButton.setOnClickListener {
            val intent = Intent(this, MyProgressActivity::class.java)
            startActivity(intent)
        }

        bmiCalculatorButton.setOnClickListener {
            val intent = Intent(this, BmiCalculatorActivity::class.java)
            startActivity(intent)
        }

        breakfast.setOnClickListener {
            choice = "breakfast"
            val intent = Intent(this, FoodActivity::class.java)
            intent.putExtra("foodType", getChoice())
            startActivity(intent)
        }

        mainDishesButton.setOnClickListener {
            choice = "mainDishes"
            val intent = Intent(this, FoodActivity::class.java)
            intent.putExtra("foodType", getChoice())
            startActivity(intent)
        }

        soupsButton.setOnClickListener {
            choice = "soups"
            val intent = Intent(this, FoodActivity::class.java)
            intent.putExtra("foodType", getChoice())
            startActivity(intent)
        }

        saladsButton.setOnClickListener {
            choice = "salads"
            val intent = Intent(this, FoodActivity::class.java)
            intent.putExtra("foodType", getChoice())
            startActivity(intent)
        }

        dessertsButton.setOnClickListener {
            choice = "desserts"
            val intent = Intent(this, FoodActivity::class.java)
            intent.putExtra("foodType", getChoice())
            startActivity(intent)
        }

        snacksButton.setOnClickListener {
            choice = "snacks"
            val intent = Intent(this, FoodActivity::class.java)
            intent.putExtra("foodType", getChoice())
            startActivity(intent)
        }
    }
}