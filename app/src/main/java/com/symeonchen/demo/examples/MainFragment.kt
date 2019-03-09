package com.symeonchen.demo.examples


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.symeonchen.demo.examples.R
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_main_xfermode.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_xfermodeMainFragment2)
        }
        btn_main_fixAppbarBehavior.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_fixAppbarMainFragment)
        }
    }


}
