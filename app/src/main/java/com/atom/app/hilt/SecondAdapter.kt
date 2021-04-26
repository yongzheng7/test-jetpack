package com.atom.app.hilt

import com.atom.module.utils.Logs
import javax.inject.Inject

class SecondAdapter {
    @Inject
    lateinit var threeAdapter: ThreeAdapter

    @Inject
    lateinit var fourAdapter: FourAdapter

    @Inject
    constructor(){
        Logs.e("SecondAdapter constructor")
    }
}