package com.example.sequence1_mb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s : String = R.string.app_name.toString();
        val list : LinearLayout = findViewById(R.id.list)
        repeat(20) {
            Log.i("test","iteration")
            layoutInflater.inflate(R.layout.item,list, true)
        }


    }
}
