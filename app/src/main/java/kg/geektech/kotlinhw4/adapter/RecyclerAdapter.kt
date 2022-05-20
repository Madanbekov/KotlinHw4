package kg.geektech.kotlinhw4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.geektech.kotlinhw4.R
import kg.geektech.kotlinhw4.databinding.ItemRecBinding

class RecyclerAdapter(private var list: ArrayList<Int>) :
    RecyclerView.Adapter<RecyclerAdapter.Holder>() {

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemRecBinding.bind(itemView)
        fun bind(i: Int) {
            binding.tvCount.text = i.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rec, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}