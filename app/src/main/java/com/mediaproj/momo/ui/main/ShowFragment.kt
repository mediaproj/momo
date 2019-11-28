package com.mediaproj.momo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mediaproj.momo.R
import com.mediaproj.momo.data.MainListData
import kotlinx.android.synthetic.main.fragment_main_show.*

class ShowFragment : Fragment(){

    lateinit var mainRecyclerViewAdapter : MainRecyclerViewAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_show, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        추후 서버 통신
        var datalist: ArrayList<MainListData> = ArrayList()
        datalist.add(
            MainListData(
                "http://ticketimage.interpark.com/Play/image/large/19/19015278_p.gif",
                "엘리펀트송", "8.2%"
            )
        )
        datalist.add(
            MainListData(
                "http://ticketimage.interpark.com/Play/image/large/17/17010357_p.gif",
                "옥탑방고양이", "8.0%"
            )
        )
        datalist.add(
            MainListData(
                "http://ticketimage.interpark.com/Play/image/large/18/18010868_p.gif",
                "오백에삼십", "7.1%"
            )
        )
        datalist.add(
            MainListData(
                "http://ticketimage.interpark.com/Play/image/large/19/19011560_p.gif",
                "작업의정석", "3.7%"
            )
        )
        datalist.add(
            MainListData(
                "http://ticketimage.interpark.com/Play/image/large/15/15012361_p.gif",
                "쉬어 매드니스", "3.4%"
            )
        )
        datalist.add(
            MainListData(
                "http://ticketimage.interpark.com/Play/image/large/19/19015663_p.gif",
                "그대를 사랑", "2.6%"
            ))
        mainRecyclerViewAdapter = MainRecyclerViewAdapter(context!!, datalist)
        rv_main_show.adapter = mainRecyclerViewAdapter
        rv_main_show.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

    }
}