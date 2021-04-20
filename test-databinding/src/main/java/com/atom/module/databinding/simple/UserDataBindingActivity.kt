package com.atom.module.databinding.simple

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.atom.module.databinding.R
import com.atom.module.databinding.UserDataBinding

class UserDataBindingActivity : AppCompatActivity() {

    var binding: UserDataBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user)

        binding?.user = User().apply {
            this.age = 20
        }
        binding?.lifecycleOwner = this
    }
}