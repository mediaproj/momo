package com.mediaproj.momo.ui.main
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.schedulertest.Data.NoticeData
import com.mediaproj.momo.R

class NoticeRecyclerViewAdapter (val ctx: Context, val dataList: ArrayList<NoticeData>): RecyclerView.Adapter<NoticeRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_notice_message, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(dataList[position].profileImg)
            .into(holder.profileImg)
        holder.listDate.text = dataList[position].listDate
        holder.listText.text= dataList[position].listText


//        holder.profileImg.setOnClickListener {
//
//
//            var intent = Intent(ctx, NoticeRequestActivity::class.java)
//
//            intent.putExtra("profileImg", dataList[holder.adapterPosition].profileImg)
//            intent.putExtra("listDate", dataList[holder.adapterPosition].listDate)
//            intent.putExtra("listText", dataList[holder.adapterPosition].listText)
//
//            ctx.startActivity(intent)
//        }


//        holder.listDate.setOnClickListener {
//
//
//            var intent = Intent(ctx, NoticeRequestActivity::class.java)
//
//            intent.putExtra("profileImg", dataList[holder.adapterPosition].profileImg)
//            intent.putExtra("listDate", dataList[holder.adapterPosition].listDate)
//            intent.putExtra("listText", dataList[holder.adapterPosition].listText)
//
//            ctx.startActivity(intent)
//        }
//        holder.listText.setOnClickListener {
//
//            var intent = Intent(ctx, NoticeRequestActivity::class.java)
//
//            intent.putExtra("profileImg", dataList[holder.adapterPosition].profileImg)
//            intent.putExtra("listDate", dataList[holder.adapterPosition].listDate)
//            intent.putExtra("listText", dataList[holder.adapterPosition].listText)
//            ctx.startActivity(intent)
//        }
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var listDate = itemView.findViewById(R.id.tv_rv_notice_date) as TextView
        var listText = itemView.findViewById(R.id.tv_rv_notice_main) as TextView
        var profileImg = itemView.findViewById(R.id.iv_rv_notice_profile) as ImageView
    }
}