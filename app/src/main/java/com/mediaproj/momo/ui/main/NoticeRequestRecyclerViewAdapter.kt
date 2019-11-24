package com.mediaproj.momo.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mediaproj.momo.R
import com.mediaproj.momo.data.SelectTimeData
import kotlinx.android.synthetic.main.rv_item_select_person.view.*

class NoticeRequestRecyclerViewAdapter (val ctx: Context, val dataList: ArrayList<SelectTimeData>): RecyclerView.Adapter<NoticeRequestRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_select_time_list, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder.listTime.text = dataList[position].listTime
        holder.checkBox.isChecked = dataList[position].checkBox

    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var listTime = itemView.findViewById(R.id.tv_rv_select_time) as TextView
        val checkBox = itemView.rv_checkbox
        //checkbox는 그냥 이 형태로 써도됨
    }
}