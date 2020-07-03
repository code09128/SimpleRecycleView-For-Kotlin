package com.drs24.kotlinrecycleviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.drs24.kotlinrecycleviewdemo.Adapter.Adapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listData = ArrayList<String>()
        for (i in 0..99) {
            listData.add(i.toString())
        }

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        dataList.layoutManager = layoutManager

        dataList.adapter = Adapter(listData)
    }
}