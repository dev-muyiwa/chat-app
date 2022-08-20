package com.devmuyiwa.chatapp.presentation.fragment.newCall

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devmuyiwa.chatapp.R
import com.devmuyiwa.chatapp.databinding.FragmentNewCallBinding

class NewCallFragment : Fragment() {
    private var _binding: FragmentNewCallBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentNewCallBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}