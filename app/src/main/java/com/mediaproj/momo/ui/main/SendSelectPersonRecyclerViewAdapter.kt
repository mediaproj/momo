package com.mediaproj.momo.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.schedulertest.Data.PersonSelectData
import com.mediaproj.momo.R
import kotlinx.android.synthetic.main.rv_item_select_person.view.*

class SendSelectPersonRecyclerViewAdapter   (val ctx: Context, val dataList: ArrayList<PersonSelectData>): RecyclerView.Adapter<SendSelectPersonRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_select_person, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(dataList[position].profileImg)
            .into(holder.profileImg)
        holder.profileName.text = dataList[position].profileName
        holder.checkBox.isChecked = dataList[position].checkBox

    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var profileName = itemView.findViewById(R.id.tv_rv_select_person_profile_name) as TextView
        var profileImg = itemView.findViewById(R.id.iv_rv_select_person_profile) as ImageView
        val checkBox = itemView.rv_checkbox
        //checkbox는 그냥 이 형태로 써도됨
    }
}