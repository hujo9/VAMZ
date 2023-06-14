package com.example.healthylife

import android.app.Notification
import androidx.core.app.NotificationCompat
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

/* MyProgressActivity obsahuje základné informácie pre používateľa. Obsahuje jeho naposledy vypočítané BMI, vek, váhu a výšku.
Používateľ si taktiež môže menežovať svoj pitný režim na základe pridávania + a - pri počte pohárov od 0 do 7. Pri 7 pohároch
užívateľ nemôže pridávať dalšie pokiaľ neklikne na tlačídlo reset a neresetuje svoj počet pohárov. Pri vypitóm 7 poháry
používateľ dostabe notifikáciu "Your drinking intake has been reached". Dáta na tejto obrazovke sa zísakavajú pomocou sharedPreferences.
 */
class MyProgressActivity : AppCompatActivity() {
    private lateinit var ageValueTextView: TextView
    private lateinit var heightValueTextView: TextView
    private lateinit var weightValueTextView: TextView
    private lateinit var bmiValueTextView: TextView
    private lateinit var bmiCalculatorButton: Button
    private lateinit var recipesButton: Button
    private lateinit var glassCountTextView: TextView
    private lateinit var resetButton: Button
    private lateinit var amountDrankTextView: TextView
    private var glassCount = 0
    private lateinit var sharedPreferences: SharedPreferences

    /*Aktualizácia aktuálneho počtu pohárov. Počet je následne uložený pomocou sharedPreferences*/
    private fun updateGlassCount() {
        glassCountTextView.text = glassCount.toString()
        sharedPreferences.edit().putInt("glassCount", glassCount).apply()
        updateAmountDrank()
    }


    /*Vytvorenie notifikácie. Notifikácia sa nachádza na Channel1 a importance je vysoká. Je taktiež nastavený popis a obrázok ktorý aplikácia zobrazí*/
    private fun showNotification() {
        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                "HealthyLife",
                "Channel1",
                NotificationManager.IMPORTANCE_HIGH
            )
            notificationManager.createNotificationChannel(channel)
        }
        val notification: Notification = NotificationCompat.Builder(this, "HealthyLife")
            .setContentTitle("Drinking intake")
            .setContentText("Your drinking intake has been reached")
            .setSmallIcon(R.drawable.splash_icon)
            .build()
        notificationManager.notify(1, notification)
    }

    /*Aktualizácia koľko užívateľ vypil 1 pohár sa rovná 200ml.*/
    private fun updateAmountDrank() {
        val amountText = "${glassCount * 200}ml - 1400ml"
        amountDrankTextView.text = amountText
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*Pridelenie id z layoutu atributom, taktiež sa nahrá počet pohárov, ktoré boli vypité*/
        setContentView(R.layout.activity_my_progress)
        ageValueTextView = findViewById(R.id.ageValueTextView)
        heightValueTextView = findViewById(R.id.heightValueTextView)
        weightValueTextView = findViewById(R.id.weightValueTextView)
        bmiValueTextView = findViewById(R.id.bmiValueTextView)
        bmiCalculatorButton = findViewById(R.id.bmiCalculatorButton)
        recipesButton = findViewById(R.id.recipesButton)
        glassCountTextView = findViewById(R.id.glassCountTextView)
        resetButton = findViewById(R.id.resetButton)
        amountDrankTextView = findViewById(R.id.amountDrankTextView)
        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
        glassCount = sharedPreferences.getInt("glassCount", 0)

        updateGlassCount()
        val decrementButton: Button = findViewById(R.id.decrementButton)
        val incrementButton: Button = findViewById(R.id.incrementButton)

        /*Tlačidlá na zniženie a zvýšenie počtu pohárov. Ak poháre presiahnú počet 7 stanú sa tlačidlá nedostupné. */
        decrementButton.setOnClickListener {
            if (glassCount > 0 && glassCount < 7) {
                glassCount--
                updateGlassCount()
                resetButton.isEnabled = true
            } else if (glassCount == 7) {
                glassCount--
                updateGlassCount()
                resetButton.isEnabled = true
                showNotification()
                decrementButton.visibility = View.GONE
                incrementButton.visibility = View.GONE
            }
        }

        incrementButton.setOnClickListener {
            if (glassCount < 7) {
                glassCount++
                updateGlassCount()
                decrementButton.isEnabled = true
                if (glassCount == 7) {
                    showNotification()
                    decrementButton.visibility = View.GONE
                    incrementButton.visibility = View.GONE
                }
            }
        }

        /*Tlačidlá na reset pohárov. Pri resete sa nastaví počet na 0 a ak sú tlačidlá + a - zakryté, zobrazia sa.*/
        resetButton.setOnClickListener {
            glassCount = 0
            decrementButton.visibility = View.VISIBLE
            incrementButton.visibility = View.VISIBLE
            updateGlassCount()
            decrementButton.isEnabled = true
        }

        /*Tlačídla pre pohyb medzi aktivitami*/
        recipesButton.setOnClickListener {
            val intent = Intent(this, RecipesActivity::class.java)
            startActivity(intent)
        }

        bmiCalculatorButton.setOnClickListener {
            val intent = Intent(this, BmiCalculatorActivity::class.java)
            startActivity(intent)
        }

        /*Prevzatie uložených dát. Dáta sú nasledne upravené na Int a vypísané na layout, farba pre BMI číslo je nastavená
        * podľa BMI kategórie kde sa číslo nachádza.*/
        val age: Int = sharedPreferences.getInt("age", 0)
        val height: Float = sharedPreferences.getFloat("height", 0f)
        val weight: Float = sharedPreferences.getFloat("weight", 0f)
        val bmi: Float = sharedPreferences.getFloat("bmi", 0f)
        val bmiCategory: String? = sharedPreferences.getString("bmiCategory", null)

        val IntBmi = bmi.toInt()
        val IntHeight = height.toInt()
        val IntWeight = weight.toInt()

        ageValueTextView.text = "$age"
        heightValueTextView.text = "$IntHeight"
        weightValueTextView.text = "$IntWeight"
        bmiValueTextView.text = "$IntBmi"

        when (bmiCategory) {
            "Normal weight" -> bmiValueTextView.setTextColor(
                ContextCompat.getColor(
                    this,
                    R.color.normal_weight
                )
            )
            "Overweight" -> bmiValueTextView.setTextColor(
                ContextCompat.getColor(
                    this,
                    R.color.overweight
                )
            )
            "Underweight" -> bmiValueTextView.setTextColor(
                ContextCompat.getColor(
                    this,
                    R.color.underweight
                )
            )
            "Obese" -> bmiValueTextView.setTextColor(
                ContextCompat.getColor(
                    this,
                    R.color.obese
                )
            )
            else -> bmiValueTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
        }
    }
}