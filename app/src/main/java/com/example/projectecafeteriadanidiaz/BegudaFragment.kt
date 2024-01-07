package com.example.projectecafeteriadanidiaz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectecafeteriadanidiaz.databinding.FragmentBegudaBinding
import com.example.projectecafeteriadanidiaz.products.ProductProvider
import com.example.projectecafeteriadanidiaz.products.adapter.ProductAdapter

class BegudaFragment : Fragment() {

    private lateinit var binding: FragmentBegudaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBegudaBinding.inflate(inflater, container, false)
        initRecyclerView()
        return binding.root
    }

    private fun initRecyclerView() {
        val recyclerView = binding.drinks
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val begudaProducts = ProductProvider.getBegudaProducts()
        recyclerView.adapter = ProductAdapter(begudaProducts)
    }
}
