package com.atom.app.hilt

import com.atom.module.utils.Logs
import javax.inject.Inject

class FirstAdapter {

    @Inject
    lateinit var secondAdapter: SecondAdapter

    @Inject
    constructor(){
        Logs.e("FirstAdapter constructor")
    }
}