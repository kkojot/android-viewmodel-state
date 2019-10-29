package com.kojotdev.android.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.navGraphViewModels
import com.kojotdev.android.R

class HomeFragment : Fragment() {

    private val homeViewModel: HomeViewModel by navGraphViewModels(R.id.mobile_navigation)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(this, Observer {
            textView.text = it
        })

        val nameText: TextView = root.findViewById(R.id.name_text)
        val setNameButton: Button = root.findViewById(R.id.set_name_button)
        homeViewModel.name.observe(this, Observer { name ->
            nameText.text = name
        })
        setNameButton.setOnClickListener { button ->
            homeViewModel.setName("Roman")
        }
        return root
    }
}