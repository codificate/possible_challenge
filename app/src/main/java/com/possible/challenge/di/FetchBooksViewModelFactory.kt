package com.possible.challenge.di

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.possible.challenge.presentation.FetchBooksViewModel

class FetchBooksViewModelFactory(private val context: Context): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FetchBooksViewModel(PossibleBooksServiceFactory.providePossibleBooksService()) as T
    }

}