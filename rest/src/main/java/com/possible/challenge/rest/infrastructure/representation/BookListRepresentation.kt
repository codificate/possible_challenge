package com.possible.challenge.rest.infrastructure.representation

import com.google.gson.annotations.SerializedName

data class BookListRepresentation(
    @SerializedName("author") val author: String,
    @SerializedName("imageURL") val imageURL: String,
    @SerializedName("title") val title: String
)