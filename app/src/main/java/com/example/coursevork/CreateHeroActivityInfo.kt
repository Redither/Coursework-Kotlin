package com.example.coursevork

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class CreateHeroActivityInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_hero__2)
    }

    fun startCreateHero(view: View) {
        val intent = Intent(this, CreateHeroGenderActivity::class.java)
        startActivity(intent)
    }

    fun toStart(view: View) {
        val intent = Intent(this, CreateHeroActivityIntro::class.java)
        startActivity(intent)
    }

}