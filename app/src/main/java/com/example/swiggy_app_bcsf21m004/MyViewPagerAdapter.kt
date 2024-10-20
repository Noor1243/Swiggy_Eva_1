package com.example.swiggy_app_bcsf21m004



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyViewPagerAdapter : RecyclerView.Adapter<MyViewPagerAdapter.ViewHolder>() {

    // Sample data for demonstration
    private val images = listOf(R.drawable.homeimage1, R.drawable.homeimage2, R.drawable.homeimage3)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(images[position])
    }

    override fun getItemCount(): Int = images.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(imageRes: Int) {
            // Bind data to your view here (e.g., set image to ImageView)
        }
    }
}
