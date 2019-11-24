package com.mediaproj.momo.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class NoticePageAdapter (fm: FragmentManager, private val num_fragment: Int): FragmentStatePagerAdapter(fm,FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){


    override fun getItem(p0: Int): Fragment {
        return when (p0) {
            0 -> NoticeResponceFragment()
            1 -> NoticeRequestFragment()
            else -> throw IllegalArgumentException("해당 인덱스에 프라그먼트는 없습니다")
        }
    }

    override fun getCount(): Int {
        return num_fragment
    }
}