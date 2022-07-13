package com.bignerdranch.android.test1


import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.test1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    private val dataModel: DataModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_main, AuthorizationFragment.newInstance())
            .commit()

        dataModel.flagAuthorization.observe(this) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_main, CalculatorFragment.newInstance())
                .commit()
        }
    }
}
