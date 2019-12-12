package edu.iu.com.example.meds

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_source.view.*

class MainAdapter(val homeFeed: HomeFeed): RecyclerView.Adapter<CustomViewHolder>() {
    val titles = listOf("First", "Second", "Third","Fourth", "Fifth", "Sixth")

    override fun getItemCount(): Int {
        return homeFeed.results.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.list_source, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val lists = homeFeed.results.get(position)
        holder?.view?.textView?.text = lists.image

        val thumbnailImageView = holder?.view?.imageView2
        Picasso.with(holder?.view?.context).load(lists.image).into(thumbnailImageView)
    }



}

  class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}