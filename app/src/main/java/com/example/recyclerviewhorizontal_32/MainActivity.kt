package com.example.recyclerviewhorizontal_32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var foodList: ArrayList<Food>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)

        val snapHelper: SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)

        foodList = ArrayList()
        addDataToList()

        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter
    }

    private fun addDataToList(){
        foodList.add(Food(R.drawable.dosa, "Dosa"))
        foodList.add(Food(R.drawable.biryani, "Biryani"))
        foodList.add(Food(R.drawable.noodles, "Noodles"))
        foodList.add(Food(R.drawable.paneer_masala,"Paneer Masala"))
        foodList.add(Food(R.drawable.pasta, "Pasta"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.plov, "Plov"))
        foodList.add(Food(R.drawable.barbecue, "Barbecue"))
    }
}