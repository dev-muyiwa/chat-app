package com.devmuyiwa.chatapp.presentation.fragment.viewPager.pagerItem.chats

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devmuyiwa.chatapp.databinding.FragmentChatsBinding
import com.devmuyiwa.chatapp.domain.model.pager.chats.Chat

class ChatsFragment : Fragment() {
    private var _binding: FragmentChatsBinding? = null
    private val binding get() = _binding!!
    private val chatsAdapter by lazy{ChatsAdapter()}
    private val listOfChats: ArrayList<Chat> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentChatsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listOfChats.add(Chat("UI838", "https://muyiwawritecodes.com", "Muyiwa", "12/08/2022", "We" +
                " balllin' hard" ))
        chatsAdapter.setData(listOfChats as List<Chat>)
        binding.chatsRecyclerView.adapter = chatsAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}