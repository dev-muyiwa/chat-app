package com.devmuyiwa.chatapp.presentation.main.fragment.viewPager.pagerItem.chats

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.devmuyiwa.chatapp.R
import com.devmuyiwa.chatapp.databinding.FragmentChatsBinding
import com.devmuyiwa.chatapp.domain.model.pager.chats.Chat

class ChatsFragment : Fragment() {
    private var _binding: FragmentChatsBinding? = null
    private val binding get() = _binding!!
    private val chatsAdapter by lazy{ChatsAdapter()}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentChatsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listOfChats: ArrayList<Chat> = ArrayList()
        listOfChats.add(Chat("UI838", R.drawable.dummy_image, "Muyiwa", "12/08/2022", "We" +
                " balllin' hard" ))
        chatsAdapter.setData(listOfChats as List<Chat>)
        ViewCompat.setNestedScrollingEnabled(binding.chatsRecyclerView, false)
        binding.chatsRecyclerView.apply{
            adapter = chatsAdapter
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,
                false)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}