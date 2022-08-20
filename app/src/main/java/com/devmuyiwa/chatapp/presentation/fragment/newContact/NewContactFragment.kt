package com.devmuyiwa.chatapp.presentation.fragment.newContact

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.devmuyiwa.chatapp.databinding.FragmentNewContactBinding

class NewContactFragment : Fragment() {
    private var _binding: FragmentNewContactBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentNewContactBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}