package com.example.coursevork

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class CreateHeroAgeActivity : AppCompatActivity()  {
//    var sPref: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_hero__4)
//        sPref = getSharedPreferences("UserData", AppCompatActivity.MODE_PRIVATE)
        val agePicker: android.widget.NumberPicker = findViewById(R.id.age_picker)
        agePicker.maxValue = 100
        agePicker.minValue = 1
    }
    fun toGender(view: View) {
        val intent = Intent(this, CreateHeroGenderActivity::class.java)
        startActivity(intent)
    }

    fun toParam(view: View) {
        val intent = Intent(this, CreateHeroParamActivity::class.java)
        startActivity(intent)
    }
}