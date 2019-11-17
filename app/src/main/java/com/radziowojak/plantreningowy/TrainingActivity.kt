package com.radziowojak.plantreningowy

import android.os.Bundle
import android.text.Editable
import android.view.View
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

            wyciskanie11.text = sharedprefs.prefs.getFloat("wyciskanie11", 0F).toString()
            wyciskanie12.text = sharedprefs.prefs.getFloat("wyciskanie12", 0F).toString()
            wyciskanie13.text = sharedprefs.prefs.getFloat("wyciskanie13", 0F).toString()
            wyciskanie14.text = sharedprefs.prefs.getFloat("wyciskanie14", 0F).toString()
            if(sharedprefs.prefs.getBoolean("wyciskanie1niepelne", false))
            {
                wyciskanie1niepelne.visibility = View.VISIBLE
                terazwyciskanie11.setText(wyciskanie11.text)
                terazwyciskanie12.setText(wyciskanie12.text)
                terazwyciskanie13.setText(wyciskanie13.text)
                terazwyciskanie14.setText(wyciskanie14.text)
            }
            else
            {
                wyciskanie1niepelne.visibility = View.GONE
                terazwyciskanie11.setText(((wyciskanie11.text as String).toFloat() + 2.5).toString())
                terazwyciskanie12.setText(((wyciskanie12.text as String).toFloat() + 2.5).toString())
                terazwyciskanie13.setText(((wyciskanie13.text as String).toFloat() + 2.5).toString())
                terazwyciskanie14.setText(((wyciskanie14.text as String).toFloat() + 2.5).toString())
            }

            wyciskanie21.text = sharedprefs.prefs.getFloat("wyciskanie21", 0F).toString()
            wyciskanie22.text = sharedprefs.prefs.getFloat("wyciskanie22", 0F).toString()
            wyciskanie23.text = sharedprefs.prefs.getFloat("wyciskanie23", 0F).toString()
            wyciskanie24.text = sharedprefs.prefs.getFloat("wyciskanie24", 0F).toString()
            if(sharedprefs.prefs.getBoolean("wyciskanie2niepelne", false))
            {
                wyciskanie2niepelne.visibility = View.VISIBLE
                terazwyciskanie21.setText(wyciskanie21.text)
                terazwyciskanie22.setText(wyciskanie22.text)
                terazwyciskanie23.setText(wyciskanie23.text)
                terazwyciskanie24.setText(wyciskanie24.text)
            }
            else
            {
                wyciskanie2niepelne.visibility = View.GONE
                terazwyciskanie21.setText(((wyciskanie21.text as String).toFloat() + 2.5).toString())
                terazwyciskanie22.setText(((wyciskanie22.text as String).toFloat() + 2.5).toString())
                terazwyciskanie23.setText(((wyciskanie23.text as String).toFloat() + 2.5).toString())
                terazwyciskanie24.setText(((wyciskanie24.text as String).toFloat() + 2.5).toString())
            }

            /*
            1razy.text = sharedprefs.prefs.getInt("1razy", 0).toString()
            1ciezar.text = sharedprefs.prefs.getFloat("1ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("1niepelne", false)) 1niepelne.visibility = View.GONE
            else 1niepelne.visibility = View.VISIBLE
            */
        }
        else
        {
            training_name.text = "Trening B"
        }
        editor.putString("training_name", training_name.text.toString())

        save_btn.setOnClickListener {
            editor.apply()
            finish()
        }

    }
}