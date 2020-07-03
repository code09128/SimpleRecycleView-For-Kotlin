package com.drs24.kotlinrecycleviewdemo.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.drs24.kotlinrecycleviewdemo.R

/**
 * Created by dustin0128 on 2020/6/24
 * Adpter建立建構式會自動帶入class的底下
 */
class Adapter(private var mData: List<String>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataView.text = mData[position]
        holder.itemView.setOnClickListener {
            Toast.makeText(it.context, "Item $position is clicked.", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val dataView: TextView = v.findViewById(R.id.info_text)
    }
}