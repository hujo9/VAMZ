package com.example.healthylife

import android.content.Context
import androidx.core.content.ContextCompat

/* Trieda BmiCalculator obsahuje vzorce na výpočet BMI na základe zadaných parametrov od používateľa.
Taktiež obsahuje vzorec na výpočet ideálnej váhy používateľa na základe jeho zadanéj váhy.*/
class BmiCalculator(private val age: Int, private val height: Float, private val weight: Float, private val isMale: Boolean) {
    fun calculateBmi(): Float {
        val heightMeters = height / 100f
        return weight / (heightMeters * heightMeters)
    }

    fun calculateIdealWeight(height: Float): Float {
        return (height - 100) - ((height - 150) / 4)
    }

    /*Funkcia nastaví farbu na základe vypočítaného BMI*/
    fun getBmiCategory(context: Context): String {
        val bmi = calculateBmi()
        return when {
            bmi < 18.5f -> {
                ContextCompat.getColor(context, R.color.underweight)
                "Underweight"
            }
            bmi < 25f -> {
                ContextCompat.getColor(context, R.color.normal_weight)
                "Normal weight"
            }
            bmi < 30f -> {
                ContextCompat.getColor(context, R.color.overweight)
                "Overweight"
            }
            else -> {
                ContextCompat.getColor(context, R.color.obese)
                "Obese"
            }
        }
    }
}