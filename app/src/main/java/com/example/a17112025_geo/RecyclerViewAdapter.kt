package com.example.a17112025_geo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a17112025_geo.databinding.ListItem2Binding

class RecyclerViewAdapter(val myList: List<Candidate>) : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {


    inner class MyViewHolder(view : View): RecyclerView.ViewHolder(view){
        val binding = ListItem2Binding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_2,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            val item = myList[position]
            candidateName2.text = item.name
            candidateDetails2.text = item.details

        }
    }

    override fun getItemCount(): Int {
        return myList.size
    }

}