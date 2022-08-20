package com.devmuyiwa.chatapp.presentation.fragment.viewPager.pagerItem.status

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.devmuyiwa.chatapp.databinding.FragmentStatusBinding

class StatusFragment : Fragment() {
    private var _binding: FragmentStatusBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentStatusBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}