package com.example.projectecafeteriadanidiaz.products.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.projectecafeteriadanidiaz.R
import com.example.projectecafeteriadanidiaz.products.Cistella
import com.example.projectecafeteriadanidiaz.products.Product

class ProductAdapter(private val productList: List<Product>) : RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return ProductViewHolder(layoutInflater.inflate(R.layout.item_product,  parent,false))
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {

        val item= productList[position]
        holder.render(item)

        holder.itemView.setOnClickListener {
            Cistella.addToCart(item)
            val toastMessage = "Afegit a la cistella: ${item.name}"
            Toast.makeText(holder.itemView.context, toastMessage, Toast.LENGTH_SHORT).show()
        }
    }
}