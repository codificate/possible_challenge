package com.possible.challenge.presentation

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.possible.challenge.core.domain.model.Book
import com.possible.challenge.infrastructure.PossibleBooksService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class FetchBooksViewModel(private val booksService : PossibleBooksService) {

    private val subscriptions = CompositeDisposable()
    private val mutableBookList = MutableLiveData<List<Book>>()
    val bookList = mutableBookList

    fun onViewCreated(){
        booksService.fetch()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe( { onFetchSuccessful(it) }, { Log.e("search-track", it.message) })
            .also { subscriptions.add(it) }
    }

    private fun onFetchSuccessful(books: List<Book>) {
        mutableBookList.postValue(books)
    }

}