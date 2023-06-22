package com.example.coursevork

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.log

class CreateHeroFinishActivity :  AppCompatActivity() {

    var sPref: SharedPreferences? = null; //храним данные на устройстве
    var firstInit: Boolean = true
    var gender: String = "null"
    var age: Int = 1
    var weigth: Int = 1
    var heigth: Int = 1
    var needWater: Int = 3000
    var needFood: Float= 3000F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_hero__6)
        sPref = getSharedPreferences("UserData", MODE_PRIVATE) //открывем таблицу пользовательских данных
        firstInit = sPref?.getBoolean("notFirstInit", true)!!
        gender = sPref?.getString("notFirstInit", "null")!!
        age = sPref?.getInt("notFirstInit", 1)!!
        weigth = sPref?.getInt("notFirstInit", 1)!!
        heigth = sPref?.getInt("notFirstInit", 1)!!

        if (gender == "male") {
            needWater = weigth * 35
            needFood = ((((10 * weigth) + (6.25 * heigth)-(5 * age) + 5) * 1.2).toFloat())
        } else if (gender == "female") {
            needWater = weigth * 31
            needFood = ((((10 * weigth) + (6.25 * heigth)-(5 * age) - 161) * 1.2).toFloat())
        } else {
            //TODO: обработать ошибку
        }

    }
//        fun toFinish(view: View) {
//            val intent = Intent(this, CreateHeroFinishActivity::class.java)
//            startActivity(intent)
//        }
}