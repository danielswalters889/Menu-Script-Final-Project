package org.shanewalters.menuscript

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GroceryList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grocery_list)
    }

    fun backButtonPressed(view: View) {
        val goBack = Intent(this, PlanFinalize::class.java)
        startActivity(goBack)
    }

    fun mealsButtonPressed(view: View) {
        val goToList = Intent(this, WeeksMeals::class.java)
        startActivity(goToList)
    }

    fun exitButtonPressed(view: View) {
        val goAway = Intent(this, MainActivity::class.java)
        startActivity(goAway)
    }
}
