package com.possible.challenge.presentation.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.possible.challenge.core.domain.model.Book
import com.possible.challenge.presentation.itemview.BookItem

class BookListAdapter(val books: List<Book>) : RecyclerView.Adapter<BookListViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookListViewHolder {
        return BookListViewHolder(createBookItemView(parent))
    }

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: BookListViewHolder, position: Int) {
        holder.bind(books[position])
    }

    private fun createBookItemView(parent: ViewGroup): BookItem {
        return BookItem(parent.context)
    }

}