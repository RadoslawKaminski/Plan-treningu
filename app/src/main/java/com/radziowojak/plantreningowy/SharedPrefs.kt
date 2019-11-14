package com.radziowojak.plantreningowy

import android.content.Context

class SharedPrefs (context : Context) {

    val prefs = context.getSharedPreferences("SharedPreferencesFile", 0)

}