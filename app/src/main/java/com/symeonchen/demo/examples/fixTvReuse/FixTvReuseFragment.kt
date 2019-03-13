package com.symeonchen.demo.examples.fixTvReuse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.symeonchen.demo.examples.R

class FixTvReuseFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fix_tv_reuse_fragment_main, container, false)
    }
}