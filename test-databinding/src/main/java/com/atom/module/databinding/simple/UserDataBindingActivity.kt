package com.atom.module.databinding.simple

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.atom.module.databinding.R
import com.atom.module.databinding.UserDataBinding

class UserDataBindingActivity : AppCompatActivity() {

    var binding: UserDataBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user)
        val apply = User().apply {
            this.age = 20
        }
        binding?.user = apply
        binding?.lifecycleOwner = this

        findViewById<Button>(R.id.add_age).setOnClickListener {
            apply.age = apply.age + 1;
        }
    }
}