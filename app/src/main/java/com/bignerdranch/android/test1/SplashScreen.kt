package com.bignerdranch.android.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

import android.view.WindowManager
import com.bignerdranch.android.test1.databinding.ActivirySplashScreenBinding


class SplashScreen : AppCompatActivity() {
   private lateinit var bindingClass : ActivirySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivirySplashScreenBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)


        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )



        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            }, 1500)

    }
}