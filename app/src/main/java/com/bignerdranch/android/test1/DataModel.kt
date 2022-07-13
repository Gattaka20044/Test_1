package com.bignerdranch.android.test1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel : ViewModel() {
    val flagAuthorization: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }
}