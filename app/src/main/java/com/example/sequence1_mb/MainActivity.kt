package com.example.sequence1_mb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.ObjectOutputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
        setContentView(R.layout.activity_main)

        val s : String = R.string.app_name.toString();
        val list : LinearLayout = findViewById(R.id.list)
        repeat(20) {
            Log.i("test","iteration")
            layoutInflater.inflate(R.layout.item,list, true)
        }
        */
        setContentView(R.layout.activity_rv)
        val list: RecyclerView = findViewById(R.id.listrv)
        val dataSet: MutableList<String> = mutableListOf<String>()
        repeat(100000) {
            dataSet.add("Title $it")
        }
        val adapter = ItemAdapter(dataSet)
        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(this)
    }

    class ItemViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        private val tv : TextView = itemView.findViewById(R.id.title)

        fun bind(title : String) {
            tv.text  = title
        }
    }

    class ItemAdapter(val dataSet: List<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            //TODO("Not yet implemented")
            val inflater : LayoutInflater = LayoutInflater.from(parent.context)
            val itemView = inflater.inflate(R.layout.item,parent,false)
            return ItemViewHolder(itemView)
        }

        override fun getItemCount(): Int {
            return dataSet.size
            //TODO("Not yet implemented")
            // Indique combien d'éléments afficher
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            //TODO("Not yet implemented")
            val title : String = dataSet[position]
            (holder as ItemViewHolder).bind(title)
        }


    }

}

