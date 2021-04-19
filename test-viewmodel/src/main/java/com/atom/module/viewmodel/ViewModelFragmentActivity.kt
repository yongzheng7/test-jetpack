package com.atom.module.viewmodel

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

/**
 * 如果将 使用Viewmodel 之下的代码注释掉 , 每次进行activity切换横竖屏时 都会初始化一个新的值 , 数值会刷新
 * 如果使用ViewModel 则和activity的切换横竖 不会造成数据的丢失
 */
class ViewModelFragmentActivity : AppCompatActivity() {

    // 使用普通的
    var vm: SimpleViewModel? = SimpleViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_view_model)

        // 使用Viewmodel
        vm = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(SimpleViewModel::class.java)

        findViewById<Button>(R.id.show_fragment_1).setOnClickListener {
            val fragmentManager = supportFragmentManager
            val beginTransaction = fragmentManager.beginTransaction()
            val fragment = SimpleFragment1()
            beginTransaction.replace(
                R.id.fragment_layout,
                fragment,
                fragment.javaClass.name
            )
            beginTransaction.commit()
        }

        findViewById<Button>(R.id.show_fragment_2).setOnClickListener {
            val fragmentManager = supportFragmentManager
            val beginTransaction = fragmentManager.beginTransaction()
            val fragment = SimpleFragment2()
            beginTransaction.replace(
                R.id.fragment_layout,
                fragment,
                fragment.javaClass.name
            )
            beginTransaction.commit()
        }

    }
}