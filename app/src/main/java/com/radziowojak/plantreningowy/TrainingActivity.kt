package com.radziowojak.plantreningowy

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_training.*

class TrainingActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training)

        fun roundAndConvert(number: Float): String {return (Math.round(number/1.25) * 1.25).toString()}
        fun roundAndConvert(number: Double): String {return (Math.round(number/1.25) * 1.25).toString()}

        val sharedprefs = SharedPrefs(this)
        val lastTrainingName = sharedprefs.prefs.getString("training_name", "")
        val editor = sharedprefs.prefs.edit()
        if(lastTrainingName == "Trening B")
        {
            training_name.text = "Trening A"
            trening_a.visibility = View.VISIBLE
            trening_a.visibility = View.GONE

            /* wyciskanie1 */
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
            rwyciskanie11.text = roundAndConvert(((terazwyciskanie11.text).toString().toFloat() * 0.5))
            rwyciskanie12.text = roundAndConvert(((terazwyciskanie12.text).toString().toFloat() * 0.75))
            rwyciskanie13.text = roundAndConvert(((terazwyciskanie13.text).toString().toFloat() * 0.9))
            nastronew11.text = roundAndConvert(((((terazwyciskanie11.text).toString().toFloat() * 0.5) - 20) / 2))
            nastronew12.text = roundAndConvert(((((terazwyciskanie12.text).toString().toFloat() * 0.75) - 20) / 2))
            nastronew13.text = roundAndConvert(((((terazwyciskanie13.text).toString().toFloat() * 0.9) - 20) / 2))
            nastronew14.text = roundAndConvert((((terazwyciskanie11.text).toString().toFloat() - 20) / 2))
            nastronew15.text = roundAndConvert((((terazwyciskanie12.text).toString().toFloat() - 20) / 2))
            nastronew16.text = roundAndConvert((((terazwyciskanie13.text).toString().toFloat() - 20) / 2))
            nastronew17.text = roundAndConvert((((terazwyciskanie14.text).toString().toFloat() - 20) / 2))
            terazwyciskanie11.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {
                        rwyciskanie11.text = roundAndConvert(((terazwyciskanie11.text).toString().toFloat() * 0.5))
                        rwyciskanie12.text = roundAndConvert(((terazwyciskanie11.text).toString().toFloat() * 0.75))
                        rwyciskanie13.text = roundAndConvert(((terazwyciskanie11.text).toString().toFloat() * 0.9))

                        nastronew11.text = roundAndConvert(((((terazwyciskanie11.text).toString().toFloat() * 0.5) - 20) / 2))
                        nastronew12.text = roundAndConvert(((((terazwyciskanie12.text).toString().toFloat() * 0.75) - 20) / 2))
                        nastronew13.text = roundAndConvert(((((terazwyciskanie13.text).toString().toFloat() * 0.9) - 20) / 2))

                        nastronew14.text = roundAndConvert((((terazwyciskanie11.text).toString().toFloat() - 20) / 2))
                    } catch (nfe: NumberFormatException){}
                }
            })
            terazwyciskanie12.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {nastronew15.text = roundAndConvert((((terazwyciskanie12.text).toString().toFloat() - 20) / 2))} catch (nfe: NumberFormatException){}
                }
            })
            terazwyciskanie13.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {nastronew16.text = roundAndConvert((((terazwyciskanie13.text).toString().toFloat() - 20) / 2))} catch (nfe: NumberFormatException){}
                }
            })
            terazwyciskanie14.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {nastronew17.text = roundAndConvert((((terazwyciskanie14.text).toString().toFloat() - 20) / 2))} catch (nfe: NumberFormatException){}
                }
            })

            /* wyciskanie2 */
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
            rwyciskanie21.text = roundAndConvert(((terazwyciskanie21.text).toString().toFloat() * 0.5))
            rwyciskanie22.text = roundAndConvert(((terazwyciskanie22.text).toString().toFloat() * 0.75))
            rwyciskanie23.text = roundAndConvert(((terazwyciskanie23.text).toString().toFloat() * 0.9))
            nastronew21.text = roundAndConvert(((((terazwyciskanie21.text).toString().toFloat() * 0.5) - 20) / 2))
            nastronew22.text = roundAndConvert(((((terazwyciskanie22.text).toString().toFloat() * 0.75) - 20) / 2))
            nastronew23.text = roundAndConvert(((((terazwyciskanie23.text).toString().toFloat() * 0.9) - 20) / 2))
            nastronew24.text = roundAndConvert((((terazwyciskanie21.text).toString().toFloat() - 20) / 2))
            nastronew25.text = roundAndConvert((((terazwyciskanie22.text).toString().toFloat() - 20) / 2))
            nastronew26.text = roundAndConvert((((terazwyciskanie23.text).toString().toFloat() - 20) / 2))
            nastronew27.text = roundAndConvert((((terazwyciskanie24.text).toString().toFloat() - 20) / 2))
            terazwyciskanie21.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {
                        rwyciskanie21.text = roundAndConvert(((terazwyciskanie21.text).toString().toFloat() * 0.5))
                        rwyciskanie22.text = roundAndConvert(((terazwyciskanie21.text).toString().toFloat() * 0.75))
                        rwyciskanie23.text = roundAndConvert(((terazwyciskanie21.text).toString().toFloat() * 0.9))

                        nastronew21.text = roundAndConvert(((((terazwyciskanie21.text).toString().toFloat() * 0.5) - 20) / 2))
                        nastronew22.text = roundAndConvert(((((terazwyciskanie22.text).toString().toFloat() * 0.75) - 20) / 2))
                        nastronew23.text = roundAndConvert(((((terazwyciskanie23.text).toString().toFloat() * 0.9) - 20) / 2))

                        nastronew24.text = roundAndConvert((((terazwyciskanie21.text).toString().toFloat() - 20) / 2))
                    } catch (nfe: NumberFormatException){}
                }
            })
            terazwyciskanie22.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {nastronew25.text = roundAndConvert((((terazwyciskanie22.text).toString().toFloat() - 20) / 2))} catch (nfe: NumberFormatException){}
                }
            })
            terazwyciskanie23.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {nastronew26.text = roundAndConvert((((terazwyciskanie23.text).toString().toFloat() - 20) / 2))} catch (nfe: NumberFormatException){}
                }
            })
            terazwyciskanie24.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {nastronew27.text = roundAndConvert((((terazwyciskanie24.text).toString().toFloat() - 20) / 2))} catch (nfe: NumberFormatException){}
                }
            })

            /*
            1razy.text = sharedprefs.prefs.getInt("1razy", 0).toString()
            1ciezar.text = sharedprefs.prefs.getFloat("1ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("1niepelne", false)) 1niepelne.visibility = View.GONE
            else 1niepelne.visibility = View.VISIBLE
            */
            try {
                editor.putFloat("wyciskanie11", (terazwyciskanie11.text).toString().toFloat())
                editor.putFloat("wyciskanie12", (terazwyciskanie12.text).toString().toFloat())
                editor.putFloat("wyciskanie13", (terazwyciskanie13.text).toString().toFloat())
                editor.putFloat("wyciskanie14", (terazwyciskanie14.text).toString().toFloat())
                editor.putBoolean("wyciskanie1niepelne", tnwyciskanie1.isChecked)
                editor.putFloat("wyciskanie21", (terazwyciskanie21.text).toString().toFloat())
                editor.putFloat("wyciskanie22", (terazwyciskanie22.text).toString().toFloat())
                editor.putFloat("wyciskanie23", (terazwyciskanie23.text).toString().toFloat())
                editor.putFloat("wyciskanie24", (terazwyciskanie24.text).toString().toFloat())
                editor.putBoolean("wyciskanie2niepelne",  tnwyciskanie2.isChecked)
            } catch (nfe: NumberFormatException){}
        }
        else
        {
            training_name.text = "Trening B"
        }

        save_btn.setOnClickListener {
            editor.putString("training_name", training_name.text.toString())
            editor.apply()
            finish()
        }

    }
}