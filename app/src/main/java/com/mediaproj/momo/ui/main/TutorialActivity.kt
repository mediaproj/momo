//package com.mediaproj.momo.ui.main
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import androidx.appcompat.app.AppCompatActivity
//import androidx.fragment.app.FragmentPagerAdapter
//import me.relex.circleindicator.CircleIndicator
//
//class TutorialActivity: AppCompatActivity() {
//    var adapterViewPager: FragmentPagerAdapter? = null
//    protected fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        //슬라이더
//        val vpPager: ViewPager = findViewById(R.id.vpPager) as ViewPager
//        adapterViewPager = MainActivity.MyPagerAdapter(getSupportFragmentManager())
//        vpPager.setAdapter(adapterViewPager)
//        val indicator = findViewById(R.id.indicator) as CircleIndicator
//        indicator.setViewPager(vpPager)
//        val startButton: Button = findViewById(R.id.mainStartButton)
//        startButton.setOnClickListener {
//            val loginIntent = Intent(this@MainActivity, LoginActivity::class.java)
//            this@MainActivity.startActivity(loginIntent)
//        }
//    }
//
//    class MyPagerAdapter(fragmentManager: FragmentManager?) :
//        FragmentPagerAdapter(fragmentManager) {
//        // Returns total number of pages
//        val count: Int
//            get() = MainActivity.MyPagerAdapter.Companion.NUM_ITEMS
//
//        // Returns the fragment to display for that page
//        fun getItem(position: Int): Fragment? {
//            return when (position) {
//                0 -> FirstFragment.newInstance(0, "Page # 1")
//                1 -> SecondFragment.newInstance(1, "Page # 2")
//                2 -> ThirdFragment.newInstance(2, "Page # 3")
//                3 -> fourthFragment.newInstance(3, "Page # 4")
//                else -> null
//            }
//        }
//
//        // Returns the page title for the top indicator
//        fun getPageTitle(position: Int): CharSequence {
//            return "Page $position"
//        }
//
//        companion object {
//            private const val NUM_ITEMS = 4
//        }
//    }
//}
//4