package com.possible.challenge.rest.infrastructure.client

import com.possible.challenge.rest.infrastructure.representation.BookListRepresentation
import io.reactivex.Single
import retrofit2.http.GET

interface PossibleApi {

    @GET("books.json")
    fun books(): Single<List<BookListRepresentation>>
}