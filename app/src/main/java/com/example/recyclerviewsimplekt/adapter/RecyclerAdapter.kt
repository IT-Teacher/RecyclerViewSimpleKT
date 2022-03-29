package com.example.recyclerviewsimplekt.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsimplekt.R

class RecyclerAdapter(var foods: IntArray?) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
        return foods?.size ?: 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_iteam, parent, false)
        return MemeberViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val food = foods!![position]
        if (holder is MemeberViewHolder) {
            val icon = holder.icon
            icon.setImageResource(foods!![position])
        }
    }

    inner class MemeberViewHolder(var view: View) : RecyclerView.ViewHolder(
        view
    ) {
        var icon: ImageView

        init {
            icon = view.findViewById(R.id.icon)
        }
    }
}
