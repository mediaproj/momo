package com.mediaproj.momo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.mediaproj.momo.R
import kotlinx.android.synthetic.main.fragment_slider_main.*

class SliderMainFragment() : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_slider_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // val color:Int = arguments!!.getInt("background_color")
        val img_url: String? = arguments!!.getString("background_url")

        // img_fragment_slider_main.setBackgroundColor(color)
        Glide.with(this)
            .load(img_url)
            .into(img_fragment_slider_main)
    }
}
