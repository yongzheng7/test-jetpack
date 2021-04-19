package com.atom.module.viewmodel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class SimpleFragment2 : Fragment() {

    var vm: SimpleViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view_model, container , false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        vm =  ViewModelProvider(requireActivity() ,
            ViewModelProvider.NewInstanceFactory()
        ).get(SimpleViewModel::class.java)
        val layout = view
        if (layout != null) {

            val show_number = layout.findViewById<TextView>(R.id.show_number)
            show_number.text = vm?.number.toString()

            val findViewById = layout.findViewById<Button>(R.id.add_number)
            findViewById.text = "Fragment2"
            findViewById.setOnClickListener {
                Toast.makeText(it.context , "Fragment1" , Toast.LENGTH_LONG).show()
                vm?.also {
                    it.number++
                    show_number.text = it.number.toString()
                }
            }
        }
    }
}