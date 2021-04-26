package com.atom.app.hilt

import com.atom.module.utils.Logs
import javax.inject.Inject

class ThreeAdapter {


    constructor(value : String){
        Logs.e("SecondAdapter constructor  value = $value")
    }
}