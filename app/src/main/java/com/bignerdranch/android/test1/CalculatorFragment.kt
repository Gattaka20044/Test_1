package com.bignerdranch.android.test1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bignerdranch.android.test1.databinding.FragmentCalculatorBinding
import java.math.RoundingMode


class CalculatorFragment : Fragment() {

    lateinit var bindingClass: FragmentCalculatorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingClass = FragmentCalculatorBinding.inflate(inflater)
        return bindingClass.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bindingClass.addition.setOnClickListener {
            bindingClass.apply {
                val numA = numberA.text
                val numB = numberB.text
                val res = when {
                    numA.toString() == "" && numB.toString() == "" -> "Введите числа а и b"
                    numA.toString() == "" -> "Введите число а"
                    numB.toString() == "" -> "Введите число b"
                    else -> {
                        val res = numA.toString().toInt() + numB.toString().toInt()
                        res.toString()
                    }
                }
                result.text = res
            }
        }

        bindingClass.subtraction.setOnClickListener {
            bindingClass.apply {
                val numA = numberA.text
                val numB = numberB.text
                val res = when {
                    numA.toString() == "" && numB.toString() == "" -> "Введите числа а и b"
                    numA.toString() == "" -> "Введите число а"
                    numB.toString() == "" -> "Введите число b"
                    else -> {
                        val res = numA.toString().toInt() - numB.toString().toInt()
                        res.toString()
                    }
                }
                result.text = res
            }
        }

        bindingClass.multiplication.setOnClickListener {
            bindingClass.apply {
                val numA = numberA.text
                val numB = numberB.text
                val res = when {
                    numA.toString() == "" && numB.toString() == "" -> "Введите числа а и b"
                    numA.toString() == "" -> "Введите число а"
                    numB.toString() == "" -> "Введите число b"
                    else -> {
                        val res = numA.toString().toInt() * numB.toString().toInt()
                        res.toString()
                    }
                }
                result.text = res
            }
        }

        bindingClass.division.setOnClickListener {
            bindingClass.apply {
                val numA = numberA.text
                val numB = numberB.text
                val res = when {
                    numA.toString() == "" && numB.toString() == "" -> "Введите числа а и b"
                    numA.toString() == "" -> "Введите число а"
                    numB.toString() == "" -> "Введите число b"
                    else -> {
                        val res = numA.toString().toDouble() / numB.toString().toDouble()
                        res.toBigDecimal().setScale(4, RoundingMode.HALF_UP).toDouble().toString()
                    }
                }
                result.text = res
            }

        }
    }
    companion object {
            @JvmStatic
            fun newInstance() = CalculatorFragment()
        }
}