package com.radziowojak.plantreningowy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        training_btn.setOnClickListener {
            val trainingIntent = Intent(this, TrainingActivity::class.java)
            // start your next activity
            startActivity(trainingIntent)
        }

        val sharedprefs = SharedPrefs(this)
        if(sharedprefs.prefs.getString("training_name", "") == "")
        {
            //stworzyć poprzedni trening
            val editor = sharedprefs.prefs.edit()
            editor.putString("training_name", "Trening B")
            editor.apply()
        }
    }
}
