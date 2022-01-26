package com.lasteyestudios.ipoalerts.tabs.current

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.lasteyestudios.ipoalerts.data.models.ipolistingmodel.Company
import com.lasteyestudios.ipoalerts.databinding.IpoMainItemBinding
import com.lasteyestudios.ipoalerts.tabs.current.BlockRecyclerAdapter.BlockAdapterViewHolder

class BlockRecyclerAdapter(
    private val context:Context,
    private val onItemClicked: (searchId: String, growwShortName: String) -> Unit,
    private val onBlockClicked: (ipoCategory: String) -> Unit,
    private val deleteWatchlistCompany: (growwShortName: String) -> Unit,
    private val addWatchlistCompany: (company: Company) -> Unit,
) :
    ListAdapter<List<Company?>, BlockAdapterViewHolder>(HomeAdapterDiffCallback) {

    private val value = listOf("Active", "Upcoming", "Listed", "Closed")
//(mCompantListing?.ACTIVE,
//                        mCompantListing?.UPCOMING,
//                        mCompantListing?.LISTED,
//                        mCompantListing?.CLOSED)
    object HomeAdapterDiffCallback : DiffUtil.ItemCallback<List<Company?>>() {
        override fun areItemsTheSame(
            oldItem:
            List<Company?>,
            newItem:
            List<Company?>,
        ): Boolean {
            return false
        }

        override fun areContentsTheSame(
            oldItem:
            List<Company?>,
            newItem:
            List<Company?>,
        ): Boolean {
            return oldItem == newItem
        }

    }

    inner class BlockAdapterViewHolder(private val binding: IpoMainItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val myAdapter = ItemRecyclerAdapter(context,  {searchId, growwShortName->
            onItemClicked(searchId, growwShortName)
        },{deleteGrowwShortName->
            deleteWatchlistCompany(deleteGrowwShortName)
        },{add->
            addWatchlistCompany(add)
        })

        fun bind(item: List<Company?>, position: Int) {

            if (!item.isNullOrEmpty()) {
                binding.noDataAvailable.visibility = View.GONE
                myAdapter.submitList(item)
            }else{
                binding.noDataAvailable.visibility = View.VISIBLE
            }

            binding.ipoCategoryContainer.setOnClickListener {
                onBlockClicked(value[position])
            }

            binding.companyRecycler.isNestedScrollingEnabled = false

            binding.companyRecycler.adapter = myAdapter
//            if (item[0]?.status != "") {
            binding.ipoCategory.text = value[position]
//            } else {
//                binding.ipoCategory.text = item[1]?.status ?: ""
//            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): BlockAdapterViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .let { inflater -> IpoMainItemBinding.inflate(inflater, parent, false) }
        return BlockAdapterViewHolder(itemView)
    }

    override fun onBindViewHolder(
        holder: BlockAdapterViewHolder,
        position: Int,
    ) {
        holder.bind(getItem(position), position)
    }
}