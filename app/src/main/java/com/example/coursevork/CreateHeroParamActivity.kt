package com.example.coursevork

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class CreateHeroParamActivity :  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_hero__5)
        val hgt: android.widget.NumberPicker = findViewById(R.id.inputH)
        val wgt: android.widget.NumberPicker = findViewById(R.id.inputW)

    }
    fun toFinish(view: View) {
        val intent = Intent(this, CreateHeroFinishActivity::class.java)
        startActivity(intent)
    }
    fun toAge(view: View) {
        val intent = Intent(this, CreateHeroAgeActivity::class.java)
        startActivity(intent)
    }
}