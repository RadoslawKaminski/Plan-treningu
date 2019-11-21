package com.radziowojak.plantreningowy

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_training.*

class StatsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)

        val sharedprefs = SharedPrefs(this)
        val lastTrainingName = sharedprefs.prefs.getString("training_name", "")
        if(lastTrainingName == "Trening B")
        {
            training_name.text = "Ostatni trening: B"
        }
        else
        {
            training_name.text = "Ostatni trening: A"
        }
        /* wyciskanie1 */
        wyciskanie11.text = sharedprefs.prefs.getFloat("wyciskanie11", 0F).toString()
        wyciskanie12.text = sharedprefs.prefs.getFloat("wyciskanie12", 0F).toString()
        wyciskanie13.text = sharedprefs.prefs.getFloat("wyciskanie13", 0F).toString()
        wyciskanie14.text = sharedprefs.prefs.getFloat("wyciskanie14", 0F).toString()
        if(sharedprefs.prefs.getBoolean("wyciskanie1niepelne", false))
            wyciskanie1niepelne.visibility = View.VISIBLE
        else
            wyciskanie1niepelne.visibility = View.GONE
        /* wyciskanie2 */
        wyciskanie21.text = sharedprefs.prefs.getFloat("wyciskanie21", 0F).toString()
        wyciskanie22.text = sharedprefs.prefs.getFloat("wyciskanie22", 0F).toString()
        wyciskanie23.text = sharedprefs.prefs.getFloat("wyciskanie23", 0F).toString()
        wyciskanie24.text = sharedprefs.prefs.getFloat("wyciskanie24", 0F).toString()
        if(sharedprefs.prefs.getBoolean("wyciskanie2niepelne", false))
            wyciskanie2niepelne.visibility = View.VISIBLE
        else
            wyciskanie2niepelne.visibility = View.GONE
        /*ohp1*/
        ohp1razy.text = sharedprefs.prefs.getInt("ohp1razy", 0).toString()
        ohp1ciezar.text = sharedprefs.prefs.getFloat("ohp1ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("ohp1niepelne", false))
            ohp1niepelne.visibility = View.VISIBLE
        else
            ohp1niepelne.visibility = View.GONE
        /*ohp2*/
        ohp2razy.text = sharedprefs.prefs.getInt("ohp2razy", 0).toString()
        ohp2ciezar.text = sharedprefs.prefs.getFloat("ohp2ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("ohp2niepelne", false))
            ohp2niepelne.visibility = View.VISIBLE
        else
            ohp2niepelne.visibility = View.GONE
        /*przysiady1*/
        przysiady1razy.text = sharedprefs.prefs.getInt("przysiady1razy", 0).toString()
        przysiady1ciezar.text = sharedprefs.prefs.getFloat("przysiady1ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("przysiady1niepelne", false))
            przysiady1niepelne.visibility = View.VISIBLE
        else
            przysiady1niepelne.visibility = View.GONE
        /*przysiady2*/
        przysiady2razy.text = sharedprefs.prefs.getInt("przysiady2razy", 0).toString()
        przysiady2ciezar.text = sharedprefs.prefs.getFloat("przysiady2ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("przysiady2niepelne", false))
            przysiady2niepelne.visibility = View.VISIBLE
        else
            przysiady2niepelne.visibility = View.GONE
        /*bokbarku1*/
        bokbarku1razy.text = sharedprefs.prefs.getInt("bokbarku1razy", 0).toString()
        bokbarku1ciezar.text = sharedprefs.prefs.getFloat("bokbarku1ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("bokbarku1niepelne", false))
            bokbarku1niepelne.visibility = View.VISIBLE
        else
            bokbarku1niepelne.visibility = View.GONE
        /*bokbarku2*/
        bokbarku2razy.text = sharedprefs.prefs.getInt("bokbarku2razy", 0).toString()
        bokbarku2ciezar.text = sharedprefs.prefs.getFloat("bokbarku2ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("bokbarku2niepelne", false))
            bokbarku2niepelne.visibility = View.VISIBLE
        else
            bokbarku2niepelne.visibility = View.GONE
        /*dipy1*/
        dipy1razy.text = sharedprefs.prefs.getInt("dipy1razy", 0).toString()
        dipy1ciezar.text = sharedprefs.prefs.getFloat("dipy1ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("dipy1niepelne", false))
            dipy1niepelne.visibility = View.VISIBLE
        else
            dipy1niepelne.visibility = View.GONE
        /*dipy2*/
        dipy2razy.text = sharedprefs.prefs.getInt("dipy2razy", 0).toString()
        dipy2ciezar.text = sharedprefs.prefs.getFloat("dipy2ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("dipy2niepelne", false))
            dipy2niepelne.visibility = View.VISIBLE
        else
            dipy2niepelne.visibility = View.GONE
        /* martwy1 */
        martwy11.text = sharedprefs.prefs.getFloat("martwy11", 0F).toString()
        martwy12.text = sharedprefs.prefs.getFloat("martwy12", 0F).toString()
        martwy13.text = sharedprefs.prefs.getFloat("martwy13", 0F).toString()
        martwy14.text = sharedprefs.prefs.getFloat("martwy14", 0F).toString()
        if(sharedprefs.prefs.getBoolean("martwy1niepelne", false))
            martwy1niepelne.visibility = View.VISIBLE
        else
            martwy1niepelne.visibility = View.GONE

        /* martwy2 */
        martwy21.text = sharedprefs.prefs.getFloat("martwy21", 0F).toString()
        martwy22.text = sharedprefs.prefs.getFloat("martwy22", 0F).toString()
        martwy23.text = sharedprefs.prefs.getFloat("martwy23", 0F).toString()
        martwy24.text = sharedprefs.prefs.getFloat("martwy24", 0F).toString()
        if(sharedprefs.prefs.getBoolean("martwy2niepelne", false))
            martwy2niepelne.visibility = View.VISIBLE
        else
            martwy2niepelne.visibility = View.GONE
        /*wioslowanie1*/
        wioslowanie1razy.text = sharedprefs.prefs.getInt("wioslowanie1razy", 0).toString()
        wioslowanie1ciezar.text = sharedprefs.prefs.getFloat("wioslowanie1ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("wioslowanie1niepelne", false))
            wioslowanie1niepelne.visibility = View.VISIBLE
        else
            wioslowanie1niepelne.visibility = View.GONE
        /*wioslowanie2*/
        wioslowanie2razy.text = sharedprefs.prefs.getInt("wioslowanie2razy", 0).toString()
        wioslowanie2ciezar.text = sharedprefs.prefs.getFloat("wioslowanie2ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("wioslowanie2niepelne", false))
            wioslowanie2niepelne.visibility = View.VISIBLE
        else
            wioslowanie2niepelne.visibility = View.GONE
        /*podciaganie1*/
        podciaganie1razy.text = sharedprefs.prefs.getInt("podciaganie1razy", 0).toString()
        podciaganie1ciezar.text = sharedprefs.prefs.getFloat("podciaganie1ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("podciaganie1niepelne", false))
            podciaganie1niepelne.visibility = View.VISIBLE
        else
            podciaganie1niepelne.visibility = View.GONE
        /*podciaganie2*/
        podciaganie2razy.text = sharedprefs.prefs.getInt("podciaganie2razy", 0).toString()
        podciaganie2ciezar.text = sharedprefs.prefs.getFloat("podciaganie2ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("podciaganie2niepelne", false))
            podciaganie2niepelne.visibility = View.VISIBLE
        else
            podciaganie2niepelne.visibility = View.GONE
        /*tylbarku1*/
        tylbarku1razy.text = sharedprefs.prefs.getInt("tylbarku1razy", 0).toString()
        tylbarku1ciezar.text = sharedprefs.prefs.getFloat("tylbarku1ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("tylbarku1niepelne", false))
            tylbarku1niepelne.visibility = View.VISIBLE
        else
            tylbarku1niepelne.visibility = View.GONE
        /*tylbarku2*/
        tylbarku2razy.text = sharedprefs.prefs.getInt("tylbarku2razy", 0).toString()
        tylbarku2ciezar.text = sharedprefs.prefs.getFloat("tylbarku2ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("tylbarku2niepelne", false))
            tylbarku2niepelne.visibility = View.VISIBLE
        else
            tylbarku2niepelne.visibility = View.GONE
        /*biceps1*/
        biceps1razy.text = sharedprefs.prefs.getInt("biceps1razy", 0).toString()
        biceps1ciezar.text = sharedprefs.prefs.getFloat("biceps1ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("biceps1niepelne", false))
            biceps1niepelne.visibility = View.VISIBLE
        else
            biceps1niepelne.visibility = View.GONE
        /*biceps2*/
        biceps2razy.text = sharedprefs.prefs.getInt("biceps2razy", 0).toString()
        biceps2ciezar.text = sharedprefs.prefs.getFloat("biceps2ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("biceps2niepelne", false))
            biceps2niepelne.visibility = View.VISIBLE
        else
            biceps2niepelne.visibility = View.GONE
        /*allahy1*/
        allahy1razy.text = sharedprefs.prefs.getInt("allahy1razy", 0).toString()
        allahy1ciezar.text = sharedprefs.prefs.getFloat("allahy1ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("allahy1niepelne", false))
            allahy1niepelne.visibility = View.VISIBLE
        else
            allahy1niepelne.visibility = View.GONE

        /*allahy2*/
        allahy2razy.text = sharedprefs.prefs.getInt("allahy2razy", 0).toString()
        allahy2ciezar.text = sharedprefs.prefs.getFloat("allahy2ciezar", 0F).toString()
        if(sharedprefs.prefs.getBoolean("allahy2niepelne", false))
            allahy2niepelne.visibility = View.VISIBLE
        else
            allahy2niepelne.visibility = View.GONE
    }
}