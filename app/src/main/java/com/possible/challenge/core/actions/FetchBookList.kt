package com.possible.challenge.core.actions

import com.possible.challenge.core.domain.model.Book
import com.possible.challenge.core.domain.service.BooksService
import io.reactivex.Single

class FetchBookList(private val booksService: BooksService) {
    operator fun invoke(): Single<List<Book>> {
        return booksService.fetch()
    }
}