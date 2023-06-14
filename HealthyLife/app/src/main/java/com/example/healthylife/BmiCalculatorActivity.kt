package com.example.healthylife
import android.content.Intent
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.widget.*
import androidx.core.app.NotificationCompat

class BmiCalculatorActivity : AppCompatActivity() {
    private lateinit var age: EditText
    private lateinit var height: EditText
    private lateinit var weight: EditText
    private lateinit var male: RadioButton
    private lateinit var female: RadioButton
    private lateinit var calculateButton: Button
    private lateinit var myProgressButton: Button
    private lateinit var recipesButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var idealWeightTextView: TextView
    private lateinit var logo: ImageView


    /* Metóda showNotification vytvára notifikáciu na Channel1. Titul notifikácie je BMI Calculator a zobrazuje "Your changes have been saved".
    Notifikácia sa zobrazí vždy keď užívateľ stlačí tlačidlo Calculate.
     */
    private fun showNotification() {
        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                "HealthyLife",
                "Channel1",
                NotificationManager.IMPORTANCE_HIGH
            )
            notificationManager.createNotificationChannel(channel)
        }
        val notification: Notification = NotificationCompat.Builder(this, "HealthyLife")
            .setContentTitle("BMI Calculator")
            .setContentText("Your changes have been saved.")
            .setSmallIcon(R.drawable.splash_icon)
            .build()
        notificationManager.notify(1, notification)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)

        /*Pridelenie id z layoutu atributom, zobrazenie loga*/
        age = findViewById(R.id.ageEditText)
        height = findViewById(R.id.heightEditText)
        weight = findViewById(R.id.weightEditText)
        male = findViewById(R.id.maleRadioButton)
        female = findViewById(R.id.femaleRadioButton)
        calculateButton = findViewById(R.id.calculateButton)
        myProgressButton = findViewById(R.id.myProgressButton)
        recipesButton = findViewById(R.id.recipesButton)
        resultTextView = findViewById(R.id.resultTextView)
        idealWeightTextView = findViewById(R.id.idealWeightTextView)
        logo = findViewById(R.id.logo)
        logo.setImageResource(R.drawable.logo)

        /*Tlačídla pre pohyb medzi aktivitami*/
        myProgressButton.setOnClickListener {
            val intent = Intent(this, MyProgressActivity::class.java)
            startActivity(intent)
        }

        recipesButton.setOnClickListener {
            val intent = Intent(this, RecipesActivity::class.java)
            startActivity(intent)
        }

        /* calculateButton slúži na výpočet BMI na základe pridaných hodnôt. Skontroluje či všetky očakávané dáta boli vyplnené ak nie vyhodí Toast
        "Plase enter all required fields.". Rovnako funguje aj pri výbere pohlavia. Po vypočítaní BMI sa dáta pomocou shatedPreferences
        uložia. Vypíše sa výsledné BMI spolu s ideálnou váhou a váhovou kategóriou. Každá váhová kategória sa líši farbou textu.
         */
        calculateButton.setOnClickListener {
            val ageText = age.text.toString()
            val heightText = height.text.toString()
            val weightText = weight.text.toString()

            if (ageText.isEmpty() || heightText.isEmpty() || weightText.isEmpty()) {
                Toast.makeText(this, "Please enter all required fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val age = ageText.toInt()
            val height = heightText.toFloat()
            val weight = weightText.toFloat()
            val isMale = male.isChecked
            val isFemale = female.isChecked

            if (!isMale && !isFemale) {
                Toast.makeText(this, "Please select a gender", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val bmiCalculator = BmiCalculator(age, height, weight, isMale)
            val bmi = bmiCalculator.calculateBmi()
            val bmiCategory = bmiCalculator.getBmiCategory(this)
            val idealWeight = bmiCalculator.calculateIdealWeight(height)

            val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putInt("age", age)
            editor.putFloat("weight", weight)
            editor.putFloat("height", height)
            editor.putFloat("bmi", bmi)
            editor.putString("bmiCategory", bmiCategory)
            editor.putFloat("idealWeight", idealWeight)
            editor.apply()


            val categoryText = "Your BMI is %.1f, which is in the $bmiCategory category.".format(bmi)
            val spannableString = SpannableString(categoryText)
            val colorResId = when (bmiCategory) {
                "Underweight" -> R.color.underweight
                "Normal weight" -> R.color.normal_weight
                "Overweight" -> R.color.overweight
                "Obese" -> R.color.obese
                else -> R.color.white
            }

            val color = ContextCompat.getColor(this, colorResId)
            val colorSpan = ForegroundColorSpan(color)
            spannableString.setSpan(colorSpan, categoryText.indexOf(bmiCategory), categoryText.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            resultTextView.text = spannableString
            idealWeightTextView.text = "Your ideal weight is $idealWeight kg."
            showNotification()
        }


    }
}