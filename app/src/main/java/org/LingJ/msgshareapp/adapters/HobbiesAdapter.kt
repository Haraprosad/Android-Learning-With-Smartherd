package org.LingJ.msgshareapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*
import org.LingJ.msgshareapp.R

class HobbiesAdapter(private val context: Context,private val hobbies:Array<String>):RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {


              return hobbies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val hobby = hobbies[position]
        holder.setData(hobby)
    }

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        fun setData(h: String){
itemView.txv_title.text = h
        }
    }
}