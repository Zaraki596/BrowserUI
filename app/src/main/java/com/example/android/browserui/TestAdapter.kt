package com.example.android.browserui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_test_items.view.*

class TestAdapter(val items : ArrayList<String>, val context: Context) :
    RecyclerView.Adapter<TestAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName = view.tv_test
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.rv_test_items, parent, false))

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: TestAdapter.ViewHolder, position: Int) {
        holder?.tvName?.text = items.get(position)
    }
}


