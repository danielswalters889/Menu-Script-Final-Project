package org.shanewalters.menuscript

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PlanFinalize : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plan_finalize)
    }

    fun backButtonPressed (view: View) {
        val goBack = Intent(this, MealBuilding::class.java)
        startActivity(goBack)
    }

    fun exitButtonPressed (view:View) {
        val goAway = Intent(this, MainActivity::class.java)
        startActivity(goAway)
    }

    fun listButtonPressed (view: View) {
        val whereAmIGoing = Intent (this, GroceryList::class.java)
        startActivity(whereAmIGoing)
    }
}
