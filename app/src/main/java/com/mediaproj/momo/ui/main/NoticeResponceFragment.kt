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

class NoticeResponceFragment : Fragment() {

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
            NoticeData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "김정민님으로부터 응답이 왔습니다","2019년 12월 1일")
        )
        dataList.add(
            NoticeData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "이성은님으로부터 응답이 왔습니다","2019년 11월 30일")
        )
        dataList.add(
            NoticeData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "박준서님으로부터 응답이 왔습니다","2019년 11월 29일")
        )

        dataList.add(
            NoticeData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "양어진님으로부터 응답이 왔습니다","2019년 11월 28일")
        )
        dataList.add(
            NoticeData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "김정민님으로부터 응답이 왔습니다","2019년 11월 24일")
        )
        dataList.add(
            NoticeData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "박준서님으로부터 응답이 왔습니다","2019년 11월 21일")
        )


        noticeRecyclerViewAdapter = NoticeRecyclerViewAdapter(context!!, dataList)
        rv_notice_request_get.adapter = noticeRecyclerViewAdapter
        rv_notice_request_get.layoutManager = LinearLayoutManager(context!!, LinearLayoutManager.VERTICAL,false)


    }
}

