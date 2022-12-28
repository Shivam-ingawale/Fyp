package com.lasteyestudios.fyp.tabs.current

import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.lasteyestudios.fyp.R
import com.lasteyestudios.fyp.databinding.IpoCompanyItemBinding
import com.lasteyestudios.fyp.databinding.MedicineListItemBinding

import com.lasteyestudios.fyp.utils.CURRENT_FRAGMENT_HORIZONTAL

class ItemRecyclerAdapter(
    private val context: Context,
    private val onItemClicked: (searchId: String) -> Unit,
    private val from: String?,
) :
    ListAdapter<String?, ItemRecyclerAdapter.ItemAdapterViewHolder>(HomeAdapterDiffCallback) {

    object HomeAdapterDiffCallback : DiffUtil.ItemCallback<String?>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

    }


    inner class ItemAdapterViewHolder(private val binding: MedicineListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String?) {

//            if (from == CURRENT_FRAGMENT_HORIZONTAL) {
//                val totalWidth: Int = Resources.getSystem().displayMetrics.widthPixels
//                val itemWidth = (totalWidth * 0.90) / 2
//                val itemHeight = (itemWidth * 16.0) / 9
//                val x = (itemHeight).toInt()
////                binding.root.layoutParams.height = x
//                binding.root.layoutParams.width = itemWidth.toInt()
//            }

            item?.let {
                binding.companyName.text = it
                binding.companyName.isSelected = true
                binding.ipoCard.setOnClickListener { _ ->
                    onItemClicked(it)
                }
            }
//                Glide.with(binding.logoImage.context).load(it.logoUrl).centerCrop().transition(
//                    DrawableTransitionOptions.withCrossFade(300)).into(binding.logoImage)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapterViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .let { inflater -> MedicineListItemBinding.inflate(inflater, parent, false) }
        return ItemAdapterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemAdapterViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}