package com.devmuyiwa.chatapp.presentation.main.fragment.viewPager

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.devmuyiwa.chatapp.presentation.main.fragment.viewPager.pagerItem.calls.CallsFragment
import com.devmuyiwa.chatapp.presentation.main.fragment.viewPager.pagerItem.chats.ChatsFragment
import com.devmuyiwa.chatapp.presentation.main.fragment.viewPager.pagerItem.status.StatusFragment

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ChatsFragment()
            1 -> StatusFragment()
            2 -> CallsFragment()
            else -> ChatsFragment()
        }

    }
}