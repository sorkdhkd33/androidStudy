package com.example.moviememberswork

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class profileAdapter(val profileList:ArrayList<profiles>):RecyclerView.Adapter<profileAdapter.CustomViewHolder>()
{
    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gender = itemView.findViewById<ImageView>(R.id.firstman) // 사진
        val labeling = itemView.findViewById<TextView>(R.id.name) //  이름
        val explain = itemView.findViewById<TextView>(R.id.firstmanex) // 사진

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): profileAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.newmembers,parent,false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return profileList.size
    }

    override fun onBindViewHolder(holder: profileAdapter.CustomViewHolder, position: Int) {
        holder.gender.setImageResource(profileList.get(position).gender)
        holder.labeling.text = profileList.get(position).labeling
        holder.explain.text = profileList.get(position).explain
    }
}
