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
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "lee",true)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "lee",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "park",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "park",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "park",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "park",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "park",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "park",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "kim",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "kim",false)
        )
        selectDataList.add(
            PersonSelectData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAukpV31V9zNtu0CQ0QOlJ_aelKU0A6sM-kokoqk6CQSHKPlMuRA",
                "kim",false)
        )
        sendSelectPersonRecyclerViewAdapter = SendSelectPersonRecyclerViewAdapter(context!!, selectDataList)
        rv_send_select_person.adapter = sendSelectPersonRecyclerViewAdapter
        rv_send_select_person.layoutManager = LinearLayoutManager(context!!, LinearLayoutManager.VERTICAL,false)


    }
}
