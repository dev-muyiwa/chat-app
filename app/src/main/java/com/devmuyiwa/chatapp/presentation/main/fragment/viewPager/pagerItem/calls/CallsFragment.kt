package com.devmuyiwa.chatapp.presentation.main.fragment.viewPager.pagerItem.calls

import android.os.Bundle
import android.view.*
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.devmuyiwa.chatapp.R
import com.devmuyiwa.chatapp.databinding.FragmentCallsBinding
import com.devmuyiwa.chatapp.domain.model.pager.calls.Call

class CallsFragment : Fragment() {
    private var _binding: FragmentCallsBinding? = null
    private val binding get() = _binding!!
    private val callsAdapter by lazy { CallsAdapter() }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentCallsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listOfCalls: ArrayList<Call> = ArrayList()
        listOfCalls.add(Call("UID929",
            R.drawable.dummy_image, "Muyiwa", "in",
            "August 5, 12:24 AM"))
        callsAdapter.setData(listOfCalls as List<Call>)
        ViewCompat.setNestedScrollingEnabled(binding.callsRecyclerView, false)
        binding.callsRecyclerView.apply{
            adapter = callsAdapter
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,
                false)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}