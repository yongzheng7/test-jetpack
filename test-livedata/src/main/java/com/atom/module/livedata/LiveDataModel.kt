package com.atom.module.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataModel : ViewModel() {
    private var number: MutableLiveData<Int>? = null

    fun getNumberValue(): MutableLiveData<Int> {
        if (number == null) {
            number = MutableLiveData<Int>().apply {
                this.value = 0
            }
        }
        return number!!
    }

    fun addNumber(value: Int) {
        number?.also {
            it.value = it.value!! + value
        }
    }
}