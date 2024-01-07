package com.example.projectecafeteriadanidiaz.products

import android.provider.ContactsContract.DisplayPhoto

data class Product(
    val name: String,
    val desc: String,
    val type: String,
    val price: Float,
    val photo: String
)
