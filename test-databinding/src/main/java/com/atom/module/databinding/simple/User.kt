package com.atom.module.databinding.simple

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.atom.module.databinding.BR

class User : BaseObservable() {

    @Bindable
    var age : Int = 0

    set(value) {
        field = value
        notifyPropertyChanged(BR.age)
    }
}