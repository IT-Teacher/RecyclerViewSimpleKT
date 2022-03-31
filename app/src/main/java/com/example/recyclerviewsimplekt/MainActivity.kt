package com.example.recyclerviewsimplekt

import android.content.Context
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsimplekt.adapter.RecyclerAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var nestedScrollView : NestedScrollView
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
        nestedScrollView = findViewById(R.id.nest)
        recyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
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
        recyclerView.isNestedScrollingEnabled = false

    }
}