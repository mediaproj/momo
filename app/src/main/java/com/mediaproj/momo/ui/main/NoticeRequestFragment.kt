package com.mediaproj.momo.ui.main


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.schedulertest.Data.NoticeData
import com.mediaproj.momo.R
import kotlinx.android.synthetic.main.fragment_notice_request_get.*

class NoticeRequestFragment : Fragment() {

    lateinit var noticeRecyclerViewAdapter: NoticeRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notice_request_get, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        /* 추후 서버와의 통신으로 대체할 부분입니다 */
        var dataList: ArrayList<NoticeData> = ArrayList()
        dataList.add(
            NoticeData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "oo님으로부터 요청이 왔습니다","2019년 12월 12일")
        )
        dataList.add(
            NoticeData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "oo님으로부터 요청이 왔습니다","2019년 12월 12일")
        )
        dataList.add(
            NoticeData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "oo님으로부터 요청이 왔습니다","2019년 12월 12일")
        )

        dataList.add(
            NoticeData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "oo님으로부터 요청이 왔습니다","2019년 12월 12일")
        )
        dataList.add(
            NoticeData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "oo님으로부터 요청이 왔습니다","2019년 12월 12일")
        )
        dataList.add(
            NoticeData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "oo님으로부터 요청이 왔습니다","2019년 12월 12일")
        )


        noticeRecyclerViewAdapter = NoticeRecyclerViewAdapter(context!!, dataList)
        rv_notice_request_get.adapter = noticeRecyclerViewAdapter
        rv_notice_request_get.layoutManager = LinearLayoutManager(context!!, LinearLayoutManager.VERTICAL,false)


    }
}

