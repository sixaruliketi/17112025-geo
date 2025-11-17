package com.example.a17112025_geo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a17112025_geo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        classicRecyclerView()
//        listAdapterInit()
    }

    lateinit var recyclerAdapter : RecyclerViewAdapter

    fun classicRecyclerView() = with(binding) {
        recyclerAdapter = RecyclerViewAdapter(getData())
        myRecyclerView.adapter = recyclerAdapter
        myRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
    }

    fun getData(): List<Candidate>{
        val candidateList = listOf(
            Candidate("","name1"),
            Candidate("","name2","this is details 1"),
            Candidate("","name1"),
            Candidate("","name2","this is details 1"),
            Candidate("","name1"),
            Candidate("","name2","this is details 1"),
            Candidate("","name1"),
            Candidate("","name2","this is details 1"),
            Candidate("","name1"),
            Candidate("","name2","this is details 1"),
            Candidate("","name1"),
            Candidate("","name2","this is details 1"),
            Candidate("","name1"),
            Candidate("","name2","this is details 1"),
            Candidate("","name1"),
            Candidate("","name2","this is details 1"),
        )
        return candidateList
    }


    fun listAdapterInit() = with(binding){
        val adapter = RecyclerViewListAdapter()
        myRecyclerView.adapter = adapter
        myRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL,false)

        adapter.submitList(getData())
    }

}