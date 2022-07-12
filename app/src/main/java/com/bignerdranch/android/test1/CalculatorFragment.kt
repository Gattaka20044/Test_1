package com.bignerdranch.android.test1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bignerdranch.android.test1.databinding.FragmentCalculatorBinding
import java.math.RoundingMode


class CalculatorFragment : Fragment() {




    lateinit var binding: FragmentCalculatorBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCalculatorBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.addition.setOnClickListener{
            binding.apply {
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
        binding.subtraction.setOnClickListener{
            binding.apply {
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
        binding.multiplication.setOnClickListener{
            binding.apply {
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
        binding.division.setOnClickListener{
            binding.apply {
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
                result.text = res.format("%.4f", res)
            }
        }

    }

    companion object {
        @JvmStatic
        fun newInstance() = CalculatorFragment()
    }
}