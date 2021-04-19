package com.atom.module.viewmodel

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

/**
 * 如果将 使用Viewmodel 之下的代码注释掉 , 每次进行activity切换横竖屏时 都会初始化一个新的值 , 数值会刷新
 * 如果使用ViewModel 则和activity的切换横竖 不会造成数据的丢失
 */
class ViewModelActivity : AppCompatActivity() {

    // 使用普通的
    var vm: SimpleViewModel? = SimpleViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)
        Log.e("ViewModelActivity" , "onCreate ")
        // 使用Viewmodel
        vm = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(SimpleViewModel::class.java)

        val show_number = findViewById<TextView>(R.id.show_number)
        show_number.text = vm?.number.toString()

        val add_number = findViewById<Button>(R.id.add_number)
        add_number.setOnClickListener {
            vm?.also {
                it.number++
                show_number.text = it.number.toString()
            }
        }
    }
}