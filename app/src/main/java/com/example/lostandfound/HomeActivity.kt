package com.example.lostandfound

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lostandfound.databinding.ActivityHomeBinding

class HomeActivity : Fragment() {

    private var _binding: ActivityHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = ActivityHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.findItemBtn.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_category)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}