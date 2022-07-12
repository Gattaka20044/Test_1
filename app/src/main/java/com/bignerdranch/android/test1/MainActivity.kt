package com.bignerdranch.android.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.bignerdranch.android.test1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass : ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_main, CalculatorFragment.newInstance())
            .commit()


    }
}
/*
bindingClass.enter.setOnClickListener {
    val login = bindingClass.enterLogin.text.toString()
    val password = bindingClass.enterPassword.text.toString().toInt()
    users.keys.forEach() { it ->
        if (it == login) {
            if (users[it] == password) {
                Toast.makeText(this, "Вход выполнен", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, R.string.not_true_password, Toast.LENGTH_SHORT).show()
            }
        } else{
            Toast.makeText(this, R.string.not_true_login, Toast.LENGTH_SHORT).show()
        }
    }
}

*/