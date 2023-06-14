package com.example.healthylife


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/* Trieda obsahujúca tlačídlá na konkrétny typ jedla. Po kliknutí na tlačidlo sa nastáví hodnoda choice na príslušný typ jedla.
Tento atribút sa dalej využíva v aplikácii na zistenie kde sa používateľ nachádza.*/
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

    fun getChoice(): String {
        return choice
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes)

        /*Pridelenie id z layoutu atributom*/
        myProgressButton = findViewById(R.id.myProgressButton)
        bmiCalculatorButton = findViewById(R.id.bmiCalculatorButton)
        breakfast = findViewById(R.id.breakfastButton)
        mainDishesButton = findViewById(R.id.mainDishesButton)
        soupsButton = findViewById(R.id.soupsButton)
        saladsButton = findViewById(R.id.saladsButton)
        dessertsButton = findViewById(R.id.dessertsButton)
        snacksButton = findViewById(R.id.snacksButton)

        /*Tlačídla pre pohyb medzi aktivitami*/
        myProgressButton.setOnClickListener {
            val intent = Intent(this, MyProgressActivity::class.java)
            startActivity(intent)
        }

        bmiCalculatorButton.setOnClickListener {
            val intent = Intent(this, BmiCalculatorActivity::class.java)
            startActivity(intent)
        }

        /*Tlačídla, ktoŕe vyberajú typ jedla. Po kliknutí sa hodnota choice nastaví na vybraný typ a spustí sa aktivita FoodActivity kde je tento atribút následne využívaný. */
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