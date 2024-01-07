package com.example.projectecafeteriadanidiaz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectecafeteriadanidiaz.databinding.FragmentMenjarBinding
import com.example.projectecafeteriadanidiaz.products.ProductProvider
import com.example.projectecafeteriadanidiaz.products.adapter.ProductAdapter

class MenjarFragment : Fragment() {

    private lateinit var binding: FragmentMenjarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
     binding= FragmentMenjarBinding.inflate(inflater, container, false)
        initRecyclerView()
        return binding.root
    }
    private fun initRecyclerView() {
        val recyclerView = binding.food
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val mennjarProducts = ProductProvider.getMenjarProducts()
        recyclerView.adapter = ProductAdapter(mennjarProducts)
    }

}