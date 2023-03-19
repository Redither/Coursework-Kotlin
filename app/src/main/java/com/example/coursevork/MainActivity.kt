package com.example.coursevork

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var sPref: SharedPreferences? = null;
    var firstInit = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_screen)

        sPref = getSharedPreferences("UserData", MODE_PRIVATE)
        firstInit = sPref?.getBoolean("notFirstInit", true)!!

        Handler().postDelayed({ //эмулирует задержку перед получением данных с сервера
            if (firstInit == false) {
                val intent = Intent(this, MainAppActivity::class.java) //если юзер уже заполнял данные - запускает приложение
                startActivity(intent)
            } else {
                val intent = Intent(this, CreateHeroActivityIntro::class.java) //если не заполнял, то переведет на заполнение
                startActivity(intent)
            }
    }, 3000)
    }
}
