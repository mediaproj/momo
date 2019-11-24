package com.mediaproj.momo.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mediaproj.momo.R
import com.mediaproj.momo.data.MainImgData

class MainRecommendRecyclerViewAdapter(val ctx: Context?, val dataList: ArrayList<MainImgData>):
    RecyclerView.Adapter<MainRecommendRecyclerViewAdapter.Holder>() {

    override fun getItemCount(): Int = dataList.size

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_main_recommend, viewGroup, false)

        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        ctx?.let {
            Glide.with(it)
                .load(dataList[position].mainImg)
                .into(holder.mainImg)
        }

    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mainImg = itemView.findViewById(R.id.iv_main_recommend) as ImageView
    }
}