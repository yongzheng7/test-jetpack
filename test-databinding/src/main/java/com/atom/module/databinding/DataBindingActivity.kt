package com.atom.module.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

class DataBindingActivity : AppCompatActivity() {

    var viewModel: DataBindingViewModel? = null
    var binding: SimpleDataBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_binding)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)
        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(DataBindingViewModel::class.java)
        binding?.data = viewModel
        binding?.lifecycleOwner = this
    }
}