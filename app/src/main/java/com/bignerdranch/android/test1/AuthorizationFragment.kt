package com.bignerdranch.android.test1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.bignerdranch.android.test1.databinding.FragmentAuthorizationBinding

class AuthorizationFragment : Fragment() {

    lateinit var bindingClass: FragmentAuthorizationBinding
    private val dataModel: DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        bindingClass = FragmentAuthorizationBinding.inflate(inflater)
        return bindingClass.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bindingClass.enter.setOnClickListener{
            val login = bindingClass.enterLogin.text.toString()
            val password = if (bindingClass.enterPassword.text.toString() != "") bindingClass.enterPassword.text.toString().toInt() else 0
            users.keys.forEach() { it ->
                if (it == login) {
                    if (users[it] == password) {
                        dataModel.flagAuthorization.value = true
                    } else{
                        Toast.makeText(activity, R.string.not_true_password, Toast.LENGTH_SHORT).show()
                    }
                } else{
                    Toast.makeText(activity, R.string.not_true_login, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = AuthorizationFragment()

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