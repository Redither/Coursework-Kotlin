package com.example.coursevork

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class CreateHeroActivityIntro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_hero__1)
    }

    fun createHero(view: View) {
        val intent = Intent(this, CreateHeroActivityInfo::class.java) //если юзер уже заполнял данные - запускает приложение
        startActivity(intent)
    }
}