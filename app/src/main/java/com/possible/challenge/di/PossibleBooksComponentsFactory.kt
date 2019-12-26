package com.possible.challenge.di

import com.possible.challenge.infrastructure.PossibleBooksService

object PossibleBooksComponentsFactory {

    fun providePossibleBooksService(): PossibleBooksService {
        return PossibleBooksService(PossibleApiFactory.provideApi())
    }

}