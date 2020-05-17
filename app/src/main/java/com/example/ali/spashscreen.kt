package com.example.ali

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager.LayoutParams.*

class spashscreen : AppCompatActivity() {


    val SPLASH_TIME_OUT =3000



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spashscreen)
        window.setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN)

        Handler().postDelayed(object :Runnable{
            override fun run() {

                val main= Intent(this@spashscreen,MainActivity::class.java)

                startActivity(main)
                finish()
            }
        },SPLASH_TIME_OUT.toLong())

    }
}
