package com.dkgtech.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dkgtech.viewpager.Fragments.CallsFragment
import com.dkgtech.viewpager.Fragments.ChatFragment
import com.dkgtech.viewpager.Fragments.StatusFragment

class ViewPagerAdapter(val fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3 // no. of tabs
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                ChatFragment()
            }

            1 -> {
                CallsFragment()
            }

            else -> StatusFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> {
                "Chats"
            }

            1 -> {
                "Calls"
            }

            else -> "Status"
        }
    }
}