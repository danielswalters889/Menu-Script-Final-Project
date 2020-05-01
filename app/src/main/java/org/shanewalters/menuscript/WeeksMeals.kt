package org.shanewalters.menuscript

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WeeksMeals : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weeks_meals)
    }

    fun backButtonPressed(view: View) {
        val goBack = Intent(this, GroceryList::class.java)
        startActivity(goBack)
    }

    fun editButtonPressed (view: View) {
        val editMeal = Intent(this, MealBuilding::class.java)
        startActivity(editMeal)
    }

    fun listButtonPressed (view: View) {
        val listCheck = Intent(this, GroceryList::class.java)
        startActivity(listCheck)
    }

    fun exitButtonPressed (view: View) {
        val goAway = Intent(this, MainActivity::class.java)
        startActivity(goAway)
    }
}
