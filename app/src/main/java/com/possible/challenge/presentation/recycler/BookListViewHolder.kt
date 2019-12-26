package com.possible.challenge.presentation.recycler

import androidx.recyclerview.widget.RecyclerView
import com.possible.challenge.core.domain.model.Book
import com.possible.challenge.presentation.itemview.BookItem

class BookListViewHolder(private val bookItemView: BookItem) : RecyclerView.ViewHolder(bookItemView) {
    fun bind(book: Book){
        bookItemView.setAuthor(book.author!!)
        bookItemView.setTitle(book.title!!)
        if (book.imageURL!=null){
            bookItemView.setImageBook(book.imageURL)
        }
    }
}
