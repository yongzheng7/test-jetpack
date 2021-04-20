package com.atom.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.atom.module.app.WordActivity
import com.atom.module.databinding.DataBindingActivity
import com.atom.module.databinding.simple.UserDataBindingActivity
import com.atom.module.livedata.LiveViewActivity
import com.atom.module.viewmodel.ViewModelActivity
import com.atom.module.viewmodel.ViewModelFragmentActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.test_view_model).setOnClickListener {
            startActivity(Intent(MainActivity@this , ViewModelActivity::class.java))
        }
        findViewById<Button>(R.id.test_view_model_fragment).setOnClickListener {
            startActivity(Intent(MainActivity@this , ViewModelFragmentActivity::class.java))
        }
        findViewById<Button>(R.id.test_live_data).setOnClickListener {
            startActivity(Intent(MainActivity@this , LiveViewActivity::class.java))
        }
        findViewById<Button>(R.id.test_data_binding).setOnClickListener {
            startActivity(Intent(MainActivity@this , DataBindingActivity::class.java))
        }
        findViewById<Button>(R.id.user_data_binding).setOnClickListener {
            startActivity(Intent(MainActivity@this , UserDataBindingActivity::class.java))
        }
        findViewById<Button>(R.id.test_room).setOnClickListener {
            startActivity(Intent(MainActivity@this , WordActivity::class.java))
        }
    }
}