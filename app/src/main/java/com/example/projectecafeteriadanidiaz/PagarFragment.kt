package com.example.projectecafeteriadanidiaz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectecafeteriadanidiaz.databinding.FragmentPagarBinding
import com.example.projectecafeteriadanidiaz.products.Cistella
import com.example.projectecafeteriadanidiaz.products.adapter.ProductAdapter


class PagarFragment : Fragment() {

    private lateinit var binding: FragmentPagarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPagarBinding.inflate(inflater, container, false)
        initRecyclerView()
        displayTotal()
        val buyButton = binding.buyButton
        buyButton.setOnClickListener {

            Toast.makeText(requireContext(), "Compra realtizada", Toast.LENGTH_SHORT).show()

            Cistella.clearCart()

            initRecyclerView()
            displayTotal()
        }

        return binding.root
    }
    private fun initRecyclerView() {
        val recyclerView = binding.payment
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val cartProducts = Cistella.getCartProducts()

        recyclerView.adapter = ProductAdapter(cartProducts)
    }

    private fun displayTotal() {
        val totalTextView = binding.finalPrice

        val total = Cistella.getTotal()
        totalTextView.text = String.format("Total: $%.2f", total)
    }

}