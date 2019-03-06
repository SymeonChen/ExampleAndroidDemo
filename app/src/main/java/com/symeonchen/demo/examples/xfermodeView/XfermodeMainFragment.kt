package com.symeonchen.demo.examples.xfermodeView


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.symeonchen.demo.examples.R
import kotlinx.android.synthetic.main.fragment_xfermode_main.*


class XfermodeMainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_xfermode_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        xfermode_btn_pie_support_open.setOnClickListener {
            xfermode_tv_corner_status.text = xfermode_btn_pie_support_open.text
            xfermode_img_round_bottom_corner.supportPie = true
        }
        xfermode_btn_pie_support_close.setOnClickListener {
            xfermode_tv_corner_status.text = xfermode_btn_pie_support_close.text
            xfermode_img_round_bottom_corner.supportPie = false
        }
    }

}
