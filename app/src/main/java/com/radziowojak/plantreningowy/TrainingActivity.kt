package com.radziowojak.plantreningowy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_training.*

class TrainingActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training)

        val sharedprefs = SharedPrefs(this)
        val lastTrainingName = sharedprefs.prefs.getString("training_name", "")
        val editor = sharedprefs.prefs.edit()
        if(lastTrainingName == "Trening B")
        {
            training_name.text = "Trening A"
        }
        else
        {
            training_name.text = "Trening B"
        }
        editor.putString("training_name", training_name.text.toString())
        editor.apply()

    }
}