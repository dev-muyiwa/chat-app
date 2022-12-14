package com.devmuyiwa.chatapp.presentation.main.fragment.viewPager

import android.content.res.Resources
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.devmuyiwa.chatapp.R
import com.devmuyiwa.chatapp.databinding.FragmentViewPagerBinding
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerFragment : Fragment() {
    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pagerAdapter = ViewPagerAdapter(this@ViewPagerFragment)
        binding.viewPager.adapter = pagerAdapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, index ->
            when (index) {
                0 -> {
                    tab.text = getString(R.string.tab_chats)
                }
                1 -> {
                    tab.text = getString(R.string.tab_status)
                }
                2 -> {
                    tab.text = getString(R.string.tab_calls)
                }
                else -> throw Resources.NotFoundException("Position Not Found")
            }
        }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}