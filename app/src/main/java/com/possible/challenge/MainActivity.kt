package com.possible.challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.possible.challenge.core.domain.model.Book
import com.possible.challenge.di.FetchBooksViewModelFactory
import com.possible.challenge.presentation.FetchBooksViewModel
import com.possible.challenge.presentation.recycler.BookListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel: FetchBooksViewModel by lazy {
    ViewModelProviders.of(
        this,
        FetchBooksViewModelFactory(this)
    ).get(FetchBooksViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.bookList.observe( this, Observer { showBooks(it) })
        viewModel.onViewCreated()
        possibleBookListRecycler.setHasFixedSize(false)
        possibleBookListRecycler.layoutManager = LinearLayoutManager(this)
    }

    private fun showBooks(books: List<Book>) {
        possibleBookListRecycler.adapter = BookListAdapter(books)
        possibleBookListRecycler.adapter?.notifyDataSetChanged()
    }
}
