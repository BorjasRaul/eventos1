package com.example.eventos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()  {

    //hola
    private val itemImages1 = intArrayOf(
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6
    )
    private val itemTitles = arrayOf("Basílica de Guadalupe", "Iglesia de nuestra señora de Fátima","Iglesia del Sagrado Corazón de Jesús")
    private val itemDetails = arrayOf("Misa dominical vespertina", "Exposición del Santísimo", "El Santo Rosario")
    private val itemImages = intArrayOf(
        R.drawable.guadalupe,
        R.drawable.fatima,
        R.drawable.sagrado
    )


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var image1 : ImageView
        var image : ImageView
        var textTitle : TextView
        var textdes : TextView

        init {
            image1 = itemView.findViewById(R.id.imgChurch)
            image = itemView.findViewById(R.id.item_image)
            textTitle = itemView.findViewById(R.id.item_title)
            textdes = itemView.findViewById(R.id.item_details)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_model,parent,false)
        return ViewHolder(v)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image1.setImageResource(itemImages1[position])
        holder.image1.setOnClickListener {v: View ->
            Toast.makeText(v.context, "Clicked on the item", Toast.LENGTH_SHORT).show()
        }
        holder.textTitle.text = itemTitles[position]
        holder.textdes.text = itemDetails[position]
        holder.image.setImageResource(itemImages[position])
        holder.itemView.setOnClickListener {v: View ->
            Toast.makeText(v.context, "Clicked on the item", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return itemTitles.size
    }

}