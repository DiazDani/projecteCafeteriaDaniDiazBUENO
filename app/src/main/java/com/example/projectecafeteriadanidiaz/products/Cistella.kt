package com.example.projectecafeteriadanidiaz.products

object Cistella {
    val selectedProducts = mutableListOf<Product>()

    fun addToCart(product: Product) {
        selectedProducts.add(product)
    }

    fun getCartProducts(): List<Product> {
        return selectedProducts.toList()
    }
    fun getTotal(): Float {
        var total = 0f
        for (product in selectedProducts) {
            total += product.price
        }
        return total
    }
    fun clearCart() {
        selectedProducts.clear()
    }

}