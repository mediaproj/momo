package com.mediaproj.momo.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.mediaproj.momo.R
import kotlinx.android.synthetic.main.activity_notice_request.*

class NoticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice_request)
        // configureTitleBar()
        configureMainTab()
//        img_toolbar_main_action.setOnClickListener{
//            if(SharedPreferenceController.getUserID(this).isEmpty()){
//                startActivity<LoginActivity>()
//            }
//            else{
//                SharedPreferenceController.clearUserID(this)
//                configureTitleBar()
//
//            }
//        }

//    override fun onResume() {
//        super.onResume()
//        configureTitleBar()
//    }
//    private fun configureTitleBar(){
//        if(SharedPreferenceController.getUserID(this).isEmpty()){
//            img_toolbar_main_action.isSelected = false
//        }
//        else{
//            img_toolbar_main_action.isSelected = true
//        }
//    }
        btn_notice_back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    private fun configureMainTab() {
        vp_notice.adapter = NoticePageAdapter(supportFragmentManager, 2)
        vp_notice.offscreenPageLimit = 2
        tl_notice_tabbar.setupWithViewPager(vp_notice)

        val navCategoryMainLayout: View = (this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
            .inflate(R.layout.fragment_notice_tabbar, null, false)
        tl_notice_tabbar.getTabAt(0)!!.customView = navCategoryMainLayout.
            findViewById(R.id.rl_tabbar_notice_responce) as RelativeLayout
        tl_notice_tabbar.getTabAt(1)!!.customView = navCategoryMainLayout.
            findViewById(R.id.rl_tabbar_notice_request) as RelativeLayout

    }
}














