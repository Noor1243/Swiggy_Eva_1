package com.example.swiggy_app_bcsf21m004


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.swiggy_app_bcsf21m004.adapters.ProductAdapter
import com.example.swiggy_app_bcsf21m004.model.Product

class InstamartActivity : AppCompatActivity() {

    private lateinit var productRecyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    private val productList = mutableListOf<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.instamart)

        // Initialize RecyclerView and Adapter
        productRecyclerView = findViewById(R.id.productRecyclerView)
        productRecyclerView.layoutManager = LinearLayoutManager(this)
        productAdapter = ProductAdapter(productList) { product ->
            // Handle add to cart action
            Toast.makeText(this, "${product.name} added to cart", Toast.LENGTH_SHORT).show()
        }
        productRecyclerView.adapter = productAdapter

        // Load some sample products
        loadProducts()
    }

    private fun loadProducts() {
        // Adding sample products to list
        productList.add(Product("Banana", 100.0, R.drawable.instamart_hori_1))
        productList.add(Product("Biscuit", 50.0, R.drawable.instamart_hori_3))
        productList.add(Product("Potatoes", 75.0, R.drawable.instamart_hori_12))

        // Notify adapter of data change
        productAdapter.notifyDataSetChanged()
    }
}
