package com.mediaproj.momo.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mediaproj.momo.R
import com.mediaproj.momo.data.SelectTimeData
import kotlinx.android.synthetic.main.activity_notice_request_detail.*

class NoticeRequestActivity : AppCompatActivity() {
    lateinit var noticeRequestRecyclerViewAdapter: NoticeRequestRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice_request_detail)


//        configureTitleBar()
                configureRecyclerView()

        btn_notice_detail_back.setOnClickListener{
            val intent = Intent(this, NoticeActivity::class.java)
            startActivity(intent)
        }
        btn_notice_detail_done.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }



//        private fun configureTitleBar(){
//            img_send_detail_input_btn_back.setOnClickListener {
//                finish()
//            }
//            img_send_detail_input_btn_next.setOnClickListener{
//                finish()
//            }
//        }

    //더보기 메뉴창
//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.menu_main, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        return when (item.itemId) {
//            R.id.action_settings -> true
//            else -> super.onOptionsItemSelected(item)
//        }
//    }



    private fun configureRecyclerView(){
        var dataList: ArrayList<SelectTimeData> = ArrayList()
        dataList.add(
            SelectTimeData(false,"오후 1시 ~ 오후 2시")
        )
        dataList.add(
            SelectTimeData(false,"오후 2시 ~ 오후 3시")
        )
        dataList.add(
            SelectTimeData(false,"오후 3시 ~ 오후 4시")
        )
        dataList.add(
            SelectTimeData(false,"오후 4시 ~ 오후 5시")
        )

        noticeRequestRecyclerViewAdapter = NoticeRequestRecyclerViewAdapter(this, dataList)
        rv_select_time.adapter = noticeRequestRecyclerViewAdapter
        rv_select_time.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}

