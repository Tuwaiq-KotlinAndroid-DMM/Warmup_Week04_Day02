package com.example.myapplicationcarhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var carlist = mutableListOf<classcar> (
            classcar("Benz", 400000.0f, 2020, "https://tse1.mm.bing.net/th?id=OIP.roZQuPk4mzOaqe-4qJJ8wQHaEo&pid=Api&rs=1&c=1&qlt=95&w=157&h=98"),
            classcar("Ferrari", 800000.0f, 2020, "https://tse1.mm.bing.net/th?id=OIP.roZQuPk4mzOaqe-4qJJ8wQHaEo&pid=Api&rs=1&c=1&qlt=95&w=157&h=98"),
            classcar("LandRover", 300000.0f, 2020, "https://tse1.mm.bing.net/th?id=OIP.roZQuPk4mzOaqe-4qJJ8wQHaEo&pid=Api&rs=1&c=1&qlt=95&w=157&h=98"),
            classcar("Audi", 350000.0f, 2020, "https://tse1.mm.bing.net/th?id=OIP.roZQuPk4mzOaqe-4qJJ8wQHaEo&pid=Api&rs=1&c=1&qlt=95&w=157&h=98"),
            classcar("jeep", 450000.0f, 1966, "https://tse1.mm.bing.net/th?id=OIP.roZQuPk4mzOaqe-4qJJ8wQHaEo&pid=Api&rs=1&c=1&qlt=95&w=157&h=98")
        )

        var cRecyclerView = findViewById<RecyclerView>(R.id.cRecyclerView)
        cRecyclerView.layoutManager = LinearLayoutManager(this)
        cRecyclerView.adapter = CarAdapter(carlist)

    }
