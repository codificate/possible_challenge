package com.possible.challenge.di

import com.possible.challenge.rest.BuildConfig
import com.possible.challenge.rest.RestModule
import com.possible.challenge.rest.infrastructure.client.PossibleApi

object PossibleApiFactory {

    fun provideApi(): PossibleApi{
        return RestModule.createApi(PossibleApi::class.java,
            BuildConfig.BASE_URL)
    }

}