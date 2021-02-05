package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.widget.ListView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item = Array(20,{ i -> "$i + list" })

        val listview:ListView=findViewById(R.id.listView)
        listview.adapter = HBaseAdapter(this,item)
    }
}