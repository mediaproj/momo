package com.mediaproj.momo.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mediaproj.momo.R
import kotlinx.android.synthetic.main.activity_information.*

class InformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        //리사이클러뷰의 아이템을 클릭했을 때 액티비이 이동
        iv_main_information.setOnClickListener{
            val intent = Intent(this, SendSelectPersonActivity::class.java)
            startActivity(intent)
        }
    }
}
