package com.mediaproj.momo.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mediaproj.momo.R
import com.mediaproj.momo.data.MainListData

class MainRecyclerViewAdapter (val ctx: Context, val dataList: ArrayList<MainListData>):
    RecyclerView.Adapter<MainRecyclerViewAdapter.Holder>(){

    override fun getItemCount(): Int =dataList.size

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_main_list, viewGroup, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(dataList[position].listImg)
            .into(holder.listImg)
        holder.listTitle.text= dataList[position].listTitle
        holder.listVoteRate.text= dataList[position].listVoteRate

    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var listImg = itemView.findViewById(R.id.iv_main_list) as ImageView
        var listTitle = itemView.findViewById(R.id.tv_main_title) as TextView
        var listVoteRate = itemView.findViewById(R.id.tv_main_vote_ratio) as TextView

    }
}