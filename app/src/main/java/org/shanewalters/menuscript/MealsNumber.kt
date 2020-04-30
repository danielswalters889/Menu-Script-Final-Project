package org.shanewalters.menuscript

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_meals_number.*

class MealsNumber : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meals_number)
    }

    fun plusButtonPressed(view: View) {
        val numberOfMeals = mealNumber.text.toString().toInt()
        val number = (numberOfMeals+ 1)
        mealNumber.text=number.toString()
    }
    fun minusButtonPressed(view: View) {
        val numberOfMeals = mealNumber.text.toString().toInt()
        val number = (numberOfMeals - 1)
        mealNumber.text=number.toString()
    }

    fun backButtonPressed(view: View) {
        val goBack = Intent (this, MainActivity::class.java)
        startActivity(goBack)
    }

    fun continueButtonPressed(view:View) {
        val whereAmIGoing = Intent (this, MealBuilding::class.java)
        startActivity(whereAmIGoing)
    }
}
