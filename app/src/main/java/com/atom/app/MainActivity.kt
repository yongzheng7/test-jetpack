package com.atom.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
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
    }
}