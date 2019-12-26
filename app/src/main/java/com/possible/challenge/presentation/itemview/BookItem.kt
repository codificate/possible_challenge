package com.possible.challenge.presentation.itemview

import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import com.possible.challenge.R
import kotlinx.android.synthetic.main.book_item.view.*

class BookItem(context: Context) : LinearLayout(context){

    init {
        LayoutInflater.from(context).inflate(R.layout.book_item, this, true)
    }

    fun setAuthor(authorText: String){
        author.text = authorText
    }

    fun setTitle(titleText: String){
        title.text = titleText
    }

    fun setImageBook(imageBookUrl: String){
        Glide.with(context)
            .load(imageBookUrl)
            .into(imageView)
    }

}