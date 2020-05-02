package com.ag.navigationcomponentsample.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ag.navigationcomponentsample.R
import com.ag.navigationcomponentsample.navigation.setupToolbar
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar(toolbar)
    }
}