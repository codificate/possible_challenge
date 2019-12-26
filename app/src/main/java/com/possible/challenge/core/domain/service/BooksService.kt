package com.possible.challenge.core.domain.service

import com.possible.challenge.core.domain.model.Book
import io.reactivex.Single

interface BooksService {
    fun fetch(): Single<List<Book>>
}