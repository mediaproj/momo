package com.mediaproj.momo.ui.main


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.schedulertest.Data.PersonSelectData
import com.mediaproj.momo.R
import kotlinx.android.synthetic.main.fragment_send_select_person.*


class SendSelectPersonFragment : Fragment() {

    lateinit var sendSelectPersonRecyclerViewAdapter: SendSelectPersonRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_send_select_person, container, false)

//        btn_select_person_send.setOnClickListener { view ->
//
//            val intent = Intent(activity, MainActivity::class.java)
//            startActivity(intent)
//        }
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        /* 추후 서버와의 통신으로 대체할 부분입니다 */
        var selectDataList: ArrayList<PersonSelectData> = ArrayList()
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "강도희",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "강병현",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "권영일",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "김도형",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "김동해",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "김민섭",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "김민주",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "김성헌",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "김영훈",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "김정민",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "김정혜",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "김지은",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "김채은",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGF_XYOWaJbpdFzJRBkS-FWLYz8uO82LUPbaVsF_q4t-hQSPK1cg&s",
                "김혜령",false)
        )

        sendSelectPersonRecyclerViewAdapter = SendSelectPersonRecyclerViewAdapter(context!!, selectDataList)
        rv_send_select_person.adapter = sendSelectPersonRecyclerViewAdapter
        rv_send_select_person.layoutManager = LinearLayoutManager(context!!, LinearLayoutManager.VERTICAL,false)


    }
}
