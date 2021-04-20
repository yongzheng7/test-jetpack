package com.atom.module.databinding

import androidx.lifecycle.ViewModel

class DataBindingViewModel : ViewModel() {
    var number: Int = 0

    fun getValue(): Int {
        return number
    }

    fun addValue(v: Int) {
        this.number = this.number + v
    }
}