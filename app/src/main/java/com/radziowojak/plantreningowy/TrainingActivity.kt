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
            trening_b.visibility = View.GONE

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
            
            /*ohp1*/
            ohp1razy.text = sharedprefs.prefs.getInt("ohp1razy", 0).toString()
            ohp1ciezar.text = sharedprefs.prefs.getFloat("ohp1ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("ohp1niepelne", false))
            {
                ohp1niepelne.visibility = View.VISIBLE
                terazohp1razy.setText(ohp1razy.text)
                terazohp1ciezar.setText(ohp1ciezar.text)
            }
            else
            {
                ohp1niepelne.visibility = View.GONE
                if((ohp1razy.text).toString().toInt() >= 7)
                {
                    terazohp1razy.setText("5")
                    terazohp1ciezar.setText(((ohp1ciezar.text as String).toFloat() + 2.5).toString())
                }
                else
                {
                    terazohp1razy.setText(((ohp1razy.text as String).toInt() + 1).toString())
                    terazohp1ciezar.setText(ohp1ciezar.text)
                }
            }
            
            /*ohp2*/
            ohp2razy.text = sharedprefs.prefs.getInt("ohp2razy", 0).toString()
            ohp2ciezar.text = sharedprefs.prefs.getFloat("ohp2ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("ohp2niepelne", false))
            {
                ohp2niepelne.visibility = View.VISIBLE
                terazohp2razy.setText(ohp2razy.text)
                terazohp2ciezar.setText(ohp2ciezar.text)
            }
            else
            {
                ohp2niepelne.visibility = View.GONE
                if((ohp2razy.text).toString().toInt() >= 7)
                {
                    terazohp2razy.setText("5")
                    terazohp2ciezar.setText(((ohp2ciezar.text as String).toFloat() + 2.5).toString())
                }
                else
                {
                    terazohp2razy.setText(((ohp2razy.text as String).toInt() + 1).toString())
                    terazohp2ciezar.setText(ohp2ciezar.text)
                }
            }

            /*przysiady1*/
            przysiady1razy.text = sharedprefs.prefs.getInt("przysiady1razy", 0).toString()
            przysiady1ciezar.text = sharedprefs.prefs.getFloat("przysiady1ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("przysiady1niepelne", false))
            {
                przysiady1niepelne.visibility = View.VISIBLE
                terazprzysiady1razy.setText(przysiady1razy.text)
                terazprzysiady1ciezar.setText(przysiady1ciezar.text)
            }
            else
            {
                przysiady1niepelne.visibility = View.GONE
                if((przysiady1razy.text).toString().toInt() >= 7)
                {
                    terazprzysiady1razy.setText("5")
                    terazprzysiady1ciezar.setText(((przysiady1ciezar.text as String).toFloat() + 2.5).toString())
                }
                else
                {
                    terazprzysiady1razy.setText(((przysiady1razy.text as String).toInt() + 1).toString())
                    terazprzysiady1ciezar.setText(przysiady1ciezar.text)
                }
            }

            /*przysiady2*/
            przysiady2razy.text = sharedprefs.prefs.getInt("przysiady2razy", 0).toString()
            przysiady2ciezar.text = sharedprefs.prefs.getFloat("przysiady2ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("przysiady2niepelne", false))
            {
                przysiady2niepelne.visibility = View.VISIBLE
                terazprzysiady2razy.setText(przysiady2razy.text)
                terazprzysiady2ciezar.setText(przysiady2ciezar.text)
            }
            else
            {
                przysiady2niepelne.visibility = View.GONE
                if((przysiady2razy.text).toString().toInt() >= 7)
                {
                    terazprzysiady2razy.setText("5")
                    terazprzysiady2ciezar.setText(((przysiady2ciezar.text as String).toFloat() + 2.5).toString())
                }
                else
                {
                    terazprzysiady2razy.setText(((przysiady2razy.text as String).toInt() + 1).toString())
                    terazprzysiady2ciezar.setText(przysiady2ciezar.text)
                }
            }
            /*bokbarku1*/
            bokbarku1razy.text = sharedprefs.prefs.getInt("bokbarku1razy", 0).toString()
            bokbarku1ciezar.text = sharedprefs.prefs.getFloat("bokbarku1ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("bokbarku1niepelne", false))
            {
                bokbarku1niepelne.visibility = View.VISIBLE
                terazbokbarku1razy.setText(bokbarku1razy.text)
                terazbokbarku1ciezar.setText(bokbarku1ciezar.text)
            }
            else
            {
                bokbarku1niepelne.visibility = View.GONE
                if((bokbarku1razy.text).toString().toInt() >= 12)
                {
                    terazbokbarku1razy.setText("8")
                    terazbokbarku1ciezar.setText(((bokbarku1ciezar.text as String).toFloat() + 2).toString())
                }
                else
                {
                    terazbokbarku1razy.setText(((bokbarku1razy.text as String).toInt() + 1).toString())
                    terazbokbarku1ciezar.setText(bokbarku1ciezar.text)
                }
            }

            /*bokbarku2*/
            bokbarku2razy.text = sharedprefs.prefs.getInt("bokbarku2razy", 0).toString()
            bokbarku2ciezar.text = sharedprefs.prefs.getFloat("bokbarku2ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("bokbarku2niepelne", false))
            {
                bokbarku2niepelne.visibility = View.VISIBLE
                terazbokbarku2razy.setText(bokbarku2razy.text)
                terazbokbarku2ciezar.setText(bokbarku2ciezar.text)
            }
            else
            {
                bokbarku2niepelne.visibility = View.GONE
                if((bokbarku2razy.text).toString().toInt() >= 12)
                {
                    terazbokbarku2razy.setText("8")
                    terazbokbarku2ciezar.setText(((bokbarku2ciezar.text as String).toFloat() + 2).toString())
                }
                else
                {
                    terazbokbarku2razy.setText(((bokbarku2razy.text as String).toInt() + 1).toString())
                    terazbokbarku2ciezar.setText(bokbarku2ciezar.text)
                }
            }
            /*dipy1*/
            dipy1razy.text = sharedprefs.prefs.getInt("dipy1razy", 0).toString()
            dipy1ciezar.text = sharedprefs.prefs.getFloat("dipy1ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("dipy1niepelne", false))
            {
                dipy1niepelne.visibility = View.VISIBLE
                terazdipy1razy.setText(dipy1razy.text)
                terazdipy1ciezar.setText(dipy1ciezar.text)
            }
            else
            {
                dipy1niepelne.visibility = View.GONE
                if((dipy1razy.text).toString().toInt() >= 12)
                {
                    terazdipy1razy.setText("4")
                    terazdipy1ciezar.setText(((dipy1ciezar.text as String).toFloat() + 5).toString())
                }
                else
                {
                    terazdipy1razy.setText(((dipy1razy.text as String).toInt() + 1).toString())
                    terazdipy1ciezar.setText(dipy1ciezar.text)
                }
            }

            /*dipy2*/
            dipy2razy.text = sharedprefs.prefs.getInt("dipy2razy", 0).toString()
            dipy2ciezar.text = sharedprefs.prefs.getFloat("dipy2ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("dipy2niepelne", false))
            {
                dipy2niepelne.visibility = View.VISIBLE
                terazdipy2razy.setText(dipy2razy.text)
                terazdipy2ciezar.setText(dipy2ciezar.text)
            }
            else
            {
                dipy2niepelne.visibility = View.GONE
                if((dipy2razy.text).toString().toInt() >= 12)
                {
                    terazdipy2razy.setText("4")
                    terazdipy2ciezar.setText(((dipy2ciezar.text as String).toFloat() + 5).toString())
                }
                else
                {
                    terazdipy2razy.setText(((dipy2razy.text as String).toInt() + 1).toString())
                    terazdipy2ciezar.setText(dipy2ciezar.text)
                }
            }

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
                editor.putInt("ohp1razy", (terazohp1razy.text).toString().toInt())
                editor.putFloat("ohp1ciezar", (terazohp1ciezar.text).toString().toFloat())
                editor.putBoolean("ohp1niepelne", tnohp1.isChecked)
                editor.putInt("ohp2razy", (terazohp2razy.text).toString().toInt())
                editor.putFloat("ohp2ciezar", (terazohp2ciezar.text).toString().toFloat())
                editor.putBoolean("ohp2niepelne", tnohp2.isChecked)
                editor.putInt("przysiady1razy", (terazprzysiady1razy.text).toString().toInt())
                editor.putFloat("przysiady1ciezar", (terazprzysiady1ciezar.text).toString().toFloat())
                editor.putBoolean("przysiady1niepelne", tnprzysiady1.isChecked)
                editor.putInt("przysiady2razy", (terazprzysiady2razy.text).toString().toInt())
                editor.putFloat("przysiady2ciezar", (terazprzysiady2ciezar.text).toString().toFloat())
                editor.putBoolean("przysiady2niepelne", tnprzysiady2.isChecked)
                editor.putInt("bokbarku1razy", (terazbokbarku1razy.text).toString().toInt())
                editor.putFloat("bokbarku1ciezar", (terazbokbarku1ciezar.text).toString().toFloat())
                editor.putBoolean("bokbarku1niepelne", tnbokbarku1.isChecked)
                editor.putInt("bokbarku2razy", (terazbokbarku2razy.text).toString().toInt())
                editor.putFloat("bokbarku2ciezar", (terazbokbarku2ciezar.text).toString().toFloat())
                editor.putBoolean("bokbarku2niepelne", tnbokbarku2.isChecked)
                editor.putInt("dipy1razy", (terazdipy1razy.text).toString().toInt())
                editor.putFloat("dipy1ciezar", (terazdipy1ciezar.text).toString().toFloat())
                editor.putBoolean("dipy1niepelne", tndipy1.isChecked)
                editor.putInt("dipy2razy", (terazdipy2razy.text).toString().toInt())
                editor.putFloat("dipy2ciezar", (terazdipy2ciezar.text).toString().toFloat())
                editor.putBoolean("dipy2niepelne", tndipy2.isChecked)
            } catch (nfe: NumberFormatException){}
        }
        else
        {
            training_name.text = "Trening B"
            trening_b.visibility = View.VISIBLE
            trening_a.visibility = View.GONE
        }

        save_btn.setOnClickListener {
            editor.putString("training_name", training_name.text.toString())
            editor.apply()
            finish()
        }

    }
}