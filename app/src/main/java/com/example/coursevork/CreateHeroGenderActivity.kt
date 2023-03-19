package com.example.coursevork

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class CreateHeroGenderActivity : AppCompatActivity() {

    var sPref: SharedPreferences? = null
    var gender = "male"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_hero__3)
        sPref = getSharedPreferences("UserData", MODE_PRIVATE)

        val btnMale: android.widget.ImageButton = findViewById(R.id.btn_male)
        val btnFemale: android.widget.ImageButton = findViewById(R.id.btn_female)

        btnMale.setOnClickListener {
            btnFemale.setImageResource(R.drawable.btn_female)
            btnMale.setImageResource(R.drawable.btn_male_selected)
            gender = "male"
            saveGender(gender)
        }
        btnFemale.setOnClickListener {
            btnMale.setImageResource(R.drawable.btn_male)
            btnFemale.setImageResource(R.drawable.btn_female_selected)
            gender = "female"
            saveGender(gender)
        }

    }
    fun saveGender(res: String) {
        val editor = sPref?.edit()
        editor?.putString("gender", gender)
        editor?.apply()
    }

    fun toAgeSettings(view: View) {
        val intent = Intent(this, CreateHeroActivityIntro::class.java)
        startActivity(intent)
    }

    fun toInfo(view: View) {
        val intent = Intent(this, CreateHeroActivityInfo::class.java)
        startActivity(intent)
    }
}