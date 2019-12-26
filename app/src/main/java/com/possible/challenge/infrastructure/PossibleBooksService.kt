package com.possible.challenge.infrastructure

import com.possible.challenge.core.domain.model.Book
import com.possible.challenge.core.domain.service.BooksService
import com.possible.challenge.rest.infrastructure.client.PossibleApi
import io.reactivex.Single

class PossibleBooksService(private val possibleApi: PossibleApi):
    BooksService {
    override fun fetch(): Single<List<Book>> {
        return possibleApi.books().map { it.map { item ->
            Book(
                item.author,
                item.imageURL,
                item.title
            )
        } }
    }

}