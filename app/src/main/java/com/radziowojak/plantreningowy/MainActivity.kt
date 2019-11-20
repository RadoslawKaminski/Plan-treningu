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
            startActivity(trainingIntent)
        }

        val sharedprefs = SharedPrefs(this)
        if(sharedprefs.prefs.getString("training_name", "") == "")
        {
            //stworzenie poprzedniego treningu
            val editor = sharedprefs.prefs.edit()

            editor.putString("training_name", "Trening B")

            editor.putFloat("wyciskanie11", 65F)
            editor.putFloat("wyciskanie12", 60F)
            editor.putFloat("wyciskanie13", 55F)
            editor.putFloat("wyciskanie14", 55F)
            editor.putBoolean("wyciskanie1niepelne", false)
            editor.putFloat("wyciskanie21", 42.5F)
            editor.putFloat("wyciskanie22", 37.5F)
            editor.putFloat("wyciskanie23", 35F)
            editor.putFloat("wyciskanie24", 35F)
            editor.putBoolean("wyciskanie2niepelne", false)

            editor.putInt("ohp1razy", 6)
            editor.putFloat("ohp1ciezar", 10F)
            editor.putBoolean("ohp1niepelne", false)
            editor.putInt("ohp2razy", 6)
            editor.putFloat("ohp2ciezar", 5F)
            editor.putBoolean("ohp2niepelne", false)

            editor.putInt("przysiad1razy", 7)
            editor.putFloat("przysiad1ciezar", 5F)
            editor.putBoolean("przysiad1niepelne", false)
            editor.putInt("przysiad2razy", 5)
            editor.putFloat("przysiad2ciezar", 5F)
            editor.putBoolean("przysiad2niepelne", false)

            editor.putInt("bokbarku1razy", 9)
            editor.putFloat("bokbarku1ciezar", 5F)
            editor.putBoolean("bokbarku1niepelne", false)
            editor.putInt("bokbarku2razy", 9)
            editor.putFloat("bokbarku2ciezar", 4F)
            editor.putBoolean("bokbarku2niepelne", false)

            editor.putInt("dipy1razy", 6)
            editor.putFloat("dipy1ciezar", 0F)
            editor.putBoolean("dipy1niepelne", false)
            editor.putInt("dipy2razy", 6)
            editor.putFloat("dipy2ciezar", 7.5F)
            editor.putBoolean("dipy2niepelne", false)

            editor.putFloat("martwy11", 80F)
            editor.putFloat("martwy12", 80F)
            editor.putFloat("martwy13", 70F)
            editor.putFloat("martwy14", 70F)
            editor.putBoolean("martwy1niepelne", false)
            editor.putFloat("martwy21", 65F)
            editor.putFloat("martwy22", 60F)
            editor.putFloat("martwy23", 55F)
            editor.putFloat("martwy24", 55F)
            editor.putBoolean("martwy2niepelne", false)

            editor.putInt("wioslowanie1razy", 5)
            editor.putFloat("wioslowanie1ciezar", 15F)
            editor.putBoolean("wioslowanie1niepelne", false)
            editor.putInt("wioslowanie2razy", 7)
            editor.putFloat("wioslowanie2ciezar", 5F)
            editor.putBoolean("wioslowanie2niepelne", false)

            editor.putInt("podciaganie1razy", 4)
            editor.putFloat("podciaganie1ciezar", 0F)
            editor.putBoolean("podciaganie1niepelne", false)
            editor.putInt("podciaganie2razy", 4)
            editor.putFloat("podciaganie2ciezar", 0F)
            editor.putBoolean("podciaganie2niepelne", false)

            editor.putInt("tylbarku1razy", 9)
            editor.putFloat("tylbarku1ciezar", 4F)
            editor.putBoolean("tylbarku1niepelne", false)
            editor.putInt("tylbarku2razy", 9)
            editor.putFloat("tylbarku2ciezar", 3F)
            editor.putBoolean("tylbarku2niepelne", false)

            editor.putInt("biceps1razy", 9)
            editor.putFloat("biceps1ciezar", 10F)
            editor.putBoolean("biceps1niepelne", false)
            editor.putInt("biceps2razy", 9)
            editor.putFloat("biceps2ciezar", 7.5F)
            editor.putBoolean("biceps2niepelne", false)

            editor.putInt("allahy1razy", 11)
            editor.putFloat("allahy1ciezar", 70F)
            editor.putBoolean("allahy1niepelne", true)
            editor.putInt("allahy2razy", 9)
            editor.putFloat("allahy2ciezar", 55F)
            editor.putBoolean("allahy2niepelne", false)

            editor.apply()
        }
    }
}
