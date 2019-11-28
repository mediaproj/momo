package com.mediaproj.momo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mediaproj.momo.R
import com.mediaproj.momo.data.MainListData
import kotlinx.android.synthetic.main.fragment_main_musical.*

class MusicalFragment: Fragment() {

    lateinit var mainRecyclerViewAdapter: MainRecyclerViewAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_musical, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        추후 서버 통신
        var datalist: ArrayList<MainListData> = ArrayList()
        datalist.add(
            MainListData(
               "http://ticketimage.interpark.com/Play/image/large/19/19011175_p.gif",
                "미스터쇼", "14.1%"
            )
        )
        datalist.add(
            MainListData(
                "http://ticketimage.interpark.com/Play/image/large/19/19013796_p.gif",
                "레베카", "10.7%"
            )
        )
        datalist.add(
            MainListData(
                "http://ticketimage.interpark.com/Play/image/large/19/19011808_p.gif",
                "아이다", "10.3%"
            )
        )
        datalist.add(
            MainListData(
               "http://ticketimage.interpark.com/Play/image/large/19/19014356_p.gif",
                "경종수정실록", "9.7%"
            )
        )
        datalist.add(
            MainListData(
                "http://ticketimage.interpark.com/Play/image/large/19/19015390_p.gif"
                        ,"여신님이 \n보고 계셔", "9.2%"
            )
        )
        datalist.add(
            MainListData(
                "http://ticketimage.interpark.com/Play/image/large/19/19011716_p.gif",
                "스위니토드", "4.0%"
            )
        )
        mainRecyclerViewAdapter = MainRecyclerViewAdapter(context!!, datalist)
        rv_main_musical.adapter = mainRecyclerViewAdapter
        rv_main_musical.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

    }
}