package com.example.projectecafeteriadanidiaz.products.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.projectecafeteriadanidiaz.R

import com.example.projectecafeteriadanidiaz.products.Product

class ProductViewHolder(view: View): ViewHolder(view) {


    val productName = view.findViewById<TextView>(R.id.name)
    val productDesc = view.findViewById<TextView>(R.id.desc)
    val productPrice = view.findViewById<TextView>(R.id.price)
    val productPhoto = view.findViewById<ImageView>(R.id.image)
    fun render(productModel:Product){
        productName.text=productModel.name
        productDesc.text=productModel.desc

    }
}