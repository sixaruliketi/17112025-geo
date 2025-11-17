package com.example.a17112025_geo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.a17112025_geo.databinding.ListItemBinding

class RecyclerViewListAdapter : ListAdapter<Candidate, RecyclerViewListAdapter.ListViewHolder>(
    DiffUtils()
) {

    class ListViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ListItemBinding.bind(view)
        fun bind(item : Candidate) = with(binding){
            candidateName.text = item.name
            candidateDetails.text = item.details
        }
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ListViewHolder(view)
    }

    class DiffUtils : DiffUtil.ItemCallback<Candidate>(){
        override fun areItemsTheSame(oldItem: Candidate, newItem: Candidate): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Candidate, newItem: Candidate): Boolean {
            return oldItem == newItem
        }

    }

}