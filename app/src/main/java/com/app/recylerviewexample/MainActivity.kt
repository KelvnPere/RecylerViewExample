package com.app.recylerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView:RecyclerView
    lateinit var adapterMain: RecyclerViewAdapter
    lateinit var arrayList: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)


        arrayList = arrayListOf()    // []
//        arrayList.add("Life is good")  // ["Life is good"]
//        arrayList.add("Life is bad")   // ["Life is good", "Life is bad"]
//        arrayList.add("Life is 1")
//        arrayList.add("Life is 2")
//        arrayList.add("Life is 3")
//        arrayList.add("Life is 4")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")
//        arrayList.add("Life is 5")


//
        adapterMain = RecyclerViewAdapter(arrayList)
        recyclerView.adapter = adapterMain
        recyclerView.layoutManager = LinearLayoutManager(this)
    }


}