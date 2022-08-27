package com.example.breakfast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.breakfast.adapters.alphaadapter
import com.example.breakfast.mode.Charitem

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var charItem: ArrayList<Charitem>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var alphaAdapters: alphaadapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        charItem = ArrayList()
        charItem = setAlphas()
        alphaAdapters = alphaadapter(applicationContext, charItem!!)
        recyclerView?.adapter = alphaAdapters

    }

    private fun setAlphas(): ArrayList<Charitem> {

        var arrayList: ArrayList<Charitem> = ArrayList()

        arrayList.add(Charitem(R.drawable.eggs, "egg:70 cal,6g protein,1g carb"))

        arrayList.add(Charitem(R.drawable.avocado, "avocado toast:257cal,6.9g protein,16g fat"))
        arrayList.add(Charitem(R.drawable.chia, "chia seed pudding:175cal,6g protein,11g fat,15.1g carbs,10g fiber"))
        arrayList.add(Charitem(R.drawable.yogurt, "Greek yogurt:121cal,16g protein,0.8g fat,1.6g fiber,13.5g carbs"))
        arrayList.add(Charitem(R.drawable.brancereal, "Wheat bran cereal:92 cal,3g protein,23carb,0.7fat"))
        arrayList.add(Charitem(R.drawable.cheese, "cheese and nut bowl:191cal,9g protein,9.5g fat"))

        return arrayList
    }

}