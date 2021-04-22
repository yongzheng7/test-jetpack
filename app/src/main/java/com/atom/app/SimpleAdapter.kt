package com.atom.app

import android.util.Log
import javax.inject.Inject

class SimpleAdapter {

    @Inject
    constructor(){
        Log.e("Hilt" , "SimpleAdapter constructor")
    }
}