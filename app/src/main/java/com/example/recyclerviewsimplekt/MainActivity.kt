package com.example.recyclerviewsimplekt

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsimplekt.adapter.RecyclerAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var context: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews() {
        context = this
        recyclerView = findViewById(R.id.recyc)
        recyclerView.layoutManager = GridLayoutManager(context, 3)
        val foods = intArrayOf(
            R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9,
            R.drawable.img10, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6
        )
        refreshAdapter(foods)
    }
    fun refreshAdapter(foods: IntArray?) {
        val adapter = RecyclerAdapter(foods)
        recyclerView.adapter = adapter
    }
}