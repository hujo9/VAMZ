package com.example.healthylife

import android.content.Context
import androidx.core.content.ContextCompat

/**
 * The `BmiCalculator` class contains formulas for calculating BMI based on user input parameters.
 * It also includes a formula for calculating the user's ideal weight based on their entered weight.
 *
 * @param age Vek používateľa.
 * @param height Výška používateľa (cm).
 * @param weight Váha používateľa (kg).
 * @param isMale Pohlavie používateľa.
 */
class BmiCalculator(private val age: Int, private val height: Float, private val weight: Float, private val isMale: Boolean) {

    /**
     * Vypočíta BMI na základe zadaných parametrov.
     *
     * @return vráti vypočítané BMI.
     */
    fun calculateBmi(): Float {
        val heightMeters = height / 100f
        return weight / (heightMeters * heightMeters)
    }

    /**
     * Vypočíta ideálnu váhu používateľa na základe výšky.
     *
     * @param height Výška používateľa (cm).
     * @return Ideálna váha používateľa.
     */
    fun calculateIdealWeight(height: Float): Float {
        return (height - 100) - ((height - 150) / 4)
    }

    /**
     * Vráti BMI kategóriu na základe vypočítaného BMI
     * Zmení farbu stringu na základe kategórie.
     *
     * @param context Kontext aplikácie.
     * @return BMI kategória ako string.
     */
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