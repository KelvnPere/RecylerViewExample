package com.app.recylerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*


class RecyclerViewAdapter(val armanilist:ArrayList<String>):RecyclerView.Adapter<RecyclerViewAdapter.ArmaniViewHolder>(){
    class ArmaniViewHolder(armaniView: View): RecyclerView.ViewHolder(armaniView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArmaniViewHolder {
        return ArmaniViewHolder((
                 LayoutInflater.from(parent.context).inflate(
                     R.layout.item_row,
                     parent,
                     false
                 )
                ))
    }

    override fun onBindViewHolder(holder: ArmaniViewHolder, position: Int) {
        val message = armanilist[position]
        holder.itemView.apply {
            text1.text = message

        }
    }

    override fun getItemCount(): Int {
        return armanilist.size
    }


}
