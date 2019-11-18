package com.mediaproj.momo.ui.main


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import com.mediaproj.momo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureMainTab()

    }
        private fun configureMainTab(){
        vp_information.adapter = SectionPageAdapter(supportFragmentManager,4)
        vp_information.offscreenPageLimit = 4
            tl_main_tabbar.setupWithViewPager(vp_information)

        val navCategoryMainLayout: View = (this.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
                as LayoutInflater)
            .inflate(R.layout.fragment_main_category_tabbar, null, false)
            tl_main_tabbar.getTabAt(0)!!.customView = navCategoryMainLayout.
                findViewById(R.id.rl_tabbar_movie) as RelativeLayout
            tl_main_tabbar.getTabAt(1)!!.customView = navCategoryMainLayout.
                findViewById(R.id.rl_tabbar_musical) as RelativeLayout
            tl_main_tabbar.getTabAt(2)!!.customView = navCategoryMainLayout.
                findViewById(R.id.rl_tabbar_show) as RelativeLayout
            tl_main_tabbar.getTabAt(3)!!.customView = navCategoryMainLayout.
                findViewById(R.id.rl_tabbar_festival) as RelativeLayout
        }
}
