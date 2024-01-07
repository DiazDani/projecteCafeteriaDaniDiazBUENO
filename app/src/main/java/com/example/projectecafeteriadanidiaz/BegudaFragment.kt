package com.example.projectecafeteriadanidiaz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectecafeteriadanidiaz.databinding.ActivityRegisterBinding
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
        return inflater.inflate(R.layout.fragment_beguda, container, false)

        binding= FragmentBegudaBinding.inflate(inflater)
        binding.root
        initRecyclerView()
    }

    private fun initRecyclerView(){
        val recyclerView =binding.root.findViewById<RecyclerView>(R.id.drinks)
        recyclerView.layoutManager=LinearLayoutManager(requireContext())
        recyclerView.adapter= ProductAdapter(ProductProvider.products)
    }

}