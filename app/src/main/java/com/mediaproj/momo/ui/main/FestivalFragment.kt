package com.mediaproj.momo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mediaproj.momo.R
import com.mediaproj.momo.data.MainListData
import kotlinx.android.synthetic.main.fragment_main_festival.*

class FestivalFragment : Fragment() {

    lateinit var mainRecyclerViewAdapter: MainRecyclerViewAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_festival, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        추후 서버 통신
        var datalist: ArrayList<MainListData> = ArrayList()
        datalist.add(
            MainListData(
                "https://support.visitkorea.or.kr/img/call?cmd=VIEW&id=d736c69e-ba7f-4339-838c-f83ad41040e8&thumb",
                "복정동 빛축제", "#이색 #불빛 #축제"
            )
        )
        datalist.add(
            MainListData(
                "https://support.visitkorea.or.kr/img/call?cmd=VIEW&id=70362baf-2ab2-42a0-9cfa-1ac848e0edad&thumb"
                        ,"서울디자인\n페스티벌", "#축제"
            )
        )
        datalist.add(
            MainListData(
                "https://support.visitkorea.or.kr/img/call?cmd=VIEW&id=5d5213bd-1fe4-40bc-b7af-a0e90e73a059&thumb",
                "롯데월드", "#나들이 #축제"
            ))
        datalist.add(
            MainListData(
                "https://support.visitkorea.or.kr/img/call?cmd=VIEW&id=ef4fe9a4-afa2-4bc6-97e2-cec199f22496&thumb",
                        "오색별빛정원", "#겨울축제 #불빛"
            )
        )
        datalist.add(
            MainListData(
                "https://support.visitkorea.or.kr/img/call?cmd=VIEW&id=eb83d5e4-9588-43a6-a5b6-8f00d6b783ca&thumb"
                        ,"산타런", "#관광"
            )
        )
        datalist.add(
            MainListData(
                "https://support.visitkorea.or.kr/img/call?cmd=VIEW&id=e9de8892-b087-4297-9fd1-405e46d15cd5&thumb",
                        "크리스마스", "#거창 #불빛"
            )
        )

        mainRecyclerViewAdapter = MainRecyclerViewAdapter(context!!, datalist)
        rv_main_festival.adapter = mainRecyclerViewAdapter
        rv_main_festival.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

    }
}