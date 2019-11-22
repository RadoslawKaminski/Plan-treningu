package com.radziowojak.plantreningowy

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_training.*
import kotlin.math.round

class TrainingActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training)

        fun roundAndConvert(number: Float): String {return (round(number/1.25) * 1.25).toString()}
        fun roundAndConvert(number: Double): String {return (round(number/1.25) * 1.25).toString()}

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
            rwyciskanie12.text = roundAndConvert(((terazwyciskanie11.text).toString().toFloat() * 0.75))
            rwyciskanie13.text = roundAndConvert(((terazwyciskanie11.text).toString().toFloat() * 0.9))
            nastronew11.text = roundAndConvert(((((terazwyciskanie11.text).toString().toFloat() * 0.5) - 20) / 2))
            nastronew12.text = roundAndConvert(((((terazwyciskanie11.text).toString().toFloat() * 0.75) - 20) / 2))
            nastronew13.text = roundAndConvert(((((terazwyciskanie11.text).toString().toFloat() * 0.9) - 20) / 2))
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
                        nastronew12.text = roundAndConvert(((((terazwyciskanie11.text).toString().toFloat() * 0.75) - 20) / 2))
                        nastronew13.text = roundAndConvert(((((terazwyciskanie11.text).toString().toFloat() * 0.9) - 20) / 2))

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
            rwyciskanie22.text = roundAndConvert(((terazwyciskanie21.text).toString().toFloat() * 0.75))
            rwyciskanie23.text = roundAndConvert(((terazwyciskanie21.text).toString().toFloat() * 0.9))
            nastronew21.text = roundAndConvert(((((terazwyciskanie21.text).toString().toFloat() * 0.5) - 20) / 2))
            nastronew22.text = roundAndConvert(((((terazwyciskanie21.text).toString().toFloat() * 0.75) - 20) / 2))
            nastronew23.text = roundAndConvert(((((terazwyciskanie21.text).toString().toFloat() * 0.9) - 20) / 2))
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
                        nastronew22.text = roundAndConvert(((((terazwyciskanie21.text).toString().toFloat() * 0.75) - 20) / 2))
                        nastronew23.text = roundAndConvert(((((terazwyciskanie21.text).toString().toFloat() * 0.9) - 20) / 2))

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
        }
        else
        {
            training_name.text = "Trening B"
            trening_b.visibility = View.VISIBLE
            trening_a.visibility = View.GONE
            /* martwy1 */
            martwy11.text = sharedprefs.prefs.getFloat("martwy11", 0F).toString()
            martwy12.text = sharedprefs.prefs.getFloat("martwy12", 0F).toString()
            martwy13.text = sharedprefs.prefs.getFloat("martwy13", 0F).toString()
            martwy14.text = sharedprefs.prefs.getFloat("martwy14", 0F).toString()
            if(sharedprefs.prefs.getBoolean("martwy1niepelne", false))
            {
                martwy1niepelne.visibility = View.VISIBLE
                terazmartwy11.setText(martwy11.text)
                terazmartwy12.setText(martwy12.text)
                terazmartwy13.setText(martwy13.text)
                terazmartwy14.setText(martwy14.text)
            }
            else
            {
                martwy1niepelne.visibility = View.GONE
                terazmartwy11.setText(((martwy11.text as String).toFloat() + 2.5).toString())
                terazmartwy12.setText(((martwy12.text as String).toFloat() + 2.5).toString())
                terazmartwy13.setText(((martwy13.text as String).toFloat() + 2.5).toString())
                terazmartwy14.setText(((martwy14.text as String).toFloat() + 2.5).toString())
            }
            rmartwy11.text = roundAndConvert(((terazmartwy11.text).toString().toFloat() * 0.5))
            rmartwy12.text = roundAndConvert(((terazmartwy11.text).toString().toFloat() * 0.75))
            rmartwy13.text = roundAndConvert(((terazmartwy11.text).toString().toFloat() * 0.9))
            nastronem11.text = roundAndConvert(((((terazmartwy11.text).toString().toFloat() * 0.5) - 20) / 2))
            nastronem12.text = roundAndConvert(((((terazmartwy11.text).toString().toFloat() * 0.75) - 20) / 2))
            nastronem13.text = roundAndConvert(((((terazmartwy11.text).toString().toFloat() * 0.9) - 20) / 2))
            nastronem14.text = roundAndConvert((((terazmartwy11.text).toString().toFloat() - 20) / 2))
            nastronem15.text = roundAndConvert((((terazmartwy12.text).toString().toFloat() - 20) / 2))
            nastronem16.text = roundAndConvert((((terazmartwy13.text).toString().toFloat() - 20) / 2))
            nastronem17.text = roundAndConvert((((terazmartwy14.text).toString().toFloat() - 20) / 2))
            terazmartwy11.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {
                        rmartwy11.text = roundAndConvert(((terazmartwy11.text).toString().toFloat() * 0.5))
                        rmartwy12.text = roundAndConvert(((terazmartwy11.text).toString().toFloat() * 0.75))
                        rmartwy13.text = roundAndConvert(((terazmartwy11.text).toString().toFloat() * 0.9))

                        nastronem11.text = roundAndConvert(((((terazmartwy11.text).toString().toFloat() * 0.5) - 20) / 2))
                        nastronem12.text = roundAndConvert(((((terazmartwy11.text).toString().toFloat() * 0.75) - 20) / 2))
                        nastronem13.text = roundAndConvert(((((terazmartwy11.text).toString().toFloat() * 0.9) - 20) / 2))

                        nastronem14.text = roundAndConvert((((terazmartwy11.text).toString().toFloat() - 20) / 2))
                    } catch (nfe: NumberFormatException){}
                }
            })
            terazmartwy12.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {nastronem15.text = roundAndConvert((((terazmartwy12.text).toString().toFloat() - 20) / 2))} catch (nfe: NumberFormatException){}
                }
            })
            terazmartwy13.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {nastronem16.text = roundAndConvert((((terazmartwy13.text).toString().toFloat() - 20) / 2))} catch (nfe: NumberFormatException){}
                }
            })
            terazmartwy14.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {nastronem17.text = roundAndConvert((((terazmartwy14.text).toString().toFloat() - 20) / 2))} catch (nfe: NumberFormatException){}
                }
            })

            /* martwy2 */
            martwy21.text = sharedprefs.prefs.getFloat("martwy21", 0F).toString()
            martwy22.text = sharedprefs.prefs.getFloat("martwy22", 0F).toString()
            martwy23.text = sharedprefs.prefs.getFloat("martwy23", 0F).toString()
            martwy24.text = sharedprefs.prefs.getFloat("martwy24", 0F).toString()
            if(sharedprefs.prefs.getBoolean("martwy2niepelne", false))
            {
                martwy2niepelne.visibility = View.VISIBLE
                terazmartwy21.setText(martwy21.text)
                terazmartwy22.setText(martwy22.text)
                terazmartwy23.setText(martwy23.text)
                terazmartwy24.setText(martwy24.text)
            }
            else
            {
                martwy2niepelne.visibility = View.GONE
                terazmartwy21.setText(((martwy21.text as String).toFloat() + 2.5).toString())
                terazmartwy22.setText(((martwy22.text as String).toFloat() + 2.5).toString())
                terazmartwy23.setText(((martwy23.text as String).toFloat() + 2.5).toString())
                terazmartwy24.setText(((martwy24.text as String).toFloat() + 2.5).toString())
            }
            rmartwy21.text = roundAndConvert(((terazmartwy21.text).toString().toFloat() * 0.5))
            rmartwy22.text = roundAndConvert(((terazmartwy21.text).toString().toFloat() * 0.75))
            rmartwy23.text = roundAndConvert(((terazmartwy21.text).toString().toFloat() * 0.9))
            nastronem21.text = roundAndConvert(((((terazmartwy21.text).toString().toFloat() * 0.5) - 20) / 2))
            nastronem22.text = roundAndConvert(((((terazmartwy21.text).toString().toFloat() * 0.75) - 20) / 2))
            nastronem23.text = roundAndConvert(((((terazmartwy21.text).toString().toFloat() * 0.9) - 20) / 2))
            nastronem24.text = roundAndConvert((((terazmartwy21.text).toString().toFloat() - 20) / 2))
            nastronem25.text = roundAndConvert((((terazmartwy22.text).toString().toFloat() - 20) / 2))
            nastronem26.text = roundAndConvert((((terazmartwy23.text).toString().toFloat() - 20) / 2))
            nastronem27.text = roundAndConvert((((terazmartwy24.text).toString().toFloat() - 20) / 2))
            terazmartwy21.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {
                        rmartwy21.text = roundAndConvert(((terazmartwy21.text).toString().toFloat() * 0.5))
                        rmartwy22.text = roundAndConvert(((terazmartwy21.text).toString().toFloat() * 0.75))
                        rmartwy23.text = roundAndConvert(((terazmartwy21.text).toString().toFloat() * 0.9))

                        nastronem21.text = roundAndConvert(((((terazmartwy21.text).toString().toFloat() * 0.5) - 20) / 2))
                        nastronem22.text = roundAndConvert(((((terazmartwy21.text).toString().toFloat() * 0.75) - 20) / 2))
                        nastronem23.text = roundAndConvert(((((terazmartwy21.text).toString().toFloat() * 0.9) - 20) / 2))

                        nastronem24.text = roundAndConvert((((terazmartwy21.text).toString().toFloat() - 20) / 2))
                    } catch (nfe: NumberFormatException){}
                }
            })
            terazmartwy22.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {nastronem25.text = roundAndConvert((((terazmartwy22.text).toString().toFloat() - 20) / 2))} catch (nfe: NumberFormatException){}
                }
            })
            terazmartwy23.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {nastronem26.text = roundAndConvert((((terazmartwy23.text).toString().toFloat() - 20) / 2))} catch (nfe: NumberFormatException){}
                }
            })
            terazmartwy24.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {nastronem27.text = roundAndConvert((((terazmartwy24.text).toString().toFloat() - 20) / 2))} catch (nfe: NumberFormatException){}
                }
            })

            /*wioslowanie1*/
            wioslowanie1razy.text = sharedprefs.prefs.getInt("wioslowanie1razy", 0).toString()
            wioslowanie1ciezar.text = sharedprefs.prefs.getFloat("wioslowanie1ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("wioslowanie1niepelne", false))
            {
                wioslowanie1niepelne.visibility = View.VISIBLE
                terazwioslowanie1razy.setText(wioslowanie1razy.text)
                terazwioslowanie1ciezar.setText(wioslowanie1ciezar.text)
            }
            else
            {
                wioslowanie1niepelne.visibility = View.GONE
                if((wioslowanie1razy.text).toString().toInt() >= 7)
                {
                    terazwioslowanie1razy.setText("5")
                    terazwioslowanie1ciezar.setText(((wioslowanie1ciezar.text as String).toFloat() + 2.5).toString())
                }
                else
                {
                    terazwioslowanie1razy.setText(((wioslowanie1razy.text as String).toInt() + 1).toString())
                    terazwioslowanie1ciezar.setText(wioslowanie1ciezar.text)
                }
            }

            /*wioslowanie2*/
            wioslowanie2razy.text = sharedprefs.prefs.getInt("wioslowanie2razy", 0).toString()
            wioslowanie2ciezar.text = sharedprefs.prefs.getFloat("wioslowanie2ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("wioslowanie2niepelne", false))
            {
                wioslowanie2niepelne.visibility = View.VISIBLE
                terazwioslowanie2razy.setText(wioslowanie2razy.text)
                terazwioslowanie2ciezar.setText(wioslowanie2ciezar.text)
            }
            else
            {
                wioslowanie2niepelne.visibility = View.GONE
                if((wioslowanie2razy.text).toString().toInt() >= 7)
                {
                    terazwioslowanie2razy.setText("5")
                    terazwioslowanie2ciezar.setText(((wioslowanie2ciezar.text as String).toFloat() + 2.5).toString())
                }
                else
                {
                    terazwioslowanie2razy.setText(((wioslowanie2razy.text as String).toInt() + 1).toString())
                    terazwioslowanie2ciezar.setText(wioslowanie2ciezar.text)
                }
            }

            /*podciaganie1*/
            podciaganie1razy.text = sharedprefs.prefs.getInt("podciaganie1razy", 0).toString()
            podciaganie1ciezar.text = sharedprefs.prefs.getFloat("podciaganie1ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("podciaganie1niepelne", false))
            {
                podciaganie1niepelne.visibility = View.VISIBLE
                terazpodciaganie1razy.setText(podciaganie1razy.text)
                terazpodciaganie1ciezar.setText(podciaganie1ciezar.text)
            }
            else
            {
                podciaganie1niepelne.visibility = View.GONE
                if((podciaganie1razy.text).toString().toInt() >= 12)
                {
                    terazpodciaganie1razy.setText("4")
                    terazpodciaganie1ciezar.setText(((podciaganie1ciezar.text as String).toFloat() + 5).toString())
                }
                else
                {
                    terazpodciaganie1razy.setText(((podciaganie1razy.text as String).toInt() + 1).toString())
                    terazpodciaganie1ciezar.setText(podciaganie1ciezar.text)
                }
            }

            /*podciaganie2*/
            podciaganie2razy.text = sharedprefs.prefs.getInt("podciaganie2razy", 0).toString()
            podciaganie2ciezar.text = sharedprefs.prefs.getFloat("podciaganie2ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("podciaganie2niepelne", false))
            {
                podciaganie2niepelne.visibility = View.VISIBLE
                terazpodciaganie2razy.setText(podciaganie2razy.text)
                terazpodciaganie2ciezar.setText(podciaganie2ciezar.text)
            }
            else
            {
                podciaganie2niepelne.visibility = View.GONE
                if((podciaganie2razy.text).toString().toInt() >= 12)
                {
                    terazpodciaganie2razy.setText("4")
                    terazpodciaganie2ciezar.setText(((podciaganie2ciezar.text as String).toFloat() + 5).toString())
                }
                else
                {
                    terazpodciaganie2razy.setText(((podciaganie2razy.text as String).toInt() + 1).toString())
                    terazpodciaganie2ciezar.setText(podciaganie2ciezar.text)
                }
            }
            /*tylbarku1*/
            tylbarku1razy.text = sharedprefs.prefs.getInt("tylbarku1razy", 0).toString()
            tylbarku1ciezar.text = sharedprefs.prefs.getFloat("tylbarku1ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("tylbarku1niepelne", false))
            {
                tylbarku1niepelne.visibility = View.VISIBLE
                teraztylbarku1razy.setText(tylbarku1razy.text)
                teraztylbarku1ciezar.setText(tylbarku1ciezar.text)
            }
            else
            {
                tylbarku1niepelne.visibility = View.GONE
                if((tylbarku1razy.text).toString().toInt() >= 12)
                {
                    teraztylbarku1razy.setText("8")
                    teraztylbarku1ciezar.setText(((tylbarku1ciezar.text as String).toFloat() + 2).toString())
                }
                else
                {
                    teraztylbarku1razy.setText(((tylbarku1razy.text as String).toInt() + 1).toString())
                    teraztylbarku1ciezar.setText(tylbarku1ciezar.text)
                }
            }

            /*tylbarku2*/
            tylbarku2razy.text = sharedprefs.prefs.getInt("tylbarku2razy", 0).toString()
            tylbarku2ciezar.text = sharedprefs.prefs.getFloat("tylbarku2ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("tylbarku2niepelne", false))
            {
                tylbarku2niepelne.visibility = View.VISIBLE
                teraztylbarku2razy.setText(tylbarku2razy.text)
                teraztylbarku2ciezar.setText(tylbarku2ciezar.text)
            }
            else
            {
                tylbarku2niepelne.visibility = View.GONE
                if((tylbarku2razy.text).toString().toInt() >= 12)
                {
                    teraztylbarku2razy.setText("8")
                    teraztylbarku2ciezar.setText(((tylbarku2ciezar.text as String).toFloat() + 2).toString())
                }
                else
                {
                    teraztylbarku2razy.setText(((tylbarku2razy.text as String).toInt() + 1).toString())
                    teraztylbarku2ciezar.setText(tylbarku2ciezar.text)
                }
            }
            /*biceps1*/
            biceps1razy.text = sharedprefs.prefs.getInt("biceps1razy", 0).toString()
            biceps1ciezar.text = sharedprefs.prefs.getFloat("biceps1ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("biceps1niepelne", false))
            {
                biceps1niepelne.visibility = View.VISIBLE
                terazbiceps1razy.setText(biceps1razy.text)
                terazbiceps1ciezar.setText(biceps1ciezar.text)
            }
            else
            {
                biceps1niepelne.visibility = View.GONE
                if((biceps1razy.text).toString().toInt() >= 12)
                {
                    terazbiceps1razy.setText("8")
                    terazbiceps1ciezar.setText(((biceps1ciezar.text as String).toFloat() + 2.5).toString())
                }
                else
                {
                    terazbiceps1razy.setText(((biceps1razy.text as String).toInt() + 1).toString())
                    terazbiceps1ciezar.setText(biceps1ciezar.text)
                }
            }

            /*biceps2*/
            biceps2razy.text = sharedprefs.prefs.getInt("biceps2razy", 0).toString()
            biceps2ciezar.text = sharedprefs.prefs.getFloat("biceps2ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("biceps2niepelne", false))
            {
                biceps2niepelne.visibility = View.VISIBLE
                terazbiceps2razy.setText(biceps2razy.text)
                terazbiceps2ciezar.setText(biceps2ciezar.text)
            }
            else
            {
                biceps2niepelne.visibility = View.GONE
                if((biceps2razy.text).toString().toInt() >= 12)
                {
                    terazbiceps2razy.setText("8")
                    terazbiceps2ciezar.setText(((biceps2ciezar.text as String).toFloat() + 2.5).toString())
                }
                else
                {
                    terazbiceps2razy.setText(((biceps2razy.text as String).toInt() + 1).toString())
                    terazbiceps2ciezar.setText(biceps2ciezar.text)
                }
            }
            /*allahy1*/
            allahy1razy.text = sharedprefs.prefs.getInt("allahy1razy", 0).toString()
            allahy1ciezar.text = sharedprefs.prefs.getFloat("allahy1ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("allahy1niepelne", false))
            {
                allahy1niepelne.visibility = View.VISIBLE
                terazallahy1razy.setText(allahy1razy.text)
                terazallahy1ciezar.setText(allahy1ciezar.text)
            }
            else
            {
                allahy1niepelne.visibility = View.GONE
                if((allahy1razy.text).toString().toInt() >= 14)
                {
                    terazallahy1razy.setText("8")
                    terazallahy1ciezar.setText(((allahy1ciezar.text as String).toFloat() + 5).toString())
                }
                else
                {
                    terazallahy1razy.setText(((allahy1razy.text as String).toInt() + 1).toString())
                    terazallahy1ciezar.setText(allahy1ciezar.text)
                }
            }

            /*allahy2*/
            allahy2razy.text = sharedprefs.prefs.getInt("allahy2razy", 0).toString()
            allahy2ciezar.text = sharedprefs.prefs.getFloat("allahy2ciezar", 0F).toString()
            if(sharedprefs.prefs.getBoolean("allahy2niepelne", false))
            {
                allahy2niepelne.visibility = View.VISIBLE
                terazallahy2razy.setText(allahy2razy.text)
                terazallahy2ciezar.setText(allahy2ciezar.text)
            }
            else
            {
                allahy2niepelne.visibility = View.GONE
                if((allahy2razy.text).toString().toInt() >= 14)
                {
                    terazallahy2razy.setText("8")
                    terazallahy2ciezar.setText(((allahy2ciezar.text as String).toFloat() + 5).toString())
                }
                else
                {
                    terazallahy2razy.setText(((allahy2razy.text as String).toInt() + 1).toString())
                    terazallahy2ciezar.setText(allahy2ciezar.text)
                }
            }

        }

        save_btn.setOnClickListener {
            editor.putString("training_name", training_name.text.toString())

            if(lastTrainingName == "Trening B")
            {
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
                try {
                    editor.putFloat("martwy11", (terazmartwy11.text).toString().toFloat())
                    editor.putFloat("martwy12", (terazmartwy12.text).toString().toFloat())
                    editor.putFloat("martwy13", (terazmartwy13.text).toString().toFloat())
                    editor.putFloat("martwy14", (terazmartwy14.text).toString().toFloat())
                    editor.putBoolean("martwy1niepelne", tnmartwy1.isChecked)
                    editor.putFloat("martwy21", (terazmartwy21.text).toString().toFloat())
                    editor.putFloat("martwy22", (terazmartwy22.text).toString().toFloat())
                    editor.putFloat("martwy23", (terazmartwy23.text).toString().toFloat())
                    editor.putFloat("martwy24", (terazmartwy24.text).toString().toFloat())
                    editor.putBoolean("martwy2niepelne",  tnmartwy2.isChecked)
                    editor.putInt("wioslowanie1razy", (terazwioslowanie1razy.text).toString().toInt())
                    editor.putFloat("wioslowanie1ciezar", (terazwioslowanie1ciezar.text).toString().toFloat())
                    editor.putBoolean("wioslowanie1niepelne", tnwioslowanie1.isChecked)
                    editor.putInt("wioslowanie2razy", (terazwioslowanie2razy.text).toString().toInt())
                    editor.putFloat("wioslowanie2ciezar", (terazwioslowanie2ciezar.text).toString().toFloat())
                    editor.putBoolean("wioslowanie2niepelne", tnwioslowanie2.isChecked)
                    editor.putInt("podciaganie1razy", (terazpodciaganie1razy.text).toString().toInt())
                    editor.putFloat("podciaganie1ciezar", (terazpodciaganie1ciezar.text).toString().toFloat())
                    editor.putBoolean("podciaganie1niepelne", tnpodciaganie1.isChecked)
                    editor.putInt("podciaganie2razy", (terazpodciaganie2razy.text).toString().toInt())
                    editor.putFloat("podciaganie2ciezar", (terazpodciaganie2ciezar.text).toString().toFloat())
                    editor.putBoolean("podciaganie2niepelne", tnpodciaganie2.isChecked)
                    editor.putInt("tylbarku1razy", (teraztylbarku1razy.text).toString().toInt())
                    editor.putFloat("tylbarku1ciezar", (teraztylbarku1ciezar.text).toString().toFloat())
                    editor.putBoolean("tylbarku1niepelne", tntylbarku1.isChecked)
                    editor.putInt("tylbarku2razy", (teraztylbarku2razy.text).toString().toInt())
                    editor.putFloat("tylbarku2ciezar", (teraztylbarku2ciezar.text).toString().toFloat())
                    editor.putBoolean("tylbarku2niepelne", tntylbarku2.isChecked)
                    editor.putInt("biceps1razy", (terazbiceps1razy.text).toString().toInt())
                    editor.putFloat("biceps1ciezar", (terazbiceps1ciezar.text).toString().toFloat())
                    editor.putBoolean("biceps1niepelne", tnbiceps1.isChecked)
                    editor.putInt("biceps2razy", (terazbiceps2razy.text).toString().toInt())
                    editor.putFloat("biceps2ciezar", (terazbiceps2ciezar.text).toString().toFloat())
                    editor.putBoolean("biceps2niepelne", tnbiceps2.isChecked)
                    editor.putInt("allahy1razy", (terazallahy1razy.text).toString().toInt())
                    editor.putFloat("allahy1ciezar", (terazallahy1ciezar.text).toString().toFloat())
                    editor.putBoolean("allahy1niepelne", tnallahy1.isChecked)
                    editor.putInt("allahy2razy", (terazallahy2razy.text).toString().toInt())
                    editor.putFloat("allahy2ciezar", (terazallahy2ciezar.text).toString().toFloat())
                    editor.putBoolean("allahy2niepelne", tnallahy2.isChecked)
                } catch (nfe: NumberFormatException){}
            }
            editor.apply()
            finish()
        }

    }
}