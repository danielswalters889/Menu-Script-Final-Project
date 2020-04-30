package org.shanewalters.menuscript

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_meal_building.*

class MealBuilding : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_building)
    }

    fun checkButtonTapped(view: View) {
        chooseMealsButton.alpha = 1.0f
    }

    fun backButtonTapped(view: View) {
        val goBack = Intent (this, MealsNumber::class.java)
        startActivity(goBack)
    }

    fun exitButtonTapped(view: View) {
        val goAway = Intent (this, MainActivity::class.java)
        startActivity(goAway)
    }

    fun chooseMealButtonTapped(view: View) {
        val whereAmIGoing = Intent (this, PlanFinalize::class.java)
        startActivity(whereAmIGoing)
    }

}
