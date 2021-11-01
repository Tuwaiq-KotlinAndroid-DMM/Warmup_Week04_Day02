package com.example.myapplicationcarhw

class classcaradpter {
}
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CarAdapter (var data:MutableList<classcar>):RecyclerView.Adapter<CarHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.car_list,parent,false)
        return CarHolder(v)
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        holder.carName.text = data[position].name
        holder.carPrice.text = "Price: "+data[position].price.toString()
        holder.carYear.text = "Year: "+data[position].year.toString()
        Picasso.get().load(data[position].imagURL).into(holder.carImage)

    }

    override fun getItemCount(): Int {
        return data.size
    }


}
class CarHolder(v: View):RecyclerView.ViewHolder(v){
    var carName = v.findViewById<TextView>(R.id.carName)
    var carYear = v.findViewById<TextView>(R.id.carYear)
    var carPrice = v.findViewById<TextView>(R.id.carPrice)
    var carImage = v.findViewById<ImageView>(R.id.carImage)