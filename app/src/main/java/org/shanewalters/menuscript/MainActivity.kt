package org.shanewalters.menuscript

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startButtonPressed(view: View) {
        val whereAmIGoing = Intent(this, MealsNumber::class.java)
        startActivity(whereAmIGoing)
    }
}
