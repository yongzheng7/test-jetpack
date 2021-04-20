package com.atom.module.livedata

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class LiveViewActivity : AppCompatActivity() {

    var livedata: LiveDataModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        val show = findViewById<TextView>(R.id.show_number)
        val add = findViewById<Button>(R.id.add_number)
        livedata = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(LiveDataModel::class.java)

        val observable = Observer<Int> {
            show.text = it.toString()
        }

        livedata?.getNumberValue()?.observe(this, observable)

        add.setOnClickListener {
            livedata?.addNumber(1)
        }

    }
}