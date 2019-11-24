package com.mediaproj.momo.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.mediaproj.momo.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_send_select_person.*
import kotlinx.android.synthetic.main.fragment_send_select_person.*

class SendSelectPersonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_select_person)
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
//        img_send_select_person_btn_back.setOnClickListener {
//            val intent = Intent(this, SendInputDetailActivity::class.java)
//            startActivity(intent)
//        }


        //  보내기 버튼 btn_select_person_send가 fragment에 있는 값인데 activity안에서 작동시키려면 어떻게?
//        btn_select_person_send.setOnClickListener { view ->
//
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
    }
    private fun configureMainTab() {
        vp_send_select_person.adapter = SelectPersonPageAdapter(supportFragmentManager, 2)
        vp_send_select_person.offscreenPageLimit = 2
        tl_send_select_person_tabbar.setupWithViewPager(vp_send_select_person)

        val navCategoryMainLayout: View = (this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
            .inflate(R.layout.fragment_send_select_person_tabbar, null, false)
        tl_send_select_person_tabbar.getTabAt(0)!!.customView = navCategoryMainLayout.
            findViewById(R.id.rl_tabbar_send_select_person) as RelativeLayout
        tl_send_select_person_tabbar.getTabAt(1)!!.customView = navCategoryMainLayout.
            findViewById(R.id.rl_tabbar_send_select_group) as RelativeLayout

    }
}

