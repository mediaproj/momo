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
                "https://movie.naver.com/movie/bi/mi/basic.nhn?code=167605",
                "터미네이터", "30%"
            )
        )
        datalist.add(
            MainListData(
                "https://movie.naver.com/movie/bi/mi/basic.nhn?code=136873",
                "겨울왕국", "20%"
            )
        )
        datalist.add(
            MainListData(
                "https://movie.naver.com/movie/bi/mi/basic.nhn?code=167605",
                "블랙머니", "10%"
            )
        )
        datalist.add(
            MainListData(
                "https://movie.naver.com/movie/bi/mi/basic.nhn?code=167605",
                "영화4", "5%"
            )
        )
        datalist.add(
            MainListData(
                "https://movie.naver.com/movie/bi/mi/basic.nhn?code=167605",
                "영화5", "3%"
            )
        )
        datalist.add(
            MainListData(
                "https://movie.naver.com/movie/bi/mi/basic.nhn?code=167605",
                "영화6", "2%"
            ))
        mainRecyclerViewAdapter = MainRecyclerViewAdapter(context!!, datalist)
        rv_main_musical.adapter = mainRecyclerViewAdapter
        rv_main_musical.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

    }
}